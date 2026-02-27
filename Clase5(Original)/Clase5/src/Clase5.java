public class Clase5 {

    public static void main(String[] args) {
        ListaSecuencial listita = new ListaSecuencial();
        listita.insertar(13);
        listita.insertar(3);
        listita.insertar(10);
        listita.Imprimir();
        System.out.println("----------------------");
        listita.ImprimirSaltandoUno();
        listita.CalculaPromedio();
    }

}
