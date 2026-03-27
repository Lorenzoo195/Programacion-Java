import java.util.ArrayList;
import java.util.List;
import Exception.ActividadInvalidaException;
public class Actividad {
    private String nombreActividad;
    private String tipoPermitido;
    private int limiteDiario;
    private List<Dinosaurio> participantes;

    public Actividad(String nombreActividad, String tipoPermitido,
                     int limiteDiario) {
        this.nombreActividad = nombreActividad;
        this.tipoPermitido = tipoPermitido;
        this.limiteDiario = limiteDiario;
        this.participantes = new ArrayList<>();
    }

    public void inscribirDinosaurio(Dinosaurio dino) throws ActividadInvalidaException {
        if(participantes.size() >= limiteDiario){
            throw new IllegalStateException("Se ha llegado al limite");
        }
        if(tipoPermitido.equalsIgnoreCase("Carnivoro") && dino instanceof Herbivoro){
            throw new ActividadInvalidaException("Un herbívoro no puede entrar a la actividad de carnívoros.");
        }
        if(tipoPermitido.equalsIgnoreCase("Hervivoro") && dino instanceof Carnivora){
            throw new ActividadInvalidaException("Un carnivoro no puede entrar a la actividad de herbivoro.");
        }
        participantes.add(dino);
    }

}
