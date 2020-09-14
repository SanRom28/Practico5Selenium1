package Clase2;

import java.util.Scanner;

public class Ejercicio7 {
    //Pedir el ingreso de 3 números e indicar si NO hay repetidos, es decir, si son todos diferentes.

    //INICIO
    public static void  main (String args[]) {
        //Variables
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        //TECLADO
        Scanner input = new Scanner(System.in);

        //MOSTRAR “Ingrese un numero”;

        System.out.println("Ingrese un numero");
        num1 = input.nextInt();
        System.out.println("Ingrese un segundo número");
        num2 = input.nextInt();
        System.out.println("Ingrese el tercer número");
        num3 = input.nextInt();
        //MOSTRAR “Hay números repetidos”;
        if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println ("Hay numeros repetidos");
        } else {
            //MOSTRAR “NO hay números repetidos!!”;
            System.out.println("No hay numeros repetidos");
        }


    }
    }
