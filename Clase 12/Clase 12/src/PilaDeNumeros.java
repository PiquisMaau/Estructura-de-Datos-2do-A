import java.util.Stack;

public class PilaDeNumeros {
    public static void main(String[] args) {

        Stack<Integer> pila = new Stack<>();


        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);
        pila.push(50);
        pila.push(60);
        pila.push(70);


        System.out.println("Pila después de insertar:");
        System.out.println(pila);

        System.out.println("Numero PEEK " + pila.peek());

        System.out.println("Pela vacia: " + pila.empty());


        int posicion = pila.search(30); 
        System.out.println("Posición del número 30 desde PEEK: " + posicion);

        System.out.println("Numeros eliminados: " + pila.pop()+ pila.pop()); 

        System.out.println("Pila después de eliminar:");
        System.out.println(pila);

        while (!pila.empty()) {
            System.out.println("Eliminando: " + pila.pop());
        }

        System.out.println("Se vació la pila?: " + pila.empty());
    }
}
