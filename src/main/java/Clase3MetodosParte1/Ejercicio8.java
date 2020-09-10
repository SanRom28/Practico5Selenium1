package Clase3MetodosParte1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = input.nextInt();
        System.out.println("La sumatoria desde 1 hasta el numero Ingresado es de " + sumatoria(num));
        sumatoria(num);
    }

    public static int sumatoria(int num) {


        int sumatoria = 0;
        for (int i = 1; i <= num; i++) {
            sumatoria = sumatoria + 1;
        }
        return sumatoria;

    }
}