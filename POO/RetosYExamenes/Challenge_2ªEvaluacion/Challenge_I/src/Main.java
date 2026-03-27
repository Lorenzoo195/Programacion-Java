
public class Main {
    public static void main(String[] args) {

        Electrodomestico[] lista = new Electrodomestico[10];
        lista[0] = new Lavadora(200, 20);
        lista[1] = new Television(400, 40);
        lista[2] = new Electrodomestico();
        lista[3] = new Lavadora(300, 30);
        lista[4] = new Television(300, 30);
        lista[5] = new Electrodomestico();
        lista[6] = new Lavadora(400, 40);
        lista[7] = new Television(200, 20);
        lista[8] = new Electrodomestico();
        lista[9] = new Lavadora(500, 50);

        double sumaElec = 0;
        double sumaLava = 0;
        double sumaTele = 0;

        System.out.println("Calculo precios");

        for(Electrodomestico elc : lista){

            if( elc != null){
                double precioUnidad = elc.precioFinal();
                System.out.println("Precio del objeto : " + precioUnidad + "€");
                sumaElec += precioUnidad;
                if( elc instanceof Lavadora){
                    sumaLava += precioUnidad;
                } else if( elc instanceof Television){
                    sumaTele += precioUnidad;
                }
            }

        }
        System.out.println("\nPrecios finales");
        System.out.println("Suma Lavadoras " +sumaLava +"€");
        System.out.println("Suma Televisores " + sumaTele + "€");
        System.out.println("Suma Electrodomesticos " + sumaElec + "€");
    }
}