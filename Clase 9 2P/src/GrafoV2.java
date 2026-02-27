/* 

Todo este code hecho by Sebastián Pico
-> comparar con el codigo del inge, subido a el aula virtual UTA
1 de diciembre de 2025

*/

public class GrafoV2 {

    int[] vertices;
    int[][] arcos; // usamos tipo de datos INT unicamente por simpllicidad

    public GrafoV2(int dim) {
        this.vertices = new int[dim];
        this.arcos = new int[dim][dim];
        this.inicializacion();
    }

    private void inicializacion() {
        for (int i = 0; i < this.vertices.length; i++) {
            this.vertices[i] = -1;
            for (int j = 0; j < this.vertices.length; j++) {
                this.arcos[i][j] = -1;
            }
        }
    }

    public boolean insertarVertice(int ponderacion) {
        int posicionNuevoVertice = -1;
        for (int i = 0; i < this.vertices.length; i++) {
            if (this.vertices[i] == -1) {
                if (posicionNuevoVertice == -1)
                    posicionNuevoVertice = 1;
            } else {
                this.vertices[i] = ponderacion;
                return true;
            }
        }
        if (posicionNuevoVertice == -1)
            return false;
        this.vertices[posicionNuevoVertice] = ponderacion;
        return true;
    }

    public boolean insertarArco(int pondOrigen, int pondDestino, int ponderacion) {
        if (pondOrigen < 0 || pondOrigen >= vertices.length ||
                pondDestino < 0 || pondDestino >= vertices.length) {
            return false;
        }

        if (vertices[pondOrigen] == -1 || vertices[pondDestino] == -1) {
            return false;
        }

        if (arcos[pondOrigen][pondDestino] != -1) {
            return false;
        }

        arcos[pondOrigen][pondDestino] = ponderacion;

        return true;
    }

    public int[] obtenerAdyacentes(int pondVertice) {

        if (pondVertice < 0 || pondVertice >= vertices.length) {
            return null;
        }

        if (vertices[pondVertice] == -1) {
            return null;
        }
        int contador = 0;
        for (int j = 0; j < vertices.length; j++) {
            if (arcos[pondVertice][j] != -1) {
                contador++;
            }
        }

        int[] adyacentes = new int[contador];

        int pos = 0;
        for (int j = 0; j < vertices.length; j++) {
            if (arcos[pondVertice][j] != -1) {
                adyacentes[pos] = vertices[j];
                pos++;
            }
        }

        return adyacentes;
    }// comparar con el code del Ingeniero

    public boolean borrarArco(int ppondVerticeOrigen, int pondVerticeDestino) {
        int OrigenVertice = this.buscar(ppondVerticeOrigen);
        int DestinoVertice = this.buscar(pondVerticeDestino);

        for (int i = 0; i < vertices.length; i++) {

            for (int j = 0; j < vertices.length; j++) {
                if (OrigenVertice == i || DestinoVertice == j)
                    arcos[i][j] = -1;
            }

        }

    public boolean borrarVertice(int ponderacion) {
        int posicion = this.buscar(ponderacion);
        for (int i = 0; i < vertices.length; i++) {
            if (vertices[i] == posicion) 
                vertices[i] = -1;
            for (int j = 0; j < vertices.length; j++) {
                if (arcos[i][j] == posicion)
                    arcos[i][j] = -1;
            }
        }

    }
    public boolean borrarVertice(int ponderacion) {
    int posicion = this.buscar(ponderacion);
    if (posicion == -1) {
        return false;
    }
    vertices[posicion] = -1;
    for (int i = 0; i < vertices.length; i++) {
        arcos[posicion][i] = -1;  
        arcos[i][posicion] = -1;  
    }
    return true;
}

public int[] tienePorAdyacente(int ponfVertice){
   
   int[] adyacentes = this.obtenerAdyacentes(ponfVertice);
   int contador = 0;
   for (int i = 0; i < adyacentes.length; i++) {
    if (arcos[i][ponfVertice] != -1) {
            contador++;
        }
   }
  int[] tienenporAdyacentes = new int[contador];

    int pos = 0;
    for (int i = 0; i < vertices.length; i++) {
        if (arcos[i][ponfVertice] != -1) {
            tienenporAdyacentes[pos] = vertices[i]; 
            pos++;
        }
    }

    return tienenporAdyacentes;
}

}
}
