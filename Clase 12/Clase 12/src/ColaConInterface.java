import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class ColaConInterface {
    public static void main(String[] args) {

        Queue<Integer> colaLinked = new LinkedList<>();

        System.out.println("Está la cola VACÍA?: " + colaLinked.isEmpty());
        System.out.println("ELIMINAR UN ELEMENTO DE LA COLA: " + colaLinked.poll()); // null


        colaLinked.offer(100);
        System.out.println("\ncolaLinked con un solo elemento:");
        System.out.println(colaLinked);
        System.out.println("Numero eliminadp: " + colaLinked.poll());
        System.out.println("Verificación si se vacio: " + colaLinked.isEmpty());

        colaLinked.offer(10);
        colaLinked.add(20);
        colaLinked.offer(30);
        colaLinked.add(40);
        colaLinked.offer(50);


        System.out.println("\ncolaLinked con varios elementos:");
        System.out.println(colaLinked);

        System.out.println("Numeros eliminado: " + colaLinked.poll()+ colaLinked.remove());
        System.out.println("cola después de eliminar:");
        System.out.println(colaLinked);


        Queue<Integer> colaPrioridad = new PriorityQueue<>();

        colaPrioridad.offer(40);
        colaPrioridad.offer(10);
        colaPrioridad.offer(30);
        colaPrioridad.offer(20);
        colaPrioridad.offer(50);

        System.out.println("\ncola con Prioridad después de insertar:");
        System.out.println(colaPrioridad); 


        System.out.println("Numero con mayor prioridad (peek): " + colaPrioridad.peek());
        System.out.println("Numero eliminado: " + colaPrioridad.poll());
        System.out.println("cola con Prioridad después de eliminar:");
        System.out.println(colaPrioridad);

        System.out.println("Está la cola VACÍA?: " + colaPrioridad.isEmpty());
        System.out.println("Tamaño actual: " + colaPrioridad.size());
    }
}