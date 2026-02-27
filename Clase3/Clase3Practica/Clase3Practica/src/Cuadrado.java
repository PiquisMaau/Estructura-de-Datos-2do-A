/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Estudiante
 */
public class Cuadrado extends Figura{
    float lado;

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    @Override
    float area() {
        return this.lado * this.lado;
    }
    
    
}
