import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String _nombre;
    private String _email;
    private List<String> _telefonos;



    public String getnombre() {
        return _nombre;
    }

    public void setnombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String getemail() {
        return _email;
    }

    public void setemail(String _email) {
        this._email = _email;
    }

    public Cliente(String _nombre, String _email) {
        setnombre(_nombre);
        setemail(_email);
        this._telefonos  = new ArrayList<>();

    }
    public void addTelefono(String telefono){
        if(!_telefonos.contains(telefono)) {
            _telefonos.add(telefono);
        }
    }
    public String getTelefono (int index){
        String telefonoEncontrado = "";
        if(index >= 0 && index < _telefonos.size()) {
            telefonoEncontrado =  _telefonos.get(index);
        }
        return telefonoEncontrado;
    }

    public List<String> buscarTelefono(String parteTelefono){
        List<String> encontrados = new ArrayList<>();
        for(String tel : _telefonos){
            if(tel.contains(parteTelefono)){
                encontrados.add(tel);
            }
        }
        return encontrados;
    }
}
