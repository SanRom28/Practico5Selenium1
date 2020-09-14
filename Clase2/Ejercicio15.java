package Clase2;
//Pedir el ingreso de números hasta que se ingrese un 0. Mostrar el promedio de ellos.
//con = Un Contador es una variable entera (int) que nos indica cuantas veces ha ocurrido un suceso
import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese  un numero");
        int num = input.nextInt();
        int suma = 0;
        int cont = 0;
        while (num != 0) {
            suma = suma + num;
            cont++;
            System.out.println("Ingrese un numero");
            num = input.nextInt();
        }
        if (cont > 0) {
            System.out.println("El promedio es " + suma / cont);
        } else {
            System.out.println("El promedio es 0!");
        }
    }

}


