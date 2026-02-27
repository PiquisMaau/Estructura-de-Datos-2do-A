import java.util.LinkedList;

public class grafo {

    LinkedList<Vertice> vertices;
    LinkedList<Arco> arcos;

    boolean insertarVertice(int valor) {

        Vertice nuevoVertice = new Vertice(valor);
        if (this.vertices.contains(nuevoVertice))
            return false;
        return vertices.add(new Vertice(valor));
    }

    // metodo hecho por mi :)
    boolean insertarArco(int verticeOrigen, int verticeDestino, int ponderacion) {
        Vertice origen = null;
        Vertice destino = null;
        for (Vertice v : vertices) {
            if (v.valor == verticeOrigen)
                origen = v;
            if (v.valor == verticeDestino)
                destino = v;
        }
        if (origen == null || destino == null)
            return false;

        Arco nuevoArco = new Arco(origen, destino, ponderacion);

        // validacion de la operacion de agregacion en cada lista hecha pol mi ->
        boolean agregadoEnOrigen = origen.arcoSaliente.add(nuevoArco);
        boolean agregadoEnLista = this.arcos.add(nuevoArco);

        if (agregadoEnOrigen && agregadoEnLista) {
            System.out.println("El arco se agrego correctamente en ambos lugares");
            return true;
        } else if (agregadoEnOrigen && !agregadoEnLista) {
            origen.arcoSaliente.remove(nuevoArco);
            System.out.println(
                    "Se elimino en la lista de arcos Salientes del vertice porque no se pudo agregar a los arcos generales");
            return false;
        } else if (!agregadoEnOrigen && agregadoEnLista) {
            this.arcos.remove(nuevoArco);
            System.out.println(
                    "No se pudo agregar en los arcos salientes por ende no se agrega a la losta de arcos del grafo");
            return false;
        } else {
            System.out.println("No se pudo agregar en ninguna lista");
            return false;
        }
    }

    public LinkedList<Vertice> adyacentes(int valor) {
        // LinkedList adyacentes = new LinkedList<Vertice>(new Arco(null, null, valor));
        Vertice vertice = null, verticeBuscado = new Vertice(valor);
        for (Vertice v : this.vertices) {
            if (v.equals(verticeBuscado)) {
                vertice = v;
                break;
            }
        }
        if (vertice == null)
            return null;

        LinkedList<Vertice> adyacentes = new LinkedList<>();

        for (Arco a : vertice.arcoSaliente) {
            adyacentes.add(a.destino);
        }
        return adyacentes;
    }

}
