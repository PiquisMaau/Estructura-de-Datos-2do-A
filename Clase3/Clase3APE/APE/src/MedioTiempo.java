public class MedioTiempo extends GestorTrabajadores{

    public double salarioHora;
    public int catidadHoras;

   
    public MedioTiempo(String cedulaIdentidad, String nombras, String yearNacimiento, String direccion,
            double salarioHora, int catidadHoras) {
        super(cedulaIdentidad, nombras, yearNacimiento, direccion);
        this.salarioHora = salarioHora;
        this.catidadHoras = catidadHoras;
    }
    public double getSalarioHora() {
        return salarioHora;
    }
    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }
    public int getCatidadHoras() {
        return catidadHoras;
    }
    public void setCatidadHoras(int catidadHoras) {
        this.catidadHoras = catidadHoras;
    }
    @Override
    public String toString() {
        return "MedioTiempo [salarioHora=" + salarioHora + ", catidadHoras=" + catidadHoras + ", getCedulaIdentidad()="
                + getCedulaIdentidad() + ", getNombras()=" + getNombras() + ", getYearNacimiento()="
                + getYearNacimiento() + ", getDireccion()=" + getDireccion() + "]";
    }

    
}
