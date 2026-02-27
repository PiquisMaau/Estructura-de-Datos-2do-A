
import java.util.Scanner;

public class EjerciciosRecursividad {

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        }else {
            return factorial(n - 2) + factorial(n - 1);
        }
    }

    public static int suma(int n) {
        if (n == 1) {
            return 1; 
        }else {
            return suma(n - 1) + n;
        }

    }

    public static void ordenar(int[] arreglo, int posicion) {
        if (posicion == arreglo.length) {
            return;
        }

        int menorPos = posicion;
        for (int i = posicion + 1; i < arreglo.length; i++) {
            if (arreglo[i] < arreglo[menorPos]) {
                menorPos = i;
            }
        }

        int numeroNew = arreglo[posicion];
        arreglo[posicion] = arreglo[menorPos];
        arreglo[menorPos] = numeroNew;

        ordenar(arreglo, posicion + 1);
    }

    public static int sumaPares(int N) {
        int suma = 0;

        if (N % 2 != 0) {
            System.out.print("No es par  ");
            return -1;
        }

        for (int i = N; i >= 2; i -= 2) {
            suma += i;
        }
        return suma;
    }

    public static int mcd(int M, int N) {
        if (N == 0) {
            return M; 
        }else {
            return mcd(N, M % N);
        }

    }

    public static int binDecimal(String binario, int posicion) {
        if (posicion == binario.length()) {
            return 0;
        }

        int bit = binario.charAt(posicion) - '0';

        return bit * (int) Math.pow(2, binario.length() - 1 - posicion) + binDecimal(binario, posicion + 1);
    }

    public static int sumaVector(int[] arreglo, int posicion) {

        if (posicion == arreglo.length) {
            return 0;
        }

        return arreglo[posicion] + sumaVector(arreglo, posicion + 1);
    }

    public static void main(String[] args) {
        System.out.println("------------Ejercicio 1 --------------------");
        System.out.println(factorial(1));
        System.out.println(factorial(5));

        System.out.println("------------Ejercicio 4 --------------------");
        System.out.println(suma(1));
        System.out.println(suma(5));

        System.out.println("------------Ejercicio 3 --------------------");
        int[] arreglo = {1, 31, 4, 56, 6, 4, 3, 76, 9, 8};
        for (int numero : arreglo) {
            System.out.print(numero + ", ");
        }
        System.out.println();
        ordenar(arreglo, 0);
        for (int numero : arreglo) {
            System.out.print(numero + ", ");
        }
        System.out.println();

        System.out.println("------------Ejercicio 5 --------------------");
        System.out.println(sumaPares(3));
        System.out.println(sumaPares(6));

        System.out.println("------------Ejercicio 6 --------------------");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el valor de M: ");
        int M = scanner.nextInt();

        System.out.print("Ingresa el valor de N: ");
        int N = scanner.nextInt();

        if (M <= 0 || N <= 0) {
            System.out.println("Ingresa dos positivos");
            return;
        }

        if (M < N) {
            int temp = M;
            M = N;
            N = temp;
        }

        System.out.println(mcd(M, N));

        System.out.println("------------Ejercicio 8 --------------------");
        System.out.println(binDecimal("100011101001", 0));
        System.out.println(binDecimal("100011101001", 4));

        System.out.println("------------Ejercicio 9 --------------------");

        int[] vector = {1, 1, 2};
        for (int numero : vector) {
            System.out.print(numero + ", ");
        }
        System.out.println();

        System.out.println(sumaVector(vector, 0));

    }

}
