import Constantes.Colors;
import Constantes.Enum.*;
import Type.Motor;
import Type.Rueda;

public class Main {
    public static void main(String[] args) {

        Chasis chTipoCoche = Chasis.berlina;
        Integer iTipoCoche = 8;

        Type.Color colorCoche = new Colors.Rosa();

        Type.Rueda ruedaCoche = new Rueda();

        Type.Motor myMotor = new Motor(200, 2500,70, 6, 400, Combustible.Diesel);
        Type.Motor myMoto = new Motor();

    }
}