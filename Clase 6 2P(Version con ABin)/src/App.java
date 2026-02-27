public class App {
    public static void main(String[] args) {
        ArbolGeneral a = new ArbolGeneral();
        a.insertar(3, -1);
        a.insertar(4, 3);
        a.insertar(5, 3);
        a.insertar(8, 5);
        a.insertar(7, 5);
        a.insertar(6, 5);

        ArbolBin ab = a.equivalente();

        System.out.println("Recorrido INORDEN");
        ab.imprimirInorden();

        
    }
}


