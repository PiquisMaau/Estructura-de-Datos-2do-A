public class Estudiante {
    private String cedula;
    private String nombres;
    private String apellidos;
    private String fechaNacimiento;
    private double[] notas;

    public Estudiante(String cedula, String nombres, String apellidos, String fechaNacimiento, int numNotas) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.notas = new double[numNotas];
    }

    public String getCedula() {
        return cedula;
    }

    public double[] getNotas() {
        return notas;
    }

    public boolean setNota(int index, double nota) {
        if (index >= 0 && index < notas.length) {
            notas[index] = nota;
            return true;
        }
        return false;
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return notas.length > 0 ? suma / notas.length : 0;
    }

    @Override
    public String toString() {
        return nombres + " " + apellidos + " | Cédula: " + cedula + " | Promedio: " + calcularPromedio();
    }
}
