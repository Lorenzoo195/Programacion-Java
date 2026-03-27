public class Cofre <T> {
    private T contenido;
    private boolean estaAbierto;

    public Cofre(T contenido) {
        this.contenido = contenido;
        this.estaAbierto = false;
    }

    public void abrir() {
        if (!estaAbierto) {
            estaAbierto = true;

            if (contenido != null) {
                if (contenido instanceof Monstruo) {
                    System.out.println("¡Cuidado! El cofre emite un gruñido... ¡Hay un Monstruo dentro!");
                } else if (contenido instanceof Guerrero || contenido instanceof Mago) {
                    System.out.println("¡Abres el cofre y encuentras a un aliado atrapado!");
                } else {
                    System.out.println("¡Has abierto el cofre y brilla un tesoro!");
                }
            } else {
                System.out.println("Abres el cofre... pero está vacío. Qué decepción.");
            }

        } else {
            System.out.println("¡El cofre ya está abierto!");
        }
    }

    public T saquear() {
        T botin = null;
        if (estaAbierto) {
            if (contenido != null) {
                botin = contenido;
                contenido = null;
                System.out.println("Has saqueado el cofre!");
            } else {
                System.out.println("Cofre vacio!");
            }
        } else {
            System.out.println("Cofre cerrado!");
        }
        return botin;
    }

}
