import java.util.ArrayList;
import java.util.List;

public class NodoGnral {
    int dato;
    List<NodoGnral> hijos;

    public NodoGnral(int dato) {
        this.dato = dato;
        this.hijos = new ArrayList<>();
    }

    boolean buscar(int dato) {
        if (this.dato == dato) return true;
        return buscarRecursivoHijos(this.hijos, dato, 0);
    }

    private boolean buscarRecursivoHijos(List<NodoGnral> lista, int dato, int indice) {
        if (indice >= lista.size()) return false;
        if (lista.get(indice).buscar(dato)) return true;
        return buscarRecursivoHijos(lista, dato, indice + 1);
    }

    NodoGnral buscarDato(int dato) {
        if (this.dato == dato) return this;
        return buscarDatoEnHijos(this.hijos, dato, 0);
    }

    private NodoGnral buscarDatoEnHijos(List<NodoGnral> lista, int dato, int indice) {
        if (indice >= lista.size()) return null;
        NodoGnral encontrado = lista.get(indice).buscarDato(dato);
        if (encontrado != null) return encontrado;
        return buscarDatoEnHijos(lista, dato, indice + 1);
    }

    void alimenta(NodoABin equivalente) {
        if (this.hijos.isEmpty()) return;
        equivalente.izq = new NodoABin(this.hijos.get(0).dato);
        this.hijos.get(0).alimenta(equivalente.izq);

        alimentaHermanos(equivalente.izq, 1);
    }

    private void alimentaHermanos(NodoABin nodoBinarioHermano, int indice) {
        if (indice >= this.hijos.size()) return;
        nodoBinarioHermano.der = new NodoABin(this.hijos.get(indice).dato);
        this.hijos.get(indice).alimenta(nodoBinarioHermano.der);
        alimentaHermanos(nodoBinarioHermano.der, indice + 1);
    }
}
