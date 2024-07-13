
// Copia del Test - Huarcaua Quispe ALbert Wilmer - Operaciones basicas 
package test;

public class OperacionesMatematicas {

    // Método para sumar dos números enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // Método para restar dos números enteros
    public int restar(int a, int b) {
        return a - b;
    }

    // Método para multiplicar dos números enteros
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Método para dividir dos números enteros
    // Se asume que b no es cero para evitar la división por cero
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        OperacionesMatematicas operaciones = new OperacionesMatematicas();

        // Ejemplos de uso de los métodos
        int suma = operaciones.sumar(5, 3);
        int resta = operaciones.restar(5, 3);
        int multiplicacion = operaciones.multiplicar(5, 3);
        double division = operaciones.dividir(6, 3);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }
}
