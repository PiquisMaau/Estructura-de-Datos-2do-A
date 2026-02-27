public class TiempoCompleto extends GestorTrabajadores {
 
    public double SalarioMensual;
    public int HorarioLaboral;

    
   
    
    public TiempoCompleto(String cedulaIdentidad, String nombras, String yearNacimiento, String direccion,
            double salarioMensual, int horarioLaboral) {
        super(cedulaIdentidad, nombras, yearNacimiento, direccion);
        SalarioMensual = salarioMensual;
        HorarioLaboral = horarioLaboral;
    }
    public double getSalarioMensual() {
        return SalarioMensual;
    }
    public void setSalarioMensual(double salarioMensual) {
        SalarioMensual = salarioMensual;
    }
    public int getHorarioLaboral() {
        return HorarioLaboral;
    }
    public void setHorarioLaboral(int horarioLaboral) {
        HorarioLaboral = horarioLaboral;
    }
    @Override
    public String toString() {
        return "TiempoCompleto [SalarioMensual=" + SalarioMensual + ", HorarioLaboral=" + HorarioLaboral
                + ", getCedulaIdentidad()=" + getCedulaIdentidad() + ", getNombras()=" + getNombras()
                + ", getYearNacimiento()=" + getYearNacimiento() + ", getDireccion()=" + getDireccion() + "]";
    }

    
}
