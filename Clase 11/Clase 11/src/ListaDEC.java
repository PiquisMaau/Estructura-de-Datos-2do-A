
class ListaDEC {
    NodoDE primero;
    int    cant; 
    
    public ListaDEC() {
        this.primero = null;
        this.cant = 0;
    }
    
    public boolean estáVacía(){
        return (this.primero == null);
        //return this.cant == 0;
    }
    
    public boolean limpiar(){
        this.primero = null;
        return true;
    }
    
    public NodoDE último(){
        return (this.primero == null) ? null : this.primero.anterior;
    }
    
    public void imprimir(){
        if (this.estáVacía())
            System.out.println("La lista está vacía");
        else{
            NodoDE aux = this.primero;
            do{
                System.out.println(aux.dato.toString());
                aux = aux.siguiente;
            } while (aux != this.primero);
        }
    }
    
    public void imprimirAlrevés(){
        if (this.estáVacía())
            System.out.println("La lista está vacía");
        else{
            NodoDE aux = this.último();
            do{
                System.out.println(aux.dato.toString());
                aux = aux.anterior;
            } while (aux != this.último());
        }
    }
    
    public boolean insertarPorPrimero(Object o){
        if (o == null) return false;
        try{
            this.primero = (new NodoDE(o, this.primero, this.último()));
        } catch (Exception e){
            return false;
        }
        if (this.cant == 0)
            this.primero.anterior = this.primero.siguiente = this.primero;
        else{
            this.primero.anterior.siguiente = this.primero;
            this.primero.siguiente.anterior = this.primero;
        }
        this.cant ++;
        return true;
    }
    
    public boolean insertarPorÚltimo(Object o){
        if (o == null) return false;
        if (this.estáVacía()){
            try{
                this.primero = new NodoDE(o, null, null);
            } catch (Exception e){
                return false;
            }
            this.primero.anterior = this.primero.siguiente = this.primero;
            this.cant = 1;
            return true;
        }
        NodoDE último = this.último();
        try{
            último.siguiente = new NodoDE(o, this.primero, último);
        } catch (Exception e){
            return false;
        }
        this.primero.anterior = último.siguiente;
        this.cant ++;
        return true;
    }
    
    public boolean insertarPorPos(Object o, int pos){
        if (pos < 0 || pos > this.cant || o == null) return false;
        if (pos == 0) return insertarPorPrimero(o);
        if (pos == this.cant) return insertarPorÚltimo(o);
        NodoDE antesDeNuevo = this.primero;
        for (int posNuevo = 1; posNuevo < pos; posNuevo ++)
            antesDeNuevo = antesDeNuevo.siguiente;
        try{
            antesDeNuevo.siguiente = new NodoDE(o, antesDeNuevo.siguiente, antesDeNuevo);
        } catch (Exception e){
            return false;
        }
        antesDeNuevo.siguiente.siguiente.anterior = antesDeNuevo.siguiente;
        this.cant ++;
        return true;
    }
    
    public boolean borrarPorPos(int pos){
        if (pos < 0 || pos >= this.cant || this.estáVacía()) return false;
        if (pos == 0){
          if (this.cant == 1){
              this.primero = null;
          } else{  
          this.primero = this.primero.siguiente;
          this.primero.anterior = this.primero.anterior.anterior;
          }
        } else{
            NodoDE antesDe = this.primero;
            for (int i = 1; i < pos; i++)
                antesDe = antesDe.siguiente;
            antesDe.siguiente = antesDe.siguiente.siguiente;
            antesDe.siguiente.anterior = antesDe;
        }
        this.cant --;
        return true;
    }
    
    public boolean borrarPorDato(Object o){
        if (this.estáVacía()) return false;
        boolean borrado = false;
        while (this.primero != null && this.primero.dato.equals(o)){
            if (this.cant == 1){
                this.primero = null;
                this.cant = 0;
                return true;
            }
            this.primero = this.primero.siguiente;
            this.primero.anterior = this.primero.anterior.anterior;
            this.cant --;
            borrado = true;
        }
        NodoDE aux = this.primero;
        for (int i = 0; i < this.cant; i++)
            if (aux.siguiente.dato.equals(o)){
                aux.siguiente = aux.siguiente.siguiente;
                aux.siguiente.anterior = aux;
                this.cant --;
                borrado = true;
            } else
                aux = aux.siguiente;
        return borrado;
    }
    
    public Object buscar(Object o){
        if (this.estáVacía()) return null;
        NodoDE aux = this.primero;
        do {
            if (aux.dato.equals(o)) return aux.dato;
            aux = aux.siguiente;
        } while (aux != this.primero);
        return null;
    }
    
    public Object otroBuscar(Object o){
        if (this.estáVacía()) return null;
        NodoDE aux = this.primero;
        for (int i = 0; i < this.cant; i++){
            if (aux.dato.equals(o)) return aux.dato;
            aux = aux.siguiente;
        } 
        return null;
    }
    
}
