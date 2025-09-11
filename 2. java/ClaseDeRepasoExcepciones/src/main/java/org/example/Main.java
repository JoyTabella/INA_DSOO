package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args)  {

        // el Try con Una Excepcion chequeada (en tiempo de compilacion)
        // tambien se puede agregar el "throws FileNotFoundException" en la firma del metodo

        try {
            FileInputStream fileInputStream = new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
            System.out.println("El archivo indicado no existe");
        }

        int a = 0;
        int b = 300;

        // el Try con Una Excepcion no chequeada (en tiempo de ejecucion) ,
        // el programa sigue corriendo
        try {
            int cociente = b / a;
            System.out.println(cociente);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero");
        }

        System.out.println("Fin del programa");

        /// OTRO EJEMPLO ///////////////
        int e = 0, f = 300;

        try {
            int cociente = f / e;
            System.out.println(cociente);
        } catch (Exception exception) {
            System.out.println("::: No se puede dividir por cero");
        } finally {
            System.out.println("Otro fin");
        }

        // Sin try y usando throw new se corta la ejecución del programa
        int c = 0;
        int d = 300;


        if (c==0) {
            throw new ArithmeticException("Te dije que no se puede dividir por cero");
        } else {
            int cociente2 = d / c;
            System.out.println(cociente2);
        }

        System.out.println("Ahora si se termino");


    }
}