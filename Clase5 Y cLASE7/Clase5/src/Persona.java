/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed2526tilistasecuencial;

/**
 *
 * @author Usuario
 */
public class Persona {



    // Atributos
    String nombre;
    private Persona mejorAmigo;

    // Constructor
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter de nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter de mejorAmigo
    public Persona getMejorAmigo() {
        return mejorAmigo;
    }

    public void setMejorAmigo(Persona mejorAmigo) {
        this.mejorAmigo = mejorAmigo;
    }

  
}


