package Clase2;
//Mostrar los múltiplos de 9 entre 0 y 100 que sean impares.
public class Ejercicio32 {
    public static void main(String args[]) {
        int i = 9;
        while (i <=100) {
            i++;
            if (i % 9 == 0 && i % 2 == 1) {
                System.out.println(" es impar y multiplo de 9"+ i);

            }
        }

    }

}
