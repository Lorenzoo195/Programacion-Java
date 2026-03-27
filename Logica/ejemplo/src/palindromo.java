public class palindromo {
    public static void main(String[] args) {
        String[] texto = {"a ti no, bonita"};

        for (String p : texto) {
            boolean esPali = esPalindromo(p);

            if (esPali) {
                System.out.println("Es palindromo");
            } else {
                System.out.println("No Es palindromo");
            }
        }

    }

        public static boolean esPalindromo (String palabra){


            String textoMin = palabra.toLowerCase();
            textoMin=textoMin.replace(" ", "").replace(",","");

            int indiceInicio = 0;
            int indiceFin =textoMin.length() - 1;
            boolean btexto = true;
            while (indiceInicio < indiceFin && btexto) {
                //boolean btexto = true;
                if (textoMin.charAt(indiceInicio) != textoMin.charAt(indiceFin)) {
                    btexto =  false;
                }
                indiceInicio++;
                indiceFin--;
            }
            return btexto;
        }
}

/*
   frase = frase.replaceAll("\\s+", "");//espacio
    frase = frase.replaceAll("[?¿,.!¡]*", "");
    */