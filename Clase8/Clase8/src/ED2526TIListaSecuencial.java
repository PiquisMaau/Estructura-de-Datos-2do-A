/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ed2526tilistasecuencial;

/**
 *
 * @author Usuario
 */
public class ED2526TIListaSecuencial {

    public static void main(String[] args) {
        /*Persona primeraPersona = new Persona("Juan");

        primeraPersona.setMejorAmigo(new Persona("Jose"));
        Persona Maria = new Persona("Maria");
        primeraPersona.getMejorAmigo().setMejorAmigo(Maria);
        Maria.setMejorAmigo(primeraPersona);

        /*
        if (Maria.getMejorAmigo() != null)
            System.out.println("el mejor amigo de " + Maria.nombre + " es: " + Maria.getMejorAmigo().nombre);
        */

        /*if (primeraPersona.getMejorAmigo().getMejorAmigo().getMejorAmigo() != null) {
            System.out.println("el mejor amigo de " + Maria.nombre +
                               " es: " + primeraPersona.getMejorAmigo().getMejorAmigo().getMejorAmigo().nombre);
        } else {
            System.out.println("Maria no tiene mejor amigo");
        }

       /* System.out.println("El mejor amigo de " + primeraPersona.nombre +
                           " es: " + primeraPersona.getMejorAmigo().nombre);*/
        /*System.out.println( primeraPersona.getMejorAmigo().getMejorAmigo().getMejorAmigo().nombre);
    }
}/*/
       /* Estudiante primerEstudiante = new Estudiante (null,"Katerine");
        primerEstudiante.siguiente =new Estudiante (null, "sz");*/
 ListaSE conjuntoNumeros=new ListaSE();
  System.out.println("=== Insertando elementos al final ===");
        conjuntoNumeros.insertar(5); 
        conjuntoNumeros.insertar(3);
        conjuntoNumeros.insertar(10);
        conjuntoNumeros.imprimir();

        System.out.println("\n=== Impresión saltando uno ===");
        conjuntoNumeros.imprimirSaltandoUno();

        System.out.println("\n=== Promedio de la lista ===");
        System.out.println("Promedio: " + conjuntoNumeros.promedio());

        System.out.println("\n=== Insertando al inicio ===");
        conjuntoNumeros.insertarAlInicio(5);
        conjuntoNumeros.imprimir();

        System.out.println("\n=== Insertando en posición 2 (valor 15) ===");
        conjuntoNumeros.insertarEnPosicion(2, 15);
        conjuntoNumeros.imprimir();

        System.out.println("\n=== Borrando nodo en posición 3 ===");
        conjuntoNumeros.borrarPorPosicion(3);
        conjuntoNumeros.imprimir();

        System.out.println("\n=== Modificando nodo en posición 1 (nuevo valor 99) ===");
        conjuntoNumeros.modificarEnPosicion(1, 99);
        conjuntoNumeros.imprimir();
    
    }
}

