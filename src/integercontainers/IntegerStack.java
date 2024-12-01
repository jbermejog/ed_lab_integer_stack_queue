package integercontainers;

/**
 * Implementación de una pila de números enteros utilizando una lista enlazada.
 * <p>
 * La pila es una estructura de datos LIFO (Last In, First Out) que permite almacenar y acceder a elementos
 * en orden inverso al que fueron agregados. Esta clase proporciona métodos para apilar, desapilar,
 * inspeccionar el elemento superior y buscar elementos dentro de la pila.
 * <p>
 * <strong>Ejemplo de uso:</strong>
 * <pre>
 *     IntegerStack stack = new IntegerStack();
 *     stack.push(10);
 *     stack.push(20);
 *     System.out.println(stack.top()); // Imprime 20
 *     System.out.println(stack.pop()); // Imprime 20
 *     System.out.println(stack.size()); // Imprime 1
 * </pre>
 */
public class IntegerStack {
    private IntegerNode top; // Referencia al nodo en la cima de la pila
    private int size; // Número de elementos en la pila

    /**
     * Constructor que inicializa una pila vacía.
     */
    public IntegerStack() {
        this.top = null;
        this.size = 0;
    }

    /**
     * Apila un elemento en la cima de la pila.
     * <p>
     * El nuevo elemento se convierte en el elemento superior de la pila.
     *
     * @param i Elemento entero a apilar.
     */
    public void push(Integer i) {
        IntegerNode newNode = new IntegerNode(i);
        newNode.next = top;
        top = newNode;
        size++;
    }

    /**
     * Desapila y devuelve el elemento en la cima de la pila.
     * <p>
     * Si la pila está vacía, devuelve {@code null}.
     *
     * @return El valor del elemento desapilado, o {@code null} si la pila está vacía.
     */
    public Integer pop() {
        if (top == null) return null; // La pila está vacía
        Integer value = top.value;
        top = top.next;
        size--;
        return value;
    }

    /**
     * Devuelve el elemento en la cima de la pila sin desapilarlo.
     * <p>
     * Si la pila está vacía, devuelve {@code null}.
     *
     * @return El valor del elemento en la cima, o {@code null} si la pila está vacía.
     */
    public Integer top() {
        return (top == null) ? null : top.value;
    }

    /**
     * Devuelve el número de elementos actualmente en la pila.
     *
     * @return Tamaño actual de la pila.
     */
    public int size() {
        return size;
    }

    /**
     * Busca un elemento específico en la pila.
     * <p>
     * Recorre la pila desde la cima hasta el fondo para encontrar el elemento especificado.
     *
     * @param i Elemento entero a buscar.
     * @return {@code true} si el elemento está en la pila, {@code false} en caso contrario.
     */
    public boolean search(Integer i) {
        IntegerNode current = top;
        while (current != null) {
            if (current.value.equals(i)) return true;
            current = current.next;
        }
        return false;
    }

    /**
     * Devuelve una representación en texto del contenido de la pila.
     * <p>
     * Los elementos se muestran desde la cima hasta el fondo de la pila, separados por espacios.
     * Si la pila está vacía, devuelve el mensaje "Empty stack".
     *
     * @return Una cadena con los elementos de la pila o "Empty stack" si está vacía.
     */
    @Override
    public String toString() {
        if (top == null) return "Empty stack"; // La pila está vacía
        StringBuilder sb = new StringBuilder();
        IntegerNode current = top;
        while (current != null) {
            sb.append(current.value).append(" ");
            current = current.next;
        }
        return sb.toString().trim();
    }
}
