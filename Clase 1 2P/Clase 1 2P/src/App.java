public class App {
    public static void main(String[] args) throws Exception {
        

        ArbolBin a = new ArbolBin();
        a.raíz = new NodoABin(3);
        a.raíz.izq = new NodoABin(1);
        a.raíz.der = new NodoABin(8);
        a.raíz.izq.der = new NodoABin(2);
        a.raíz.der.izq = new NodoABin(3);
        a.imprimir();
    }
}
