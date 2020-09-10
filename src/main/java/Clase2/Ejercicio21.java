package Clase2;

public class Ejercicio21 {

    public Ejercicio21() {
    }

    // Muestre los numeros pares hasta el 15
    //Muestre los numeros impares
    public static void main(String args[]) {

        // 4 /2 = 2  R = 0
        // 7 /2 = 2  R = 1
        for (int i = 0; i <= 15; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "Es un numero par!!");

            } else {
                System.out.println(i + "es un mumero IMPAR!!!");
            }

        }
    }
}

