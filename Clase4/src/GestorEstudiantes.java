import java.util.Scanner;

public class GestorEstudiantes {
    private Estudiante[] estudiantes;
    private int totalEstudiantes;

    public GestorEstudiantes(int capacidad) {
        estudiantes = new Estudiante[capacidad];
        totalEstudiantes = 0;
    }

    public void agregarEstudiante(Estudiante e) {
        if (totalEstudiantes < estudiantes.length) {
            estudiantes[totalEstudiantes++] = e;
            System.out.println("Estudiante agregado correctamente.");
        } else {
            System.out.println("Capacidad máxima alcanzada.");
        }
    }

    public Estudiante buscarEstudiante(String cedula) {
        for (int i = 0; i < totalEstudiantes; i++) {
            if (estudiantes[i].getCedula().equals(cedula)) {
                return estudiantes[i];
            }
        }
        return null;
    }

    public void registrarCalificaciones(String cedula) {
        Estudiante e = buscarEstudiante(cedula);
        if (e != null) {
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < e.getNotas().length; i++) {
                System.out.print("Ingrese nota " + (i + 1) + ": ");
                double nota = sc.nextDouble();
                e.setNota(i, nota);
            }
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }

    public void listarEstudiantes() {
        for (int i = 0; i < totalEstudiantes; i++) {
            System.out.println(estudiantes[i]);
        }
    }

    public double calcularPromedioCurso() {
        double suma = 0;
        for (int i = 0; i < totalEstudiantes; i++) {
            suma += estudiantes[i].calcularPromedio();
        }
        return totalEstudiantes > 0 ? suma / totalEstudiantes : 0;
    }
}
