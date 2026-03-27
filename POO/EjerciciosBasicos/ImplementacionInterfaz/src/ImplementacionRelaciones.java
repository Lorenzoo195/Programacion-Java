public class ImplementacionRelaciones implements Relaciones{

    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public ImplementacionRelaciones(double valor) {
        setValor(valor);
    }

    @Override
    public boolean esIgual(Object b) {
        boolean resultado = false;
        if(b instanceof ImplementacionRelaciones ){
            ImplementacionRelaciones ir = (ImplementacionRelaciones) b;
            if (this.valor == ir.getValor()) {
                resultado = true;
            } else {
                resultado = false;
            }
        }
        return resultado;
    }

    @Override
    public boolean esMayor(Object b) {
        boolean resultado = false;
        if(b instanceof ImplementacionRelaciones){
            ImplementacionRelaciones ir = (ImplementacionRelaciones) b;
            if(this.valor > ir.getValor()){
                resultado = true;
            } else {
                resultado = false;
            }
        }
        return resultado;
    }

    @Override
    public boolean esMenor(Object b) {
        boolean resultado = false;
        if(b instanceof ImplementacionRelaciones){
            ImplementacionRelaciones ir = (ImplementacionRelaciones) b;
            if(this.valor < ir.getValor()){
                resultado = true;
            } else {
                resultado = false;
            }
        }
        return resultado;
    }
}
