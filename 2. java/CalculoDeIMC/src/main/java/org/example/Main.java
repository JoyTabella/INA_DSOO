package org.example;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Pepe", 24, "32432123");
        Persona persona3 = new Persona("Jorge", 40, "12432555",70.2,1.70);

        System.out.println(persona3);

        String mensajeDeIMC = persona3.calcularIMC();

        System.out.println(mensajeDeIMC);


        boolean legalidad = persona3.esMayorDeEdad();

        if(legalidad) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }



    }
}