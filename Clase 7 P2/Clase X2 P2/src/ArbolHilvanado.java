
public class ArbolHilvanado {

    NodoAHilv raiz;

    public ArbolHilvanado

    {
        this.raiz = raiz;
    }

    public boolean insertar() {
        if (this.estaVacio())
        try {
            this.raiz = new NodoAHilv(dato, null, false, null, true);
            return true;

        } catch (Exception e) {
            return false;
        }

        NodoAHilv futuropadre = this.futuroPadre(dato);
        if (futuropadre != dato) {
            if (futuropadre.dato < dato) {
                if (futuropadre.dervalid || futuropadre.der == null) {
                    return futuropadre; 
                }else {
                    futuropadre = futuropadre.der;
                }
            }
        }
        if (futuropadre.izqvalid || futuropadre.izq == null) {
            return futuropadre; 
        }else {
            futuropadre = futuropadre.izq;
        }

    }

    public boolean estaVacio() {
        return (this.raiz == null);
    }

    private NodoAHilv futuroPadre(int dato) {
        NodoAHilv futuropadre = this.raiz;
        while (true) {
            if (futuropadre.dato == dato) {
                return null;
            }
            if (futuropadre.dato < dato) {
                if (futuropadre.dervalid || futuropadre.der == null) {
                    return futuropadre; 
                }else {
                    futuropadre = futuropadre.der;
                }
            }
            if (futuropadre.izqvalid || futuropadre.izq == null) {
                return futuropadre; 
            }else {
                futuropadre = futuropadre.izq;
            }
        }
    }

    public void imprimir() {
        if (this.estaVacio()) {
            return;
        }
        NodoAHilv aux = this.raiz;
        while (aux.izq != null) {
            aux = aux.izq;
            while (aux != null) {
                System.out.println(aux.dato);
                if (!aux.dervalid || aux.der == null) {
                    aux = aux.der; 
                }else {
                    NodoAHilv proximo = aux.der;
                    while (proximo.izq != aux) {
                        proximo = proximo.izq;
                    }
                    aux = proximo;
                }

            }
        }

    }
