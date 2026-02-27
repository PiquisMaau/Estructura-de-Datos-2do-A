public class NodoAHilv {

    int dato;
    NodoAHilv izq, der;
    boolean izqvalid, dervalid;

    public NodoAHilv(int dato, NodoAHilv der, boolean dervalid, NodoAHilv izq, boolean izqvalid) {
        this.dato = dato;
        this.der = der;
        this.dervalid = dervalid;
        this.izq = izq;
        this.izqvalid = izqvalid;
    }


}
