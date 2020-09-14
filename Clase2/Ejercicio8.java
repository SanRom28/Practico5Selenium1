package Clase2;

import java.util.Scanner;

public class Ejercicio8 {
    //Pedir el ingreso de números hasta que aparezca uno negativo

    public Ejercicio8() {
    }

    //INICIO
    public static void main(String args[]) {
        //Variables
        int num = 0;
        int suma = 0;
        //TECLADO

        Scanner input = new Scanner(System.in);
        //MOSTRAR “Ingrese un numero”;

        System.out.println("Ingrese un numero");
        num = input.nextInt();

        //MOSTRAR “Hay números repetidos”;

        while (num >= 0) {
            suma = suma + num;
            System.out.println("Ingrese otro numero");
            num = input.nextInt();
        }
        System.out.println("La suma es" + suma);
        System.out.println("El programa a finalizado porque se ingreso un mum megativo!!");
    }

}
