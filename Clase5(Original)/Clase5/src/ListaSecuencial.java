public class ListaSecuencial {
    Nodo primero;

    public ListaSecuencial() {
        this.primero = null;
    }

    public boolean insertar(Object o) {

        if (this.primero == null) {
            try {
                this.primero = new Nodo(o, null);
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        Nodo aux = this.primero;
        while (aux.siguiente != null)
            aux = aux.siguiente;
        try {
            aux.siguiente = new Nodo(o, null);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public void Imprimir() {
        if (this.primero == null) {
            System.out.println("Hasta aquí hay datos");
        } else {
            Nodo aux = this.primero;
            while (aux != null) {
                System.out.println(aux.dato);
                aux = aux.siguiente;
            }
        }
    }

    public void ImprimirSaltandoUno() {
        if (this.primero == null) {
            System.out.println("Hasta aquí hay datos");
        } else {
            Nodo aux = this.primero;
            for (int i = 1; aux != null; i++) {
                if (i % 2 != 0) {
                    System.out.println(aux.dato);
                }
                aux = aux.siguiente;
            }

        }

    }

    // A mi manera (Está mal)
    public void CalculaPromedio() {
        Nodo aux = this.primero;
        double Sumatoria = 0;
        int Cantidad = 1;
        for (int i = 1; aux != null; i++) {
            Sumatoria += (double) aux.dato;
            Cantidad += i;
        }
        System.out.println("El promedio es: " + (Sumatoria / Cantidad));

    }

    // Pidiendo ayuda al copilot
    public void calculaPromedio() {
        Nodo aux = this.primero;
        double sumatoria = 0;
        int cantidad = 0;

        while (aux != null) {
            try {
                sumatoria += Double.parseDouble(aux.dato.toString());
                cantidad++;
            } catch (NumberFormatException e) {
                System.out.println("Dato no numérico encontrado: " + aux.dato);
            }
            aux = aux.siguiente;
        }

        if (cantidad > 0) {
            System.out.println("El promedio es: " + (sumatoria / cantidad));
        } else {
            System.out.println("No hay datos numéricos para calcular el promedio.");
        }
    }

}
