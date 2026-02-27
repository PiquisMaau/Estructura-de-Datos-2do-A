import java.util.ArrayList;
import java.util.List;

public class NodoGnral {

    int dato;
    List<ArbolGeneral> hijos;

    public NodoGnral(int dato) {
        this.dato = dato;
        this.hijos = new ArrayList<>();
    }
    boolean buscar(int dato){
        if(this.dato == dato) return true;
        boolean encontrado = false;
        int posicionActuaol = 0; 
        while(posicionActuaol < this.hijos.size()){
            encontrado = this.hijos.get(posicionActuaol).buscar(dato);
            if(encontrado)return true;
            posicionActuaol++;
        }
        return false;
    }
     private NodoGnral buscarDatoPadre(int dato){
        if(this.dato == dato) return this;
        NodoGnral encontrado = null;
        int posicionActuaol = 0;
        while(posicionActuaol < this.hijos.size()){
            encontrado = this.hijos.get(posicionActuaol).buscar(dato);
            if(encontrado != null)return encontrado;
            posicionActuaol++;
        }
        return null;
    }
}
