class ListaDE {
    NodoDE primero;
    int cant;

    public ListaDE() {
        this.primero = null;
        this.cant = 0;
    }

    public boolean estáVacía() {
        return (this.primero == null);
    }

    public void imprimir() {
        if (this.estáVacía())
            System.out.println("La lista está vacía");
        else {
            NodoDE aux = this.primero;
            while (aux != null) {
                System.out.println(aux.dato.toString());
                aux = aux.siguiente;
            }
        }
    }

    public boolean insertarPorPrimero(Object o) {
        try {
            this.primero = (new NodoDE(o, this.primero, null));
            this.cant++;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean insertarPorÚltimo(Object o) {
        if (this.estáVacía()) {
            try {
                this.primero = new NodoDE(o, null, null);
                this.cant = 1;
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        // busco al último nodo de la lista
        NodoDE último = this.primero;
        while (último.siguiente != null)
            último = último.siguiente;
        // intento insertar nodo como siguiente al último
        try {
            último.siguiente = new NodoDE(o, null, último);
            this.cant++;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean insertarPorPos(Object o, int pos) {
        if (pos < 0 || pos > this.cant || o == null)
            return false;
        if (pos == 0)
            return insertarPorPrimero(o);
        if (pos == this.cant)
            return insertarPorÚltimo(o);
        NodoDE antesDeNuevo = this.primero;
        for (int posNuevo = 1; posNuevo < pos; posNuevo++)
            antesDeNuevo = antesDeNuevo.siguiente;
        try {
            antesDeNuevo.siguiente = new NodoDE(o, antesDeNuevo.siguiente, antesDeNuevo);
            if (antesDeNuevo.siguiente.siguiente != null)
                antesDeNuevo.siguiente.siguiente.anterior = antesDeNuevo.siguiente;
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
            this.primero.anterior = null;
        } else {
            NodoDE antesDe = this.primero;
            for (int i = 1; i < pos; i++)
                antesDe = antesDe.siguiente;
            antesDe.siguiente = antesDe.siguiente.siguiente;
            antesDe.siguiente.anterior = antesDe;
        }
        this.cant--;
        return true;
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
        NodoDE aux = this.primero;
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

    public Object buscar(Object o) {
        NodoDE aux = this.primero;
        while (aux != null) {
            if (aux.dato.equals(o))
                return aux.dato;
            aux = aux.siguiente;
        }
        return null;
    }

}
