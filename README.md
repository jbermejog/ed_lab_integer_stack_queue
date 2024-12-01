# Proyecto: Implementación de Pilas y Colas en Java

Este proyecto implementa dos estructuras de datos fundamentales: **Pilas** y **Colas** en Java, utilizando listas enlazadas para la gestión de los nodos. Es parte del laboratorio de la asignatura de Estructura de Datos en el Grado de Ingeniería Informática de la Universidad Internacional de La Rioja.

## Descripción General

- **Pila (`IntegerStack`)**: Estructura LIFO (*Last In, First Out*).
- **Cola (`IntegerQueue`)**: Estructura FIFO (*First In, First Out*).
- **Nodo (`IntegerNode`)**: Clase común para ambos contenedores, encapsula el dato y la referencia al siguiente nodo.

Estas estructuras fueron diseñadas para practicar la implementación de TADs (Tipos Abstractos de Datos) dinámicos y comprender sus aplicaciones.

## Funcionalidades

### Pila (`IntegerStack`)
- `push(Integer i)`: Inserta un elemento en la cima de la pila.
- `pop()`: Elimina y retorna el elemento en la cima.
- `top()`: Retorna el elemento en la cima sin eliminarlo.
- `size()`: Retorna el número de elementos en la pila.
- `search(Integer i)`: Busca un elemento en la pila.

### Cola (`IntegerQueue`)
- `insert(Integer i)`: Inserta un elemento al final de la cola.
- `remove()`: Elimina y retorna el elemento al frente.
- `seek()`: Retorna el elemento al frente sin eliminarlo.
- `size()`: Retorna el número de elementos en la cola.
- `search(Integer i)`: Busca un elemento en la cola.

## Estructura del Proyecto

El proyecto consta de las siguientes clases:
- **`IntegerNode`**: Representa un nodo en las estructuras enlazadas.
- **`IntegerStack`**: Implementación de una pila dinámica.
- **`IntegerQueue`**: Implementación de una cola dinámica.
- **`Main`**: Clase de pruebas que demuestra el uso de las estructuras.

## Ejecución

1. **Compilación y Ejecución**:
    - Asegúrate de tener configurado un entorno de desarrollo para Java (JDK 8 o superior).
    - Compila y ejecuta la clase `Main` para observar las pruebas realizadas.

2. **Ejemplo de Uso**:
```java
   IntegerStack stack = new IntegerStack();
   stack.push(10);
   stack.push(20);
   System.out.println(stack.top()); // Imprime 20
   System.out.println(stack.pop()); // Imprime 20

   IntegerQueue queue = new IntegerQueue();
   queue.insert(100);
   queue.insert(200);
   System.out.println(queue.seek()); // Imprime 100
   System.out.println(queue.remove()); // Imprime 100
```
## Pruebas
Se han realizado pruebas básicas para asegurar el correcto funcionamiento de las operaciones de inserción, eliminación, y consulta tanto en pilas como en colas. Los resultados se pueden visualizar ejecutando la clase Main.

## Tecnologías Utilizadas
Java: Lenguaje de programación.
intelliJ (opcional): IDE sugerido para desarrollar y depurar el proyecto.

