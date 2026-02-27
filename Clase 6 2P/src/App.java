public class App {
    public static void main(String[] args) throws Exception {
        ArbolGeneral a = new ArbolGeneral();
        a.raiz = new NodoGnral(3);
        a.raiz.hijos.add(new NodoGnral(4));
        a.raiz.hijos.get(0).add(new NodoGnral(5));
        a.raiz.hijos.get(0).hijos.get(0).add(new NodoGnral(6));
        a.raiz.hijos.get(0).hijos.get(0).add(new NodoGnral(7));
        a.raiz.hijos.get(0).hijos.get(0).add(new NodoGnral(8));
        a.insertar(3, -1);
        a.insertar(4, 3);
        a.insertar(5, 3);
        a.insertar(6, 5);
        a.insertar(7, 5);
        a.insertar(8, 5);
    }
}
