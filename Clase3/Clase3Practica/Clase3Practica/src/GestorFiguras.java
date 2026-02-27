/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Estudiante
 */
class GestorFiguras {
    Figura[] figuras;
    int contador = 0;

    public GestorFiguras(int cantMáxFigs){
        this.figuras = new Figura[cantMáxFigs];
    }

    public void agregarFigura(Figura f) {
        if (contador < figuras.length) {
            figuras[contador] = f;
            contador++;
        }
}
}
