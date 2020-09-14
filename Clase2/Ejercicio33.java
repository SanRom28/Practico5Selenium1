package Clase2;

import java.util.Scanner;

public class Ejercicio33 {
    //Pedir el ingreso de numeros hasta que aparezca uno negativo.
    //Indicar el promedio de todos los numeros ingresados

    public static void main (String args []){
        Scanner input = new Scanner(System.in);
        System.out.println ("Ingrese un numero");
        int num = input.nextInt();

        while (num>=0){
            System.out.println("Ingrese otro numero!!");
            num = input.nextInt();

        }
       System.out.println("El programa a Finalizado!!!");
    }
}
