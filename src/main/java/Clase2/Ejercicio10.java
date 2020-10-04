package Clase2;

import java.util.Scanner;

public class Ejercicio10{

        //Programa Java que lea dos números y muestre los números entre ellos
       //INICIO
        public static void main(String args[]) {
            //TECLADO
            Scanner input = new Scanner(System.in);
            //VARIABLE
            int num1 = 0;
            int num2 = 0;
            //MOSTRAR
            System.out.println("Ingrese un numero");
            //GUARDAR
            num1 = input.nextInt();
            //MOSTRAR
            System.out.println("Ingrese otro numero");
            //GUARDAR
            num2 = input.nextInt();

            for (int i = num1; i >= num2; i++) {
                System.out.println(i + "");
            }


        }

}
