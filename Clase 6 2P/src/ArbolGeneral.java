
public class ArbolGeneral {

    NodoGnral raiz;

    public ArbolGeneral() {
        this.raiz = null;
    }
    public boolean insertar(int dato, int datoPadre) {
        boolean existe = this.buscar(dato);
        if (existe)
            return false;
        NodoGnral padre = this.buscar(datoPadre);
        return padre.hijos.add(new NodoGnral(dato));
    }
    private boolean buscar(int dato) {
        if ((this.raiz == null) ? false : this.raiz.buscar(dato));

    }
    private NodoGnral buscarDatoPadre(int dato){
        if(this.raiz == null){
            return null;
        }
        return this.raiz.buscar(dato);
    }
}
