/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class ED2526TIGestorFiguras {

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingresa cuántas figuras necesitas: ");
    int CantidadFiguras = teclado.nextInt();
    GestorFiguras g = new GestorFiguras(CantidadFiguras);

    for (int i = 0; i < CantidadFiguras; i++) {
        System.out.println("Ingresa el tipo de figura que deseas conocer su Área: \n" +
                           "1 = Círculo\n" +
                           "2 = Cuadrado\n" +
                           "3 = Rectángulo\n" +
                           "4 = Rombo");
        int TipodeFigura = teclado.nextInt();
        Figura f = null;

        switch (TipodeFigura) {
            case 1:
                System.out.println("Ingresa el radio del círculo: ");
                f = new Círculo(teclado.nextInt());
                break;
            case 2:
                System.out.println("Ingresa la distancia de un lado del cuadrado: ");
                f = new Cuadrado(teclado.nextInt());
                break;
            case 3:
                System.out.println("Ingresa la BASE del rectángulo: ");
                int base = teclado.nextInt();
                System.out.println("Ingresa la ALTURA del rectángulo: ");
                int altura = teclado.nextInt();
                f = new Rectangulo(base, altura);
                break;
            case 4:
                System.out.println("Ingresa la DIAGONAL MAYOR del rombo: ");
                float diagMayor = teclado.nextFloat();
                System.out.println("Ingresa la DIAGONAL MENOR del rombo: ");
                float diagMenor = teclado.nextFloat();
                f = new Rombo(diagMayor, diagMenor);
                break;
            default:
                System.out.println("Opción inválida.");
                i--; // para repetir esta iteración
                continue;
        }

        float area = f.area();
        System.out.println("El área es: " + area);
        g.agregarFigura(f);
    }

}
}
