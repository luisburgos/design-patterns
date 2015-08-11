# Patrones de Diseño en Java.

## Introducción.

Christopher Alexander dice “Cada patrón describe un problema que ocurre una y otra vez en nuestro entorno, para luego proponer el núcleo de la solución, de tal forma que esa solución puede ser usada millones de veces sin siquiera hacerlo dos veces de la misma forma”.

En otra definición, “Los patrones de diseño son el esqueleto de las soluciones a problemas comunes en el desarrollo de software.”

La siguiente es una lista de patrones de diseño con descripcipnes breves y con aplicaciones en ejemplos muy sencillos de entender.

## <a name="lista-de-patrones">Lista de Patrones de Diseño.</a>

### Patrones de Creación (Creational Patterns)

Relativos al proceso de creación de un objeto.

* [Factory](#factory)
* [Abstract Factory](#abstract-factory)
* [Singleton](#singleton)
* [Builder](#builder)
* [Prototype](#prototype)

### Patrones de Estructura (Structural Patterns)

Composición de clases u objetos.

* [Composite](#composite)
* [Adapter](#adapter)

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

El ejemplo de Subasta presenta una variante distinta de muchas fuentes en Internet de este patrón, usaremos una clase *Evento* para controlar los sucesos a los que los *Observers* responderan.

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
* [Naves](https://github.com/LuisBurgos/design-patterns/tree/master/src/factory/examples/ships)

## <a name="abstract-factory">Abstract Factory</a> [&#8593;](#lista-de-patrones)

**Propósito:** Proveer una interfaz para la creación de familias o objetos dependientes relacionados, sin especificar sus clases concretas.

Es una jerarquía que encapsula muchas *familias* posibles y la creación de un conjunto de *productos*. El objeto "fábrica" tiene la responsabilidad de proporcionar servicios de creación para toda una familia de productos. Los "clientes" nunca crean directamente los objetos de la familia, piden la fábrica que los cree por ellos.

**Aplicación:** Usamos el patrón Abstract Factory...
* Cuando tenemos una o múltiples familias de productos.
* Cuando tenemos muchos objetos que pueden ser cambiados o agregados durante el tiempo de ejecución.
* Cuando queremos obtener un objeto compuesto de otros objetos, los cuales desconocemos a que clase pertenecen.
* Para encapsular la creación de muchos objetos.

**Ejemplos:**

* [Ovnis](https://github.com/LuisBurgos/design-patterns/tree/master/src/abstractfactory/examples/ufo)
* [El Reino](https://github.com/LuisBurgos/design-patterns/tree/master/src/abstractfactory/examples/kingdom)

## <a name="composite">Composite</a> [&#8593;](#lista-de-patrones)

**Propósito:** Componer objetos en estructuras de árbol que representan jerarquías de un *todo* y sus *partes.* El Composite provee a los *clientes* un mismo trato para todos los objetos que forman la jerarquía.

Pensemos en nuestro sistema de archivos, este contiene *directorios* con *archivos* y a su vez estos *archivos* pueden ser otros *directorios* que contenga más *archivos*, y así sucesivamente. Lo anterior puede ser representado facilmente con el patrón Composite.

**Aplicación:** Usamos el patrón Composite...
* Cuando queremos representar jerarquías de objetos
compuestas por un todo y sus partes.
* Se quiere que los *clientes* ignoren la diferencia
entre la composición de objetos y su uso
individual.

**Ejemplos:**
* [Menu](https://github.com/LuisBurgos/design-patterns/tree/master/src/composite/examples/menu)
* [Sistema de Archivos](https://github.com/LuisBurgos/design-patterns/tree/master/src/composite/examples/directories)
* [Cartas](https://github.com/iluwatar/java-design-patterns/tree/master/composite/src/main/java/com/iluwatar/composite) (Externo).

## <a name="singleton">Singleton</a> [&#8593;](#lista-de-patrones)

**Propósito:** Asegurar que una clase tenga una única instancia y proporcionar un punto de acceso global a la misma. El *cliente* llama a la función de acceso cuando se requiere una referencia a la instancia única.

**Aplicación:** Usamos el patrón Singleton...
* La aplicación necesita una, y sólo una, instancia de una clase, además está instancia requiere ser accesible desde cualquier punto de la aplicación.
* Tipicamente para:
  * Manejar conexiones con la base de datos.
  * La clase para hacer Login.

**Ejemplos:**
* [Gobierno](https://github.com/LuisBurgos/design-patterns/tree/master/src/singleton/examples/government)

## <a name="builder">Builder</a> [&#8593;](#lista-de-patrones)

**Propósito:** Separar la construcción de un objeto complejo de su representación para que el mismo proceso de construcción puede crear diferentes representaciones.

Nos permite crear un objeto que está compuesto por muchoso otros objetos. Sólo el "*Builder*" conoce a detalle las clases concretas de los objetos que serán creados, nadie más.

En este patrón intervienen un "*Director*" y un "*Builder*". El "*Director*" invoca los servicios del "*Builder*" el cual va creando las partes de un objeto complejo y al mismo tiempo guardo un estado intermedio de la construcción del objeto. Cuando el producto se ha construido por completo el *cliente* recupera el resultado.

A diferencia de otros patrones creacionales que construyen productos de una sola vez, el patrón "*Builder*" construye paso a paso los productos bajo el control del "*Director*".

**Aplicación:** Usamos el patrón Builder cuando queremos...
* Construir un objeto compuesto de otros objetos.
* Que la creación de las partes de un objeto sea independiente del objeto principal.
* Ocultar la creación de las partes de un objeto del *cliente*, de esta manera no existe dependencia entre el *cliente* y las partes.

**Ejemplos:**
* [Heroes](https://github.com/LuisBurgos/design-patterns/tree/master/src/builder/examples/heroes) (basado en el siguiente [proyecto](https://github.com/iluwatar/java-design-patterns/tree/master/builder/src/main/java/com/iluwatar/builder))
* [Pizza](https://github.com/LuisBurgos/design-patterns/tree/master/src/builder/examples/pizza)
* [Robots](https://github.com/LuisBurgos/design-patterns/tree/master/src/builder/examples/robots)
* [Comida rápida](https://github.com/LuisBurgos/design-patterns/tree/master/src/builder/examples/fastfood)

## <a name="prototype">Prototype</a> [&#8593;](#lista-de-patrones)

**Propósito:** Especificar varios tipos de objetos que pueden ser creados en un prototipo para crear nuevos objetos copiando ese prototipo. Reduce la necesidad de crear subclases.

**Aplicación:** Usamos el patrón Prototype...
* Queremos crear nuevos objetos mediante la *clonación* o *copia* de otros.
* Cuando tenemos muchas clases potenciales que queremos usar sólo si son requeridas durante el tiempo de ejecución.

**Ejemplos:**
* [Animales](https://github.com/LuisBurgos/design-patterns/tree/master/src/prototype/examples/animals)

## <a name="adapter">Adapter</a> [&#8593;](#lista-de-patrones)

Como cualquier adaptador en el mundo real este patrón se utiliza para ser una interfaz, *un puente*, entre dos objetos. En el mundo real existen adaptadores para fuentes de alimentación, tarjetas de memoria de una cámara, entre otros. En el desarrollo de software, es lo mismo.

**Propósito:** Convertir la interfaz (**adaptee**) de una clase en otra interfaz (**target**) que el *cliente* espera. Permitir a dos interfaces incompatibles trabajar en conjunto. Este patrón nos permite ver a nuevos y distintos elementos como si fueran igual a la interfaz conocida por nuestra aplicación.

**Aplicación:** Usamos el patrón [Adapter...](https://github.com/LuisBurgos/design-patterns/tree/master/src/adapter/pattern)
* Cuando el *cliente* espera usar la interfaz de destino (**target**).
* Deseamos usar una clase existente pero la interfaz que ofrece no concuerda con la que necesitamos.

**Ejemplos:**
* [Books](https://github.com/LuisBurgos/design-patterns/tree/master/src/adapter/examples/books)
