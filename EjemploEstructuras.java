class EjemploEstructuras {
    public static void main(String[] args) {
        int numero = 6;
        double numeroDecimal = 10.5;
        char letra = 'C';
        boolean verdadero = true;
        String mensaje= "Hola señor Java";

        if (numero > 0) {
            System.out.println("El número " + numero + " es positivo.");
        } else if (numero < 0) {
            System.out.println("El número " + numero + " es negativo.");
        } else {
            System.out.println("El número es cero.");
        }


        switch (letra) {
            case 'A':
                System.out.println("La letra es 'A' de Auto.");
                break;
            case 'B':
                System.out.println("La letra  es 'B' de Boca.");
                break;
            case 'C':
                System.out.println("La letra  es 'C' de Correr.");
                break;
            default:
                System.out.println("Letra no reconocida.");
                break;
        }

        if (verdadero) {
            System.out.println("El booleano es: Verdadero");
        } else {
            System.out.println("El booleana es: Falso");
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println(mensaje);
        }


        int contador = 1;
        while (contador <= numero) {
            System.out.println("Número: " + contador);
            contador++;
        }


        int contador2 = 1;
        do {
            System.out.println("Contador: " + contador2);
            contador2++;
        } while (contador2 <= 1);
    }
}
