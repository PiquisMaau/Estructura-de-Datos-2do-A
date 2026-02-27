//Se vió un recorderis de la clase anterior :)
public class Clase3 {
    private final int NOTA_DEFECTO = -1;
    
    private int cantMaterias;
    private Float[] notas;
    private int cantNotasRegistradas;

    public Clase3(int cantMaterias) {
        this.cantMaterias = cantMaterias;
        this.notas = new Float[cantMaterias];
        this.cantNotasRegistradas = 0;
        //this.inicializar();
    }
/*
    private void inicializar() {
        for (int i = 0; i < this.cantMaterias; i++)
            this.notas[i] = (float)this.NOTA_DEFECTO;
    }
*/    
    public boolean registrar(Float nota){
        if ( nota == null || nota.floatValue() < 0 || nota.floatValue() > 10 )
            return false;                 
        /*
        for (int i = 0; i < this.cantMaterias; i++)
            if (this.notas[i] == null){
                this.notas[i] = value;
                return true;
            }
        return false;
        */
        if (this.cantNotasRegistradas < this.cantMaterias){
            this.notas[cantNotasRegistradas] = nota;
            this.cantNotasRegistradas ++;
            return true;
        }
        return false;
    }
    
    public float promedio(){
        if (this.cantNotasRegistradas == 0)
            return -1;
        float suma = 0;
        for (int i = 0; i < this.cantNotasRegistradas; i++){
            suma += this.notas[i];
        }
        return suma / cantNotasRegistradas;
        /*
        int cant = 0;
        
        for (Float valor : this.notas){
            if ( valor != null ){
                suma += valor;
                cant ++;
            }
        }
        
        return (cant == 0) ? -1 : suma / cant;  
       */
    }
    
    public boolean borrar(int índice){
        if (índice < 0 || índice > this.cantNotasRegistradas - 1)
            return false;
        this.notas[índice] = null;
        this.cantNotasRegistradas --;
        if (índice < this.cantNotasRegistradas){
            this.notas[índice] = this.notas[this.cantNotasRegistradas];
        }
        return true;
    }
}