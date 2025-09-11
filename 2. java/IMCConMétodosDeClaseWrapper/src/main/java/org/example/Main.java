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

        // ¿Tienen la misma edad ?
        if ( persona2.getEdad().equals(persona3.getEdad())) {
            System.out.println("Tienen la misma edad");
        } else {
            System.out.println("No tienen la misma edad");
        }

        // ¿persona2 es mayor, igual o menor de edad que persona3 ?
        if( persona2.getEdad().compareTo(persona3.getEdad()) > 0) {
            System.out.println("La persona2 es mayor que la persona3");
        } else if (persona2.getEdad().compareTo(persona3.getEdad()) == 0) {
            System.out.println("son iguales las edades");
        } else if (persona2.getEdad().compareTo(persona3.getEdad()) < 0) {
            System.out.println("La persona3 es mayor que la persona2");
        }

        //persona2  el dni es String y hay q pasarlo a Integer
        Integer dniEnInteger = Integer.valueOf(persona2.getDni());
        System.out.println(dniEnInteger);

        // persona2 el dni es Integer y hay q pasarlo a String
        String dniEnString = String.valueOf(persona2.getDni());
        System.out.println(dniEnString);

    }
}