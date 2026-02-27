public class ListaSEC {
    Nodo primero;
    int cant;

    public ListaSEC() {
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
            Nodo aux = this.primero;
            do {
                System.out.println(aux.dato.toString());
                aux = aux.siguiente;
            } while (aux != this.primero);
        }
    }

    public boolean insertarPorPrimero(Object o) {
        try {
            Nodo último = this.último();
            this.primero = new Nodo(o, this.primero);
            if (último == null)
                this.primero.siguiente = this.primero;
            else
                último.siguiente = this.primero;
            this.cant++;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

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
        Nodo último = this.último();
        // intento insertar nodo como siguiente al último
        try {
            último.siguiente = new Nodo(o, this.primero);
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

    public boolean borrarPorPos(int pos) {
        if (pos < 0 || pos >= this.cant || this.estáVacía())
            return false;
        if (pos == 0) {
            if (this.cant == 1) {
                this.primero = null;
            } else {
                Nodo último = this.último();
                this.primero = this.primero.siguiente;
                último.siguiente = this.primero;
            }
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
            borrado = this.borrarPorPos(0);
        }
        if (this.primero == null || this.primero.siguiente == this.primero)
            return borrado;

        Nodo aux = this.primero;
        do {
            if (aux.siguiente.dato.equals(o)) {
                aux.siguiente = aux.siguiente.siguiente;
                this.cant--;
                borrado = true;
            } else
                aux = aux.siguiente;
        } while (aux.siguiente != this.primero);
        return borrado;
    }

    public Object buscar(Object o) {
        if (this.estáVacía())
            return null;
        Nodo aux = this.primero;
        do {
            if (aux.dato.equals(o))
                return aux.dato;
            aux = aux.siguiente;
        } while (aux != this.primero);
        return null;
    }

    private Nodo último() {
        if (this.estáVacía())
            return null;
        Nodo último = this.primero;
        while (último.siguiente != this.primero)
            último = último.siguiente;
        return último;
    }
}