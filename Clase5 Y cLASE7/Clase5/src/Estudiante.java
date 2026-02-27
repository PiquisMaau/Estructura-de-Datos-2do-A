/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed2526tilistasecuencial;

/**
 *
 * @author Usuario
 */
public class Estudiante extends Persona{
    Estudiante siguiente;

    public Estudiante(Estudiante siguiente, String nombre) {
        super(nombre);
        this.siguiente=siguiente;
    }
    
    
}
