public class Herbivoro extends Dinosaurio implements Acciones{

    public Herbivoro(String _nombre, double tamanhoEnMetro, String periodo) {
        super(_nombre, tamanhoEnMetro, periodo);
    }

    @Override
    void rugir() {
        System.out.println( getnombre() + " su rugido es Muuuu");
    }

    @Override
    public void monstrarInformacion() {
        System.out.println( "Herbívoro: " + getnombre() + ", Tamaño: "
                            + getTamanhoEnMetro() + "m, Periodo: " + getPeriodo());
    }

    @Override
    public void atraccionEstrella() {
        System.out.println("La atraccion estrella es " + getnombre());
    }
}
