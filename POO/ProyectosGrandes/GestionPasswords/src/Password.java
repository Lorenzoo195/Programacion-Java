import java.util.Random;

public class Password {
    private int longitud = 8;
    private String contrasenha;

    public Password(int longitud) {
        setLongitud(longitud);
        generarPassword();
    }
    public Password() {
       generarPassword();
    }
    public int getLongitud() {
        return longitud;
    }
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    public String getContrasenha() {
        return contrasenha;
    }
    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
    }

    public void generarPassword(){
        String banco = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String pass = "";
        Random rd = new Random();
        for (int i = 0; i < this.longitud; i++) {
            int indice = rd.nextInt(banco.length());
            pass += banco.charAt(indice);
        }
        this.contrasenha = pass;
    }
    public boolean esFuerte(){
        boolean bRet = false;
        int contMayus= 0;
        int contMin= 0;
        int contNum= 0;
        for(int i = 0;i< this.longitud;i++){
            char letras = this.contrasenha.charAt(i);
            if(Character.isUpperCase(letras)){
                contMayus++;
            } else if (Character.isLowerCase(letras)) {
                contMin++;
            }else{
                contNum++;
            }
        }
        if( contMayus>2 && contMin >1 &&contNum >5){
            bRet=true;
        }
        return bRet;
    }
}
