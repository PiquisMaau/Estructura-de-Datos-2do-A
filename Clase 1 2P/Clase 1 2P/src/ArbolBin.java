public class ArbolBin {

    NodoABin raíz;

    public ArbolBin() {
        this.raíz = null;
    }

    public void imprimir(){
        if(this.raíz == null){
            System.out.println("El arbol está vacío");
        }else
        this.raíz.imprimir();
    }
    public void imprimirPreorden(){
        if (this.raíz == null)
            System.out.println("El árbol está vacío");
        else 
            this.raíz.imprimirPreorden();
    }
    
    public void imprimirInorden(){
        if (this.raíz == null)
            System.out.println("El árbol está vacío");
        else 
            this.raíz.imprimirInorden();
    }
    
    public void imprimirPosorden(){
        if (this.raíz == null)
            System.out.println("El árbol está vacío");
        else 
            this.raíz.imprimirPosorden();
    }  
    



}
