package Clase2;

import java.util.Scanner;

public class Ejercicio4 {
    //INICIO
    public static void main(String args[]) {

        int num = 0;
        //TECLAD0
        Scanner input = new Scanner(System.in);
        //MOSTRAR “Ingrese un numero”;
        System.out.println("Ingrese un numero entero");
        //GUARDAR num;
        num = input.nextInt();

        //if ( num > 0 ) {
        if (num > 0) {
            System.out.println("mostrar el numero es mayor a 0");

        } else if (num <0){
            System.out.println("mostrar el numero es menor a 0");
        }
        else {
            System.out.println("El numero es igual a 0");
        }


    }

}
