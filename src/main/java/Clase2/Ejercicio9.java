package Clase2;

import java.util.Scanner;

public class Ejercicio9 {
    //Programa Java que pida un número NUM ingresado por el usuario.
    // Luego muestre los números desde 1 hasta NUM utilizando la instrucción for
    // Ejemplo. NUM = 5 		→  1 2 3 4 5

    //INICIO

    public Ejercicio9() {
    }

    public static void main (String args[]){
        //TECLADO
        Scanner input = new Scanner(System.in);
        //VARIABLE
        int num = 0;
        //MOSTRAR
        System.out.println( "Ingrese un numero");
        //GUARDAR
        num=input.nextInt();
        for ( int i =1; i <=num; i ++){
            System.out.println(i + "");
        }

        }

    }


