public class Carnivora extends Dinosaurio implements Acciones{


    public Carnivora(String _nombre, double tamanhoEnMetro, String periodo) {
        super(_nombre, tamanhoEnMetro, periodo);
    }

    @Override
    void rugir() {
        System.out.println( getnombre() + " su rugido es Muuuu");
    }

    @Override
    public void monstrarInformacion() {
        System.out.println( "Carnivor: " + getnombre() + ", Tamaño: "
                + getTamanhoEnMetro() + "m, Periodo: " + getPeriodo());
    }

    @Override
    public void atraccionEstrella() {
        System.out.println("La atraccion estrella es " + getnombre());
    }
}
