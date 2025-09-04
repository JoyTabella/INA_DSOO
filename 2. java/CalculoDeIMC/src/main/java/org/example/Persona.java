package org.example;

import static java.lang.Math.pow;

public class Persona {
    // ATRIBUTOS
    private String nombre;
    private Integer edad;
    private String dni;
    private Double peso;
    private Double altura;

    // CONSTRUCTORES
    public Persona() {
    }

    public Persona(String nombre, Integer edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public Persona(String nombre, Integer edad, String dni, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }

    // MÉTODOS
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public String calcularIMC() {
        Double resultado = peso / pow(altura, 2);
        String mensaje = "";

        if (resultado < 20) {
            mensaje = "Bajo peso";
        } else if (resultado >= 20 && resultado <= 25) {
            mensaje = "Peso normal";
        } else if (resultado > 25) {
            mensaje =  "Sobrepeso";
        }
        return mensaje;
    }

    public boolean esMayorDeEdad() {
        boolean esMayor = false;

        if (edad >= 18) {
            esMayor = true;
        }

        return esMayor;
    }
}