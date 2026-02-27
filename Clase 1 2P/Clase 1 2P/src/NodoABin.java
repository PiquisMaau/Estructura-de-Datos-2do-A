
public class NodoABin {

    Object dato;
    NodoABin izq, der;

    public NodoABin() {
    }

    public NodoABin(Object dato) {
        this.dato = dato;
        this.izq = this.der = null;
    }

    void imprimir(){
        System.out.println(this.dato);
        if(this.izq != null){
            this.izq.imprimir();
        }
         if(this.der != null){
            this.der.imprimir();
        }
    }
     void imprimirPreorden() {
        System.out.println(this.dato);
        if (this.izq != null)
            this.izq.imprimirPreorden();
        if (this.der != null)
            this.der.imprimirPreorden();
    }
    
    void imprimirInorden() {
        if (this.izq != null)
            this.izq.imprimirInorden();
        System.out.println(this.dato);
        if (this.der != null)
            this.der.imprimirInorden();
    }
    
    void imprimirPosorden() {
        if (this.izq != null)
            this.izq.imprimirPosorden();
        if (this.der != null)
            this.der.imprimirPosorden();
        System.out.println(this.dato);
    }
    

}
