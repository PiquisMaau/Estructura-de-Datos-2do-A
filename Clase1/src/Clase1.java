public class Clase1 {

    public static void main(String[] args) {
        // Datos primitivos
        int[] numb = new int[5];
        numb[0] = 5;
        numb[4] = 10;
        for (int Numero : numb) {
            System.out.println(Numero);
        }
        System.out.println("----------------");
        // Datos NO primitivos
        Integer[] numB = new Integer[5];
        numB[0] = 5;
        numB[4] = 10;
        for (Integer Numero : numB) {
            System.out.println(Numero);
        }
        System.out.println("----------------");
        // Ejercicio con datos primitivos
        int[] numbs = new int[5];
        boolean[] tengoNumbs = new boolean[5];
        tengoNumbs[0] = true;
        tengoNumbs[4] = true;

        numbs[0] = 5;
        numbs[4] = 10;
        for (int index = 0; index < numbs.length; index++) {
            if (tengoNumbs[index]) {
                System.out.println(numbs[index]);
            }
        }

        // Ejercicio con datos primitivos
        int[] Numbs = new int[5];
        boolean[] tengoNumb = new boolean[5];
        tengoNumb[0] = true;
        tengoNumb[4] = true;

        Numbs[0] = 5;
        Numbs[4] = 10;
        int Sumatoria = 0;
        int Cantidad = 0;
        for (int index = 0; index < Numbs.length; index++) {
            if (tengoNumb[index]) {
                System.out.println(Numbs[index]);
                Sumatoria += Numbs[index];
                Cantidad++;
            }
            float promedios = -1;
            if (Cantidad != 0) {
                promedios = Sumatoria / Cantidad;
            }
            if (promedios == -1) {
                System.out.println("No hay numeros registrados");
            } else {
                System.out.println("El promedio es: " + Sumatoria / Cantidad);
            }
        }
        System.out.println("----------------");
        // Ejercicio con datos primitivos V2
        int[] Numbs2 = new int[5];

        int Sumatoria2 = 0;
        int Cantidad2 = 0;
        for (int index = 0; index < Numbs2.length; index++) {
            Numbs2[index] = -1;
        }
        System.out.println("Ingresa Notas");
        Numbs2[0] = 5;
        Numbs2[2] = 6;
        Numbs2[4] = 10;
        for (int i = 0; i < Numbs2.length; i++) {
            if (Numbs2[i] != -1) {
                Sumatoria2 += Numbs2[i];
                Cantidad2++;
            }
        }
        if (Cantidad2 > 0) {
            double promedio = (double) Sumatoria2 / Cantidad2;
            System.out.println("El promedio es: " + promedio);
        } else {
            System.out.println("No se ingresaron notas vAlidas.");
        }
    }

}
