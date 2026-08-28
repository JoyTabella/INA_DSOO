class Temperaturas{
    public static void main(String[] args) {
        String[] ciudades = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción", "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
        int[][] temperaturas = {
                {-2, 33},
                {-3, 32},
                {-8, 27},
                {4, 37},
                {6, 42},
                {5, 43},
                {0, 39},
                {-7, 26},
                {-1, 31},
                {-10, 35}
        };

        int temperaturaMinima = temperaturas[0][0];
        String ciudadMinima = ciudades[0];

        int temperaturaMaxima = temperaturas[0][1];
        String ciudadMaxima = ciudades[0];

        for (int i = 0; i < ciudades.length; i++) {

            if (temperaturas[i][0] < temperaturaMinima) {
                temperaturaMinima = temperaturas[i][0];
                ciudadMinima = ciudades[i];
            }
            if (temperaturas[i][1] > temperaturaMaxima) {
                temperaturaMaxima = temperaturas[i][1];
                ciudadMaxima = ciudades[i];
            }
        }
        System.out.println("La ciudad con la tempratura minima es " + ciudadMinima + ", con " + temperaturaMinima + "grados");
        System.out.println("La ciudad con la tempratura maxima es " + ciudadMaxima + ", con " + temperaturaMaxima + "grados");
    }
}