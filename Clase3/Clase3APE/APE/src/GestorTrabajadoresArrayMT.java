public class GestorTrabajadoresArrayMT {

    MedioTiempo[] trabajador;
    int contador = 0;

    public GestorTrabajadoresArrayMT(int cantMáxFigs){
        this.trabajador = new MedioTiempo[cantMáxFigs];
    }

    public void agregarTrabajador(MedioTiempo f) {
        if (contador < trabajador.length) {
            trabajador[contador] = f;
            contador++;
        }
}
}

