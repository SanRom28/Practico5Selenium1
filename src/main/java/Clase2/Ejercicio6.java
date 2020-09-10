package Clase2;

import java.util.Scanner;

public class Ejercicio6 {

//Pedir el ingreso de 3 números, indicar si hay números repetidos utilizando solo un IF

    //INICIO
    public static void main(String args[]) {

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        //TECLAD0
        Scanner input = new Scanner(System.in);
//MOSTRAR “Ingrese un numero”;

        System.out.println("Ingrese un numero");
        num1 = input.nextInt();
        System.out.println("Ingrese un segundo número");
        num2 = input.nextInt();
        System.out.println("Ingrese el tercer número");
        num3 = input.nextInt();

        //If ( num1 == num2 || num1 == num3 || num2 == num3 ) {

        if (num1 == num2 || num1 == num3 || num2 == num3){
            // MOSTRAR “Hay números repetidos”;
            System.out.println("Hay numeros repetidos!!");
        }
    }
    }