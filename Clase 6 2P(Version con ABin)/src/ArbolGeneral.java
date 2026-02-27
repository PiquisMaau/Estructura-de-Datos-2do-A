public class ArbolGeneral {
    NodoGnral raiz;

    public ArbolGeneral() {
        this.raiz = null;
    }

    public boolean insertar(int dato, int datoPadre) {
        if (raiz == null) {
            if (datoPadre == -1) {
                raiz = new NodoGnral(dato);
                return true;
            }
            return false;
        }

        if (buscar(dato)) return false; 

        NodoGnral padre = buscarDato(datoPadre);
        if (padre == null) return false;

        padre.hijos.add(new NodoGnral(dato));
        return true;
    }

    private boolean buscar(int dato) {
        if (raiz == null) return false;
        return raiz.buscar(dato);
    }

    private NodoGnral buscarDato(int dato) {
        if (raiz == null) return null;
        return raiz.buscarDato(dato);
    }

    ArbolBin equivalente() {
        ArbolBin a = new ArbolBin();
        if (raiz != null) {
            a.raiz = new NodoABin(raiz.dato);
            raiz.alimenta(a.raiz);
        }
        return a;
    }
}
