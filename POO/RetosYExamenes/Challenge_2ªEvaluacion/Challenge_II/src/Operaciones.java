import Exception.Denominador0Exception;
public interface Operaciones {
    public Racional sum(Racional otro) throws Denominador0Exception;
    public Racional res(Racional otro) throws Denominador0Exception;
    public Racional mul(Racional otro) throws Denominador0Exception;
    public Racional div(Racional otro) throws Denominador0Exception;
}
