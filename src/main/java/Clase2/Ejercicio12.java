package Clase2;

import java.util.Scanner;

public class Ejercicio12 {

    //Pedir el ingreso de 4 números y retornar su suma en valor absoluto.
    //INICIO
    public static void main(String args[]) {

        //TECLADO
        Scanner input = new Scanner(System.in);
        //VARIABLE
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        //MOSTRAR
        System.out.println( "Ingrese un numero: ");
        num1=input.nextInt();
        System.out.println( "Ingrese otro numero");
        num2=input.nextInt();
        System.out.println( "Ingrese el tercer numero: ");
        num3=input.nextInt();
        System.out.println( "Ingrese el ultimo numero: ");
        num4=input.nextInt();

        //GUARDAR
        int suma = num1 + num2 + num3 + num4;

        if (suma < 0){
            suma = suma * (-1);
    }
        System.out.println("El valor absoluto de la suma es "+ suma);
}

}
