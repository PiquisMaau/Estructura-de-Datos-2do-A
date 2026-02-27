public class App {
    public static void main(String[] args) throws Exception {

        ListaSEC lista1 = new ListaSEC();

        lista1.insertarPorPrimero("papa");
        lista1.insertarPorÚltimo("zanahoria");
        lista1.insertarPorÚltimo("pollo");
        lista1.insertarPorÚltimo("hueso");
        lista1.insertarPorÚltimo("pollo");
        lista1.imprimir();

        System.out.println("-------------------------------------");
        lista1.borrarPorDato("pollo");
        lista1.imprimir();

        System.out.println("------------------ ESTARÁ LA LISTA VACÍA? -------------------");
        ListaSEC lista2 = new ListaSEC();
        lista2.estáVacía();
        lista2.imprimir();

    }
}
