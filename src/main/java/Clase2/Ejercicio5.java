package Clase2;

import java.util.Scanner;

public class Ejercicio5 {

    //INICIO
    public static void main(String args[]) {

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        //TECLAD0
        Scanner input = new Scanner(System.in);
        //MOSTRAR “Ingrese un numero”;
          System.out.println("Ingrese un numero");
        //        //GUARDAR num1;
          num1 = input.nextInt();
        //        //MOSTRAR “Ingrese un segundo número”;
           System.out.println("Ingrese un segundo número");
        //        //GUARDAR num2;
            num2 = input.nextInt();
        //        //MOSTRAR “Ingrese el tercer número”;
          System.out.println("Ingrese el tercer número");
        //        //GUARDAR num3;
           num3 = input.nextInt();
        //        //If(num1 == num2) {
        if (num1 == num2) {
            //MOSTRAR “Hay números repetidos”;
            System.out.println("Hay numeros repetidos!!");
        }

        // If(num2 == num3) {
        if (num2 == num3) {
            System.out.println("Hay numeros repetidos!!");
        }
        //If(num1 == num3) {
        if (num1 == num3) {
            //MOSTRAR “Hay números repetidos !!”;
            System.out.println("Hay numeros repetidos!!");
        }
    }
}
        //Num1 = 1
        //Num2 = 3
        //Num3 = 3