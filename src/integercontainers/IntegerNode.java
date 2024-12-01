package integercontainers;

/**
 * Clase que representa un nodo individual en una pila de números enteros.
 * @author José Javier Bermejo González
 * @version 1/12/2024 1.0
 * @see <a href="">Repositorio de Github del lab</a>
 * <p>
 * Cada nodo almacena un valor entero y una referencia al siguiente nodo en la pila.
 * Esta clase es utilizada internamente por {@link IntegerStack} y por {@link IntegerQueue} para construir la estructura de la pila y cola.
 */
class IntegerNode {
    Integer value; // Valor almacenado en el nodo
    IntegerNode next; // Referencia al siguiente nodo

    /**
     * Constructor que inicializa el nodo con un valor específico.
     *
     * @param value Valor entero que será almacenado en el nodo.
     */
    IntegerNode(Integer value) {
        this.value = value;
        this.next = null;
    }
}