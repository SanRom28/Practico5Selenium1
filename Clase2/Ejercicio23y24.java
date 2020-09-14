package Clase2;

public class Ejercicio23y24 {
    public Ejercicio23y24() {
    }

    //Muestre los numeros multiplos de 3
    // 6/3 = 2  R =0
    // 15/3 = 5 R =0
    public static void main(String args[]) {
        for (int i = 10; i <= 40; i++) {
            if (i % 3 == 0) {
                System.out.println(i +  "es multiplo de 3");
            }

        }
    }
}