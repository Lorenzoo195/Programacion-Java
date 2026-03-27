import Enums.TipoMovimiento;
import Tipos.Cliente;
import Tipos.IBAN;
import Tipos.Movimiento;

public class CuentaBancaria {
    private Cliente titular;
    private IBAN iban;
    private double saldo = 0.0;
    private Movimiento [] movimientos  = new Movimiento [0];

    public Cliente getTitular() {
        return titular;
    }

    private void setTitular(Cliente value) {
        this.titular = value;
    }

    public IBAN getIban() {
        return iban;
    }

    private void setIban(IBAN value) {
        this.iban = value;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double value) {
        this.saldo = value;
    }

    public Movimiento[] getMovimientos() {
        return movimientos;
    }

    private void setMovimientos(Movimiento[] value) {
        this.movimientos = value;
    }

    public CuentaBancaria(Cliente titular, IBAN iban) {
        setTitular(titular);
        setIban(iban);
    }
    public void ingreso (double cantidad){
        if( cantidad > 0){
            aumentarMovimiento(new Movimiento(cantidad,TipoMovimiento.INGRESO,this.saldo));
            this.saldo += cantidad;
        } else {
            throw new IllegalArgumentException("La cantidad debe ser mayor que 0");
        }
    }
    public boolean retirar (double cantidad){
        boolean operacionOK = false;
        if( cantidad <= 0){
            throw new IllegalArgumentException("No se puede retirar una cantidad negativa o cero");
        }
        if(this.saldo >= cantidad){
            operacionOK = true;
            aumentarMovimiento(new Movimiento(cantidad,TipoMovimiento.RETIRADA,this.saldo));
            this.saldo -= cantidad;
        }

        return operacionOK;
    }
    private void aumentarMovimiento(Movimiento nuevo) {
        int nuevaDimension = (movimientos.length <100) ? movimientos.length +1 :100;
                                   /*
                                   int newSize;
                                   if(arr.length < 100){
                                        newSize = arr.length + 1;
                                    }else{
                                        newSize = 100;
                                    }*/
        Movimiento[] arrNew = new Movimiento[nuevaDimension];
        arrNew[0] = nuevo;
        for (int i = 0; i < movimientos.length-1; i++) {
            arrNew[i+1] = movimientos[i];
        }
        movimientos = arrNew;
    }

}