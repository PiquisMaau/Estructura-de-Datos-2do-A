import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorEstudiantes gestor = new GestorEstudiantes(100);

        int opcion;
        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Registrar calificaciones");
            System.out.println("3. Listar estudiantes");
            System.out.println("4. Promedio del curso");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Cédula: ");
                    String cedula = sc.nextLine();
                    System.out.print("Nombres: ");
                    String nombres = sc.nextLine();
                    System.out.print("Apellidos: ");
                    String apellidos = sc.nextLine();
                    System.out.print("Fecha de nacimiento: ");
                    String fecha = sc.nextLine();
                    System.out.print("Número de notas: ");
                    int numNotas = sc.nextInt();
                    sc.nextLine();

                    Estudiante e = new Estudiante(cedula, nombres, apellidos, fecha, numNotas);
                    gestor.agregarEstudiante(e);
                    break;

                case 2:
                    System.out.print("Ingrese cédula del estudiante: ");
                    String ced = sc.nextLine();
                    gestor.registrarCalificaciones(ced);
                    break;

                case 3:
                    gestor.listarEstudiantes();
                    break;

                case 4:
                    System.out.println("Promedio del curso: " + gestor.calcularPromedioCurso());
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }
}
