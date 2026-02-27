public class ArbolBin {
    NodoABin raiz;

    public ArbolBin() {
        this.raiz = null;
    }

    public void imprimirInorden() {
        recorridoInOrden(raiz);
        System.out.println();
    }

    private void recorridoInOrden(NodoABin nodo) {
        if (nodo == null)
            return;

        recorridoInOrden(nodo.der);
        recorridoInOrden(nodo.izq);
        System.out.print(nodo.dato + " ");
    }

    //12 de noviembre de 2025
    //OJO:Implementar el método buscarPadre en una clse distinta

    private List<NodoABinEquiv> hermanos(int valor){
        NodoABinEquiv padre = this.buscarPadre(valor);
        NodoABinEquiv hermano = padre.izq;
        List<NodoABinEquiv> hermanos = new LinkedList<>;
        while(hermano != null){
          if(hermano.dato != valor)
           hermanos.add(hermano);
          hermano = hermno.der;      //esto hace que sea hermano se recorra
    }
    return hermanos;
    }

    private NodoABinEquiv buscar(int valor){
        if(this.raiz == null) return null;
        return this.raiz.buscar(valor);
    }

}
