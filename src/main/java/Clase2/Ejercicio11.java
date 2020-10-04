package Clase2;

import java.util.Scanner;

public class Ejercicio11 {
    //Programa que lea 6 números e indique en pantalla si son positivos o negativos y pares o impares
    //Ej. 5 : es positivo e impar
    // Ej. -4: es negativo y par

    //INICIO
    public static void main(String args[]) {
        //TECLADO
        Scanner input = new Scanner(System.in);
        //VARIABLE
        int num=0;
        //MOSTRAR
        System.out.println( "Ingrese un numero");
        //GUARDAR
        num=input.nextInt();

        if (num>=0 && num % 2 == 0){
            System.out.println("eL numero es positivo y par");
        }else if(num>=0 && num %2 == 1){
            System.out.println("eL numero es positivo e impar");
        }else if(num<0 && num %2 == 0){
            System.out.println("eL numero es negativo y par");
        }else if(num<0 && num %2 == -1){
            System.out.println("eL numero es negativo e impar");

        }


    }
}



