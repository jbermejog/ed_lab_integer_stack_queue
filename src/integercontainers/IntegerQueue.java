package integercontainers;

/**
 * Implementación de una cola de números enteros utilizando una lista enlazada.
 * @author José Javier Bermejo González
 * @version 1/12/2024 1.0
 * @see <a href="">Repositorio de Github del lab</a>
 * <p>
 * La cola es una estructura de datos FIFO (First In, First Out) que permite almacenar y acceder a elementos
 * en el orden en que fueron agregados. Esta clase proporciona métodos para insertar elementos, eliminarlos,
 * inspeccionar el elemento al frente y buscar elementos dentro de la cola.
 * <p>
 * <strong>Ejemplo de uso:</strong>
 * <pre>
 *     IntegerQueue queue = new IntegerQueue();
 *     queue.insert(10);
 *     queue.insert(20);
 *     System.out.println(queue.seek()); // Imprime 10
 *     System.out.println(queue.remove()); // Imprime 10
 *     System.out.println(queue.size()); // Imprime 1
 * </pre>
 */
public class IntegerQueue {
    private IntegerNode front; // Referencia al primer nodo de la cola
    private IntegerNode rear;  // Referencia al último nodo de la cola
    private int size;          // Número de elementos en la cola

    /**
     * Constructor que inicializa una cola vacía.
     */
    public IntegerQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    /**
     * Inserta un elemento al final de la cola.
     *
     * @param i Elemento entero a insertar.
     */
    public void insert(Integer i) {
        IntegerNode newNode = new IntegerNode(i);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    /**
     * Elimina y devuelve el elemento al frente de la cola.
     * <p>
     * Si la cola está vacía, devuelve {@code null}.
     *
     * @return El valor del elemento eliminado, o {@code null} si la cola está vacía.
     */
    public Integer remove() {
        if (front == null) return null;
        Integer value = front.value;
        front = front.next;
        if (front == null) rear = null;
        size--;
        return value;
    }

    /**
     * Devuelve el elemento al frente de la cola sin eliminarlo.
     * <p>
     * Si la cola está vacía, devuelve {@code null}.
     *
     * @return El valor del elemento al frente, o {@code null} si la cola está vacía.
     */
    public Integer seek() {
        return (front == null) ? null : front.value;
    }

    /**
     * Devuelve el número de elementos actualmente en la cola.
     *
     * @return Tamaño actual de la cola.
     */
    public int size() {
        return size;
    }

    /**
     * Busca un elemento específico en la cola.
     * <p>
     * Recorre la cola desde el frente hasta el final para encontrar el elemento especificado.
     *
     * @param i Elemento entero a buscar.
     * @return {@code true} si el elemento está en la cola, {@code false} en caso contrario.
     */
    public boolean search(Integer i) {
        IntegerNode current = front;
        while (current != null) {
            if (current.value.equals(i)) return true;
            current = current.next;
        }
        return false;
    }

    /**
     * Devuelve una representación en cadena del contenido de la cola.
     * <p>
     * Los elementos se muestran desde el frente hasta el final de la cola, separados por espacios.
     * Si la cola está vacía, devuelve el mensaje "Empty queue".
     *
     * @return Una cadena con los elementos de la cola o "Empty queue" si está vacía.
     */
    @Override
    public String toString() {
        if (front == null) return "Empty queue";
        StringBuilder sb = new StringBuilder();
        IntegerNode current = front;
        while (current != null) {
            sb.append(current.value).append(" ");
            current = current.next;
        }
        return sb.toString().trim();
    }
}
