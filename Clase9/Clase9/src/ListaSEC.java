public class ListaSEC {
    Nodo primero;
    int cant;
    static Nodo ultimo;

    public ListaSEC() {

        this.cant = 0;
    }

    public boolean insertarPorPrimero(Object o) {
        try {
            this.primero = (new Nodo(o, this.primero));
            this.cant++;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    

    

    public boolean borrarPorPos(int pos) {
        if (pos < 0 || pos >= this.cant || this.estáVacía())
            return false;
        if (pos == 0) {
            this.primero = this.primero.siguiente;
        } else {
            Nodo antesDe = this.primero;
            for (int i = 1; i < pos; i++)
                antesDe = antesDe.siguiente;
            antesDe.siguiente = antesDe.siguiente.siguiente;
        }
        this.cant--;
        return true;
    }

    public void limpiar() {
        this.primero = null;
        this.cant = 0;
    }

    public boolean borrarPorDato(Object o) {
        boolean borrado = false;
        while (this.primero != null && this.primero.dato.equals(o)) {
            this.primero = this.primero.siguiente;
            this.cant--;
            borrado = true;
        }
        if (this.primero == null)
            return borrado;
        Nodo aux = this.primero;
        while (aux != null)
            if (aux.siguiente != null)
                if (aux.siguiente.dato.equals(o)) {
                    aux.siguiente = aux.siguiente.siguiente;
                    this.cant--;
                    borrado = true;
                } else
                    aux = aux.siguiente;
            else
                aux = null;
        return borrado;
    }

    
    // -----------------------------------------------------------------------------------------------------

    // 22 de Septiembre de 2025
    // Vamos a trabajar con una lista seuencial circular, a partir de una lista
    // secuenciasl
    // Vamos a implementar metodos para saber pomo modificar una lista secuencial
    // circular

    public boolean estáVacía() {
        return (this.primero == null);
    }


    public void imprimir() {
        if (this.estáVacía()) {
            System.out.println("La lista está vacía");
        } else {
            Nodo aux = this.primero;
            do {
                System.out.println(aux.dato.toString());
                aux = aux.siguiente;
            } while (aux != this.primero);
        }
    }
    

    public boolean AdicionaralInicio() {
        return false;
    }

    public boolean insertar(Object o) {
        Nodo nuevo = new Nodo(o, null);

        Nodo aux = this.primero;
        while (aux.siguiente == primero)
        aux.siguiente = nuevo;
        nuevo.siguiente = primero;

        

        return true;
    }

    //------------------- metodo hecho por el INGE---------------- 

    public boolean insertarPorÚltimo(Object o) {
        if (this.estáVacía()) {
            try {
                this.primero = new Nodo(o, null);
                this.primero.siguiente = this.primero;
                this.cant = 1;
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        // busco al últmo nodo de la lista
        Nodo último = this.primero;
        while (último.siguiente != this.primero)
            último = último.siguiente;
        // intento insertar nodo como siguiente al último
        try {
            último.siguiente = new Nodo(o, this.primero);
            this.cant++;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //metodo hecho por MI

    public boolean InsertaPorPrimero(Object o){
        try {
            this.primero = (new Nodo(o, this.primero));
            this.primero.siguiente = this.primero;
            this.cant++;
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean InsertaPolPrimero(Object o){
        try {
            Nodo nuevo = new Nodo(o, null);
            if (this.primero == null) {
                // Lista vacía: el nuevo nodo se apunta a sí mismo
                nuevo.siguiente = nuevo;
            } else {
                // Lista no vacía: insertar al inicio y actualizar el último nodo
                Nodo ultimo = this.primero;
                while (ultimo.siguiente != this.primero) {
                    ultimo = ultimo.siguiente;
                }
                nuevo.siguiente = this.primero;
                ultimo.siguiente = nuevo;
            }
            this.primero = nuevo;
            this.cant++;
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    

    //------------------- metodo hecho por el INGE---------------- 

    public boolean borrarPorPosCircular(int pos) {
        if (pos < 0 || pos >= this.cant || this.estáVacía())
            return false;
    
        if (this.cant == 1) {
            // Solo hay un nodo, se elimina y la lista queda vacía
            this.primero = null;
        } else if (pos == 0) {
            // Eliminar el primero: actualizar el último nodo
            Nodo ultimo = this.primero;
            while (ultimo.siguiente != this.primero) {
                ultimo = ultimo.siguiente;
            }
            this.primero = this.primero.siguiente;
            ultimo.siguiente = this.primero;
        } else {
            // Eliminar nodo en posición intermedia
            Nodo antesDe = this.primero;
            for (int i = 1; i < pos; i++) {
                antesDe = antesDe.siguiente;
            }
            antesDe.siguiente = antesDe.siguiente.siguiente;
        }
    
        this.cant--;
        return true;
    }



    // metodo hecho por MI

    public boolean borrarPorDatoSec(Object dato) {
        if (this.estáVacía()) return false;
    
        Nodo actual = this.primero;
        Nodo anterior = null;
    
        // Caso especial: si el nodo a borrar es el primero
        if (actual.dato.equals(dato)) {
            if (this.cant == 1) {
                // Solo hay un nodo
                this.primero = null;
            } else {
                // Buscar el último nodo para actualizar su enlace
                Nodo ultimo = this.primero;
                while (ultimo.siguiente != this.primero) {
                    ultimo = ultimo.siguiente;
                }
                this.primero = this.primero.siguiente;
                ultimo.siguiente = this.primero;
            }
            this.cant--;
            return true;
        }
    
        // Recorrer la lista buscando el nodo con el dato
        anterior = actual;
        actual = actual.siguiente;
    
        while (actual != this.primero) {
            if (actual.dato.equals(dato)) {
                anterior.siguiente = actual.siguiente;
                this.cant--;
                return true;
            }
            anterior = actual;
            actual = actual.siguiente;
        }
    
        return false; // Dato no encontrado
    }

    //------------------- metodo hecho por el INGE-----------------------

    public boolean insertarPorPos(Object o, int pos) {
        if (pos < 0 || pos > this.cant || o == null)
            return false;
        if (pos == 0)
            return insertarPorPrimero(o);
        if (pos == this.cant)
            return insertarPorÚltimo(o);
        Nodo antesDeNuevo = this.primero;
        for (int posNuevo = 1; posNuevo < pos; posNuevo++)
            antesDeNuevo = antesDeNuevo.siguiente;
        try {
            antesDeNuevo.siguiente = new Nodo(o, antesDeNuevo.siguiente);
            this.cant++;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Object buscar(Object o) {
        Nodo aux = this.primero;
        while (aux != null) {
            if (aux.dato.equals(o))
                return aux.dato;
            aux = aux.siguiente;
        }
        return null;
    }
    
    


}