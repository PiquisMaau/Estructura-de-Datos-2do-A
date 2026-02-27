public class GestorTrabajadores {
public String cedulaIdentidad;
public String Nombras;
public String YearNacimiento;
public String Direccion;


public GestorTrabajadores(String cedulaIdentidad, String nombras, String yearNacimiento, String direccion) {
    this.cedulaIdentidad = cedulaIdentidad;
    Nombras = nombras;
    YearNacimiento = yearNacimiento;
    Direccion = direccion;
}
public String getCedulaIdentidad() {
    return cedulaIdentidad;
}
public void setCedulaIdentidad(String cedulaIdentidad) {
    this.cedulaIdentidad = cedulaIdentidad;
}
public String getNombras() {
    return Nombras;
}
public void setNombras(String nombras) {
    Nombras = nombras;
}
public String getYearNacimiento() {
    return YearNacimiento;
}
public void setYearNacimiento(String yearNacimiento) {
    YearNacimiento = yearNacimiento;
}
public String getDireccion() {
    return Direccion;
}
public void setDireccion(String direccion) {
    Direccion = direccion;
}








}
