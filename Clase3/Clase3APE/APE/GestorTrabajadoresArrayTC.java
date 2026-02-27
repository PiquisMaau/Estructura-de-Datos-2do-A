public class GestorTrabajadoresArrayTC {

    TiempoCompleto[] trabajador;
    int contador = 0;

    public GestorTrabajadoresArrayTC(int cantMáxFigs){
        this.trabajador = new TiempoCompleto[cantMáxFigs];
    }

    public void agregarTrabajador(TiempoCompleto f) {
        if (contador < trabajador.length) {
            trabajador[contador] = f;
            contador++;
        }
}
}

