package Clase2;

import java.util.Scanner;

public class Ejercicio34 {

        public static void main (String args []){
            Scanner input = new Scanner(System.in);
            System.out.println ("Ingrese un numero");
            int num = input.nextInt();
            int suma = 0;
            int contador = 0;

            while (num>=0){
                suma = suma + num;
                contador ++;
                System.out.println("Ingrese otro numero!!");
                num = input.nextInt();

            }
            System.out.println("El promedios es " + suma / contador);
            System.out.println("El programa a Finalizado!!!");
        }
    }


