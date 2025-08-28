package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TemperaturasGlobales {

    public static void main(String[] args) {
        // Vector de ciudades
        String[] ciudades = {
                "Londres", "Madrid", "Nueva York", "Buenos Aires",
                "Asunción", "São Paulo", "Lima", "Santiago de Chile",
                "Lisboa", "Tokio"
        };

        // Matriz de temperaturas: [min, max]
        int[][] temperaturas = {
                {-2, 33},
                {-3, 32},
                {-8, 27},
                { 4, 37},
                { 6, 42},
                { 5, 43},
                { 0, 39},
                {-7, 26},
                {-1, 31},
                {-10, 35}
        };

        // Variables para buscar la mínima y la máxima
        int tempMin = temperaturas[0][0];
        int tempMax = temperaturas[0][1];
        String ciudadMin = ciudades[0];
        String ciudadMax = ciudades[0];

        // Recorremos la matriz
        for (int i = 0; i < ciudades.length; i++) {
            // Verificar mínima
            if (temperaturas[i][0] < tempMin) {
                tempMin = temperaturas[i][0];
                ciudadMin = ciudades[i];
            }
            // Verificar máxima
            if (temperaturas[i][1] > tempMax) {
                tempMax = temperaturas[i][1];
                ciudadMax = ciudades[i];
            }
        }

        // Mostrar resultados
        System.out.println("La menor temperatura la tuvo " + ciudadMin + ", con " + tempMin + " ºC.");
        System.out.println("La mayor temperatura la tuvo " + ciudadMax + ", con " + tempMax + " ºC.");
    }
}