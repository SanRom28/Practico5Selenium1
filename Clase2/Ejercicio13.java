package Clase2;

import java.util.Scanner;

public class Ejercicio13 {
    //Pedir el ingreso de números hasta que se ingrese un 0
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = input.nextInt();

        while (num != 0) {
            System.out.println("Ingrese un numero");
            num = input.nextInt();
        }
    }
}