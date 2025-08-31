import java.util.ArrayList;
import java.util.Scanner;

class Empleado {
    private final String dni;
    private double sueldo;

    public Empleado(String dni, double sueldo) {
        this.dni = dni;
        this.sueldo = sueldo;
    }

    public void aplicarAumento() {
        double aumento;
        if (sueldo <= 200000) {
            aumento = sueldo * 0.20;
        } else if (sueldo <= 450000) { // ya sabemos que es >200000
            aumento = sueldo * 0.10;
        } else {
            aumento = sueldo * 0.05;
        }
        sueldo += aumento; // actualizamos el sueldo
    }

    @Override
    public String toString() {
        return "DNI: " + dni + " | Sueldo actualizado: $" + sueldo;
    }
}

public class AumentoSueldos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Empleado> empleados = new ArrayList<>();

        System.out.print("Ingrese la cantidad de empleados: ");
        int cantidad = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        for (int i = 0; i < cantidad; i++) {
            System.out.print("\nIngrese DNI del empleado: ");
            String dni = sc.nextLine();

            System.out.print("Ingrese sueldo actual: ");
            double sueldo = sc.nextDouble();
            sc.nextLine();

            empleados.add(new Empleado(dni, sueldo));
        }

        // Aplicamos aumentos
        System.out.println("\n--- Sueldos Actualizados ---");
        for (Empleado e : empleados) {
            e.aplicarAumento();
            System.out.println(e);
        }

        sc.close();
    }
}
