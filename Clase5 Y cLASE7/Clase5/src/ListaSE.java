/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed2526tilistasecuencial;

/**
 *
 * @author Usuario
 */
public class ListaSE {
    Nodo primero;

    public ListaSE() {
        this.primero = null;
    }

    public boolean insertar(Object o) {
        Nodo nuevo = new Nodo(o, null);
        if (this.primero == null) {
            this.primero = nuevo;
        } else {
            Nodo aux = this.primero;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }
        return true;
    }

    public void imprimir() {
        if (this.primero == null) {
            System.out.println("La lista está vacía");
            return;
        }
        Nodo aux = this.primero;
        while (aux != null) {
            System.out.println(aux.dato);
            aux = aux.siguiente;
        }
    }

    public void imprimirSaltandoUno() {
        if (this.primero == null) {
            System.out.println("La lista está vacía");
            return;
        }
        Nodo aux = this.primero;
        int contador = 1;
        while (aux != null) {
            if (contador % 2 != 0) {
                System.out.println(aux.dato);
            }
            aux = aux.siguiente;
            contador++;
        }
    }

   public double promedio() {
    if (this.primero == null) {
        return -1; // La lista está vacía, no se puede calcular promedio
    }

    int suma = ((Integer) this.primero.dato).intValue(); // Primer nodo
    int cant = 1;

    Nodo aux = this.primero.siguiente;
    while (aux != null) {
        suma += ((Integer) aux.dato).intValue();
        cant++;
        aux = aux.siguiente;
    }

    return (double) suma / cant;
}
   // Inserta al inicio
    public void insertarAlInicio(Object o) {
        Nodo nuevo = new Nodo(o, this.primero);
        this.primero = nuevo;
    }

    // Inserta en una posición específica
    public boolean insertarEnPosicion(int pos, Object o) {
        if (pos < 0) return false;

        if (pos == 0) {
            insertarAlInicio(o);
            return true;
        }

        Nodo aux = this.primero;
        int contador = 0;

        while (aux != null && contador < pos - 1) {
            aux = aux.siguiente;
            contador++;
        }

        if (aux == null) return false; // posición inválida

        Nodo nuevo = new Nodo(o, aux.siguiente);
        aux.siguiente = nuevo;
        return true;
    }

    // Borrar nodo por posición
    public boolean borrarPorPosicion(int pos) {
        if (this.primero == null || pos < 0) return false;

        if (pos == 0) {
            this.primero = this.primero.siguiente;
            return true;
        }

        Nodo aux = this.primero;
        int contador = 0;

        while (aux.siguiente != null && contador < pos - 1) {
            aux = aux.siguiente;
            contador++;
        }

        if (aux.siguiente == null) return false; // posición inválida

        aux.siguiente = aux.siguiente.siguiente;
        return true;
    }

    // Modificar un valor en una posición dada
    public boolean modificarEnPosicion(int pos, Object nuevoValor) {
        if (this.primero == null || pos < 0) return false;

        Nodo aux = this.primero;
        int contador = 0;

        while (aux != null && contador < pos) {
            aux = aux.siguiente;
            contador++;
        }

        if (aux == null) return false; // posición inválida

        aux.dato = nuevoValor;
        return true;
    }

    //15 DE SEPTIEMBRE 2025
    public boolean insertarPorPrimero(Object o){
        try{
            Nodo aux = new Nodo(o, this.primero);
            this.primero = aux;
            return true;
        }catch(Exception e){

        
        return false;
    }

} 

}