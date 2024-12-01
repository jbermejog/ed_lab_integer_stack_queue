package integercontainers;

/**
 * Clase principal que demuestra el uso de las estructuras de datos {@link IntegerStack} e {@link IntegerQueue}.
 * @author José Javier Bermejo González
 * @version 1/12/2024 1.0
 * @see <a href="">Repositorio de Github del lab</a>
 * <p>
 * Esta aplicación realiza pruebas básicas requeridas de las operaciones disponibles en la pila y la cola,
 * mostrando los resultados en la consola para ilustrar su funcionamiento según Laboratorio.
 */
public class Main {

    /**
     * Método principal que ejecuta las pruebas de {@link IntegerStack} y {@link IntegerQueue}.
     */
    public static void main(String[] args) {
        // Prueba de IntegerStack
        System.out.println("=== Pruebas del IntegerStack ===");
        IntegerStack stack = new IntegerStack();
        System.out.println("Pila inicial: " + stack);

        // Prueba de pila vacía
        System.out.println("Cima de pila vacía: " + stack.top());
        System.out.println("Desapilar pila vacía: " + stack.pop());
        System.out.println("Tamaño de pila vacía: " + stack.size());
        System.out.println("Buscar en pila vacía: " + stack.search(0));
        System.out.println("Pila después de operaciones: " + stack);

        // Apilando elementos en la pila
        stack.push(11);
        stack.push(25);
        stack.push(30);
        System.out.println("Pila después de apilar elementos: " + stack);

        // Operaciones sobre la pila
        System.out.println("Cima de la pila: " + stack.top());
        System.out.println("Tamaño de la pila: " + stack.size());
        System.out.println("Desapilar: " + stack.pop());
        System.out.println("Pila después de desapilar: " + stack);
        System.out.println("Busca el 11 en la pila devuelve: " + stack.search(11));

        // Prueba de IntegerQueue
        System.out.println("\n=== Pruebas del IntegerQueue ===");
        IntegerQueue queue = new IntegerQueue();

        // Prueba de cola vacía
        System.out.println("Cola inicial: " + queue);
        System.out.println("Desencolar cola vacia: " + queue.remove());
        System.out.println("Cabeza de cola vacia: " + queue.seek());
        System.out.println("Tamaño de cola vacia: " + queue.size());
        System.out.println("Buscar en cola vacia: " + queue.search(0));
        System.out.println("Cola después de operaciones: " + queue);

        // Insertando elementos en la cola
        queue.insert(101);
        queue.insert(202);
        queue.insert(303);
        System.out.println("Cola después de encolar: " + queue);

        // Operaciones sobre la cola
        System.out.println("Cabeza de la cola: " + queue.seek());
        System.out.println("Tamaño de la cola: " + queue.size());
        System.out.println("Desencolar: " + queue.remove());
        System.out.println("Cola después de desencolar: " + queue);
        System.out.println("Busca el 202 devuelve: " + queue.search(202));
    }
}
