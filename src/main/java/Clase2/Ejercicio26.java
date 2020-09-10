package Clase2;
//Calcular la suma de los 10 primeros números naturales
public class Ejercicio26 {
    public static void main(String args[]) {
        int suma = 0;
        {
            for (int i = 1; i <= 10; i = i + 1) {
                suma = suma + 1;
                System.out.println("La suma es" + suma);
            }
        }
    }
}