import Exception.Denominador0Exception;

public class Racional implements Operaciones{
    private Numerador _numerador;
    private Denominador _denominador;


    public Numerador getnumerador() {
        return _numerador;
    }

    public void setnumerador(Numerador _numerador) {
        this._numerador = _numerador;
    }

    public Denominador getdenominador() {
        return _denominador;
    }

    public void setdenominador(Denominador _denominador) {
        this._denominador = _denominador;
    }

    public Racional(int  p, int  q) throws Denominador0Exception {
        if (q == 0) {
            throw new Denominador0Exception("El denominador no puede ser 0");
        }

        int divisor = calcularMcd(p, q);

        int pSimplificado = p / divisor;
        int qSimplificado = q / divisor;

        if (qSimplificado < 0) {
            pSimplificado = -pSimplificado;
            qSimplificado = -qSimplificado;
        }

        setnumerador(new Numerador(pSimplificado));
        setdenominador(new Denominador(qSimplificado));

    }
    public Racional(int p) throws Denominador0Exception{
        setnumerador(new Numerador(p));
        setdenominador(new Denominador(1));
    }


    public String toString() {
        return "Racional: " +
                " numerador: " + _numerador.getValor()+
                ", denominador: " + _denominador.get_valor() +
                " ==> " + _numerador.getValor() + "/" + _denominador.get_valor();
    }

    @Override
    public Racional sum(Racional otro) throws Denominador0Exception{
        int p1 = this._numerador.getValor();
        int q1 = this._denominador.get_valor();

        int p2 = otro.getnumerador().getValor();
        int q2 = otro.getdenominador().get_valor();

        int nuevoNumerador = (p1 * q2) + (q1 * p2);
        int nuevoDenominador = q1 * q2;

        return new Racional(nuevoNumerador,nuevoDenominador);
    }

    public Racional sum(Racional r1, Racional r2) throws Denominador0Exception{
        Racional primeraSum = this.sum(r1);

        return primeraSum.sum(r2);
    }

    public Racional sum(int entero) throws Denominador0Exception {
        Racional rEntero = new Racional(entero);

        return this.sum(rEntero);
    }

    @Override
    public Racional res(Racional otro) throws Denominador0Exception {
        int p1 = this._numerador.getValor();
        int q1 = this._denominador.get_valor();

        int p2 = otro.getnumerador().getValor();
        int q2 = otro.getdenominador().get_valor();

        int nuevoNumerador = (p1 * q2) - (q1 * p2);
        int nuevoDenominador = q1 * q2;
        return new Racional(nuevoNumerador,nuevoDenominador);
    }

    public Racional res(int entero) throws Denominador0Exception {
        Racional rEntero = new Racional(entero);
        return this.res(rEntero);
    }

    @Override
    public Racional mul(Racional otro) throws Denominador0Exception {
        int p1 = this._numerador.getValor();
        int q1 = this._denominador.get_valor();

        int p2 = otro.getnumerador().getValor();
        int q2 = otro.getdenominador().get_valor();

        int nuevoNumerador = (p1*p2);
        int nuevoDenominador = (q1*q2);

        return new Racional(nuevoNumerador,nuevoDenominador);
    }

    public Racional mul(Racional r1, Racional r2) throws Denominador0Exception {
        Racional primeraMultiplicacion = this.mul(r1);
        return primeraMultiplicacion.mul(r2);
    }

    public Racional mul(int entero) throws Denominador0Exception {
        Racional rEntero = new Racional(entero);
        return this.mul(rEntero);
    }

    @Override
    public Racional div(Racional otro) throws Denominador0Exception {
        int p1 = this._numerador.getValor();
        int q1 = this._denominador.get_valor();

        int p2 = otro.getnumerador().getValor();
        int q2 = otro.getdenominador().get_valor();

        int nuevoNumerador = (p1*q2);
        int nuevoDenominador = (q1*p2);

        return new Racional(nuevoNumerador,nuevoDenominador);
    }

    public Racional div(int entero) throws Denominador0Exception {
        Racional rEntero = new Racional(entero);
        return this.div(rEntero);
    }


    private int calcularMcd(int p1, int q1)  {
        p1 = Math.abs(p1);
        q1 = Math.abs(q1);
        while (q1 != 0) {
            int temporal = q1;
            q1 = p1 % q1;
            p1 = temporal;
        }
        return p1;
    }

    private void simp() throws Denominador0Exception{
        int pActual = getnumerador().getValor();
        int qActual = getdenominador().get_valor();

        int divisor = calcularMcd(pActual, qActual);

        int pSimplificado = pActual / divisor;
        int qSimplificado = qActual / divisor;

        if (qSimplificado < 0) {
            pSimplificado = -pSimplificado;
            qSimplificado = -qSimplificado;
        }

        setnumerador(new Numerador(pSimplificado));
        setdenominador(new Denominador(qSimplificado));
    }

}
