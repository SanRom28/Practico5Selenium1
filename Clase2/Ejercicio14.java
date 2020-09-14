package Clase2;

import java.util.Scanner;

public class Ejercicio14 {
    //Pedir el ingreso de números hasta que se ingrese un 0.
    // Mostrar la suma de ellos.

    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = input.nextInt();
        int suma =0;
    while (num !=0){
        suma = suma + num;
        System.out.println("Ingrese un numero");
        num = input.nextInt();
    }
    if (suma != 0);
    System.out.println("Mostar la suma "+suma);

    }
}
