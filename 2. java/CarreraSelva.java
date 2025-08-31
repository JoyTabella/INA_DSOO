package org.example;
import java.util.*;

public class CarreraSelva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear categorías
        Categoria chico = new Categoria(1, "Circuito chico", "2 km por selva y arroyos");
        Categoria medio = new Categoria(2, "Circuito medio", "5 km por selva, arroyos y barro");
        Categoria avanzado = new Categoria(3, "Circuito avanzado", "10 km por selva, arroyos, barro y escalada en piedra");

        List<Inscripcion> inscripciones = new ArrayList<>();
        int contadorInsc = 1;

        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- Menú Carrera de la Selva ---");
            System.out.println("1. Inscribir participante");
            System.out.println("2. Mostrar inscriptos por categoría");
            System.out.println("3. Desinscribir participante");
            System.out.println("4. Calcular montos recaudados");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Número participante: ");
                    int nro = sc.nextInt(); sc.nextLine();
                    System.out.print("DNI: ");
                    String dni = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Apellido: ");
                    String apellido = sc.nextLine();
                    System.out.print("Edad: ");
                    int edad = sc.nextInt(); sc.nextLine();
                    System.out.print("Celular: ");
                    String cel = sc.nextLine();
                    System.out.print("Número de emergencia: ");
                    String emergencia = sc.nextLine();
                    System.out.print("Grupo sanguíneo: ");
                    String gs = sc.nextLine();

                    System.out.println("Categorías: 1) Chico 2) Medio 3) Avanzado");
                    int cat = sc.nextInt(); sc.nextLine();
                    Categoria seleccionada = (cat == 1) ? chico : (cat == 2) ? medio : avanzado;

                    Participante p = new Participante(nro, dni, nombre, apellido, edad, cel, emergencia, gs);
                    double monto = seleccionada.calcularMonto(edad);
                    if (monto == -1) {
                        System.out.println("El participante es menor de edad y no puede inscribirse en avanzado.");
                    } else {
                        Inscripcion insc = new Inscripcion(contadorInsc++, seleccionada, p, monto);
                        inscripciones.add(insc);
                        System.out.println("Inscripción realizada. Monto a pagar: $" + monto);
                    }
                    break;

                case 2:
                    System.out.println("Categorías: 1) Chico 2) Medio 3) Avanzado");
                    int c = sc.nextInt(); sc.nextLine();
                    Categoria catMostrar = (c == 1) ? chico : (c == 2) ? medio : avanzado;
                    for (Inscripcion insc : inscripciones) {
                        if (insc.getCategoria().equals(catMostrar)) {
                            System.out.println(insc);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Número de inscripción a eliminar: ");
                    int nroInsc = sc.nextInt(); sc.nextLine();
                    inscripciones.removeIf(i -> i.getNumeroInscripcion() == nroInsc);
                    System.out.println("Inscripción eliminada.");
                    break;

                case 4:
                    double totalChico = 0, totalMedio = 0, totalAvanzado = 0;
                    for (Inscripcion insc : inscripciones) {
                        if (insc.getCategoria().equals(chico)) totalChico += insc.getMonto();
                        else if (insc.getCategoria().equals(medio)) totalMedio += insc.getMonto();
                        else totalAvanzado += insc.getMonto();
                    }
                    System.out.println("Recaudación Chico: $" + totalChico);
                    System.out.println("Recaudación Medio: $" + totalMedio);
                    System.out.println("Recaudación Avanzado: $" + totalAvanzado);
                    System.out.println("Total: $" + (totalChico + totalMedio + totalAvanzado));
                    break;

                case 5:
                    salir = true;
                    break;
            }
        }

        sc.close();
    }
}

class Categoria {
    private int id;
    private String nombre;
    private String descripcion;

    public Categoria(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public double calcularMonto(int edad) {
        switch (id) {
            case 1: return (edad < 18) ? 1300 : 1500;
            case 2: return (edad < 18) ? 2000 : 2300;
            case 3: return (edad < 18) ? -1 : 2800;
            default: return 0;
        }
    }

    public String getNombre() { return nombre; }
    public String toString() { return nombre; }
}

class Participante {
    private int numero;
    private String dni, nombre, apellido;
    private int edad;
    private String celular, emergencia, grupoSang;

    public Participante(int numero, String dni, String nombre, String apellido,
                        int edad, String celular, String emergencia, String grupoSang) {
        this.numero = numero;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.celular = celular;
        this.emergencia = emergencia;
        this.grupoSang = grupoSang;
    }

    public int getEdad() { return edad; }
    public String toString() {
        return nombre + " " + apellido + " (DNI " + dni + ")";
    }
}

class Inscripcion {
    private int numeroInscripcion;
    private Categoria categoria;
    private Participante participante;
    private double monto;

    public Inscripcion(int numeroInscripcion, Categoria categoria, Participante participante, double monto) {
        this.numeroInscripcion = numeroInscripcion;
        this.categoria = categoria;
        this.participante = participante;
        this.monto = monto;
    }

    public int getNumeroInscripcion() { return numeroInscripcion; }
    public Categoria getCategoria() { return categoria; }
    public double getMonto() { return monto; }

    public String toString() {
        return "Insc#" + numeroInscripcion + " - " + participante + " - " + categoria.getNombre() + " $" + monto;
    }
}