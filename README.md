# Patrones de Diseño en Java.

## Introducción.

Christopher Alexander dice “Cada patrón describe un problema que ocurre una y otra vez en nuestro entorno, para luego proponer el núcleo de la solución, de tal forma que esa solución puede ser usada millones de veces sin siquiera hacerlo dos veces de la misma forma”.

En otra definición, “Los patrones de diseño son el esqueleto de las soluciones a problemas comunes en el desarrollo de software.”

La siguiente es una lista de patrones de diseño con descripcipnes breves y con aplicaciones en ejemplos muy sencillos de entender.

## <a name="lista-de-patrones">Lista de Patrones de Diseño.</a>

### Patrones de Creación (Creational Patterns)

Relativos al proceso de creación de un objeto.

* [Factory](#factory)

### Patrones de Estructura (Structural Patterns)

Composición de clases u objetos.

* Nothing yet.

### Patrones de Comportamiento (Behavioral Patterns)

Forma en que clases las u objetos interaccionan y distribuyen funcionalidades.

* [Strategy](#strategy)
* [Observer](#observer)

## <a name="strategy">Strategy</a> [&#8593;](#lista-de-patrones)

**Propósito:** Definir una familia de algoritmos, encapsular cada uno, y que sean intercambiables. Strategy permite al algoritmo variar independientemente de los clientes que lo utilizan.

**Aplicación:** Usamos el patrón Strategy cuando queremos...
* Definir una familia de comportamientos.
* Definir variantes de un mismo algoritmo.
* Poder cambiar el comportamiento en tiempo de ejecución, es decir, dinámicamente.
* Reducir largas listas de condicionales.
* Evitar código duplicado.
* Ocultar código complicado, o que no queremos revelar, del usuario.

**Ejemplos:**
* [Robot](https://github.com/LuisBurgos/design-patterns/tree/master/src/strategy/examples/robot)
* [Modos de transportación](https://github.com/LuisBurgos/design-patterns/tree/master/src/strategy/examples/transportation)

## <a name="observer">Observer</a> [&#8593;](#lista-de-patrones)

**Propósito:** Defina una dependencia de uno a muchos entre los objetos de manera que cuando un objeto cambia de estado, todos los que dependen de él son notificados y se actualizan automáticamente.

Los *Observers* se registran con el *Subject*  a medida que se crean. Siempre que el Subject cambie, difundirá a todos los Observers registrados que ha cambiado, y cada Observer consulta al Subject que supervisa para obtener el cambio de estado que se haya generado.

En Java tenemos acceso a la clase Observer mediante [java.util.Observer](http://docs.oracle.com/javase/8/docs/api/java/util/Observer.html)

**Aplicación:** Usamos el patrón Observer cuando...
* Un cambio en un objeto requiere cambiar los demás, pero no sabemos cuántos objetos hay que cambiar.
* Configurar de manera dinámica un componente de la Vista, envés de estáticamente durante el tiempo de compilación.
* Un objeto debe ser capaz de notificar a otros objetos sin que estos objetos estén fuertemente acoplados.

**Ejemplos:**

* [Subasta](https://github.com/LuisBurgos/design-patterns/tree/master/src/observer/examples/auction)

## <a name="factory">Factory</a> [&#8593;](#lista-de-patrones)

**Propósito:** Definir una interface para crear un objeto, dejando a las subclases decidir de que tipo de clase se realizará la instancia. Reducir el uso del operador *new*.

Crear objetos en una clase usando un método factory es más flexible que crear un objeto directamente. Es posible conectar la generación de familias de clases que tienen comportamientos en común. Elimina la necesidad de estar haciendo binding (casting) hacia clases específicas dentro del código, ya que este solo se entiende con las clases abstractas.

**Aplicación:** Usamos el patrón Factory...
* Cuando una clase no puede anticipar que clase de objetos debe crear, esto se sabe durante el tiempo de ejecución.
* Cuando un método regresa una de muchas posibles clases que comparten carecterísticas comunes a través de una superclase.
* Para encapsular la creación de objetos.

**Ejemplos:**

* [Carros](https://github.com/LuisBurgos/design-patterns/tree/master/src/factory/examples/cars)
* [Armas](https://github.com/LuisBurgos/design-patterns/tree/master/src/factory/examples/weapons) (No implementado)
