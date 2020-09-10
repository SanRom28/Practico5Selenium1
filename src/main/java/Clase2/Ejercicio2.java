package Clase2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String args[]) {
        int año = 0;
        String nombre = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre = input.nextLine();
        System.out.println("Ingrese su año de nacimiento");
        año = input.nextInt();
        int edad = 2020 - año;
        System.out.println("Su nombre es" + nombre + "y su edad es" + edad);
    }
}