public class mAIN {
    public static void main(String[] args) {
        ListaDEC lista = new ListaDEC();

        System.out.println("¿Está vacía?: " + lista.estáVacía());

        // Insertar elementos al principio
        lista.insertarPorPrimero("A");
        lista.insertarPorPrimero("B");
        lista.insertarPorPrimero("C");

        System.out.println("\nLista después de insertar por primero:");
        lista.imprimir();

        // Insertar elementos al final
        lista.insertarPorÚltimo("D");
        lista.insertarPorÚltimo("E");

        System.out.println("\nLista después de insertar por último:");
        lista.imprimir();

        // Insertar en posición específica
        lista.insertarPorPos("X", 2); // Insertar en la posición 2

        System.out.println("\nLista después de insertar 'X' en la posición 2:");
        lista.imprimir();

        // Buscar elementos
        System.out.println("\n¿Existe 'B'?: " + lista.buscar("B"));
        System.out.println("¿Existe 'Z'?: " + lista.buscar("Z"));

        // Borrar por posición
        lista.borrarPorPos(0); // Eliminar el primero
        lista.borrarPorPos(lista.cant - 1); // Eliminar el último

        System.out.println("\nLista después de borrar primero y último:");
        lista.imprimir();

        // Borrar por dato
        lista.insertarPorÚltimo("X");
        lista.insertarPorÚltimo("X");
        lista.borrarPorDato("X");

        System.out.println("\nLista después de borrar todos los 'X':");
        lista.imprimir();

        // Imprimir al revés
        System.out.println("\nImpresión al revés:");
        lista.imprimirAlrevés();

        // Buscar con otro método
        System.out.println("\n¿Existe 'C' con otroBuscar?: " + lista.otroBuscar("C"));

        // Limpiar lista
        lista.limpiar();
        System.out.println("\nLista después de limpiar:");
        lista.imprimir();
    }
}
