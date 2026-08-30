package practica4;

public class practica4 {
    public static void main(String[] args) {
        String[] ciudades = {
                "Londes", "Madrid", "Nueva York", "Buenos Aires", "Asunción", "Sao Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"
        };

        int [][] temperaturas = {
                {-2, 33},
                {-3, 32},
                {-8, 27},
                {4, 37},
                {6, 42},
                {5, 43},
                {0, 39},
                {-7, 26},
                {-1, 31},
                {-10, 35},

        };

        int min = temperaturas[0][0];

        int max = temperaturas[0][1];

        String ciudadMin = ciudades[0];

        String ciudadMax = ciudades[0];

        for (int i = 0; i < temperaturas.length; i++){
            if (temperaturas[i][0] < min) {
                min = temperaturas[i][0];
                ciudadMin = ciudades[i];
            }

            if (temperaturas[i][1] > max){
                max = temperaturas[i][1];
                ciudadMax = ciudades[i];
            }
        }

        System.out.println(" la menor temperatura la tuvo " + ciudadMin + " con " + min + " ºC.\n ");
        System.out.println(" la mayor temperatura la tuvo " + ciudadMax + " con " + max + " ºC.\n ");
    }
}
