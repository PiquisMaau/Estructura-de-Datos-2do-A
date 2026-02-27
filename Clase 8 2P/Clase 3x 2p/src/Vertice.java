import java.util.LinkedList;

class Vertice {

    int valor;

    LinkedList<Arco> arcoSaliente;

    public Vertice(int valor) {
        this.valor = valor;
        this.arcoSaliente = new LinkedList<>();
    }

    public boolean equals(Object o) {
        if (!(o instanceof Vertice)) {
            return false;
        }
        return this.valor == ((Vertice) o).valor;
    }

}
