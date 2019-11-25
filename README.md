# Patrones de Diseño en Java.

## Introducción.

Christopher Alexander dice “Cada patrón describe un problema que ocurre una y otra vez en nuestro entorno, para luego proponer el núcleo de la solución, de tal forma que esa solución puede ser usada millones de veces sin siquiera hacerlo dos veces de la misma forma”.

En otra definición, “Los patrones de diseño son el esqueleto de las soluciones a problemas comunes en el desarrollo de software.”

La siguiente es una lista de patrones de diseño con descripciones breves y con aplicaciones en ejemplos muy sencillos de entender. En algunos casos se trata de recopilaciones de otros autores, a los que se podrá acceder para ampliar la información.

## <a name="lista-de-patrones">Lista de Patrones de Diseño.</a>

Ámbito:

* [**C**] Clase 
* [**O**] Objeto

### Patrones de Creación (Creational Patterns)

Relativos al proceso de creación de un objeto.

* [Abstract Factory](#abstract-factory) [**O**]
* [Builder](#builder) [**O**]
* [Factory o Factory Method](#factory) [**C**]
* [Prototype](#prototype) [**O**]
* [Singleton](#singleton) [**O**]
* [Object Pool](#objectpool) [**O**]

### Patrones de Estructura (Structural Patterns)

Composición de clases u objetos.

* [Adapter](#adapter) [**O**] [**C**]
* [Composite](#composite) [**O**]
* [Decorator](#decorator) [**O**]
* [Facade](#facade) [**O**]
* [Proxy](#proxy) [**O**]
* [Bridge](#bridge) [**O**]
* [Flyweight](#flyweigh) [**O**]

### Patrones de Comportamiento (Behavioral Patterns)

Forma en que las clases u objetos interaccionan y distribuyen funcionalidades.

* [Command](#command) [**O**]
* [Observer](#observer) [**O**]
* [Strategy](#strategy) [**O**]
* [Chain of Responsability](#chain) [**O**]
* [Memento](#memento) [**O**]
* [Mediator](#mediator) [**O**]
* [Template method](#template) [**C**]
* [Iterator](#iterator) [**O**]
* [Visitor](#visitor) [**O**]
* [State](#state) [**O**]
* [Interpreter](#interpreter) [**C**]

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

**Propósito:** Definir una dependencia de uno a muchos entre los objetos de manera que cuando un objeto cambia de estado, todos los que dependen de él son notificados y se actualizan automáticamente.

Los *Observers* se registran con el *Subject*  a medida que se crean. Siempre que el Subject cambie, difundirá a todos los Observers registrados que ha cambiado, y cada Observer consulta al Subject que supervisa para obtener el cambio de estado que se haya generado.

En Java tenemos acceso a la clase Observer mediante [java.util.Observer](http://docs.oracle.com/javase/8/docs/api/java/util/Observer.html)

**Aplicación:** Usamos el patrón Observer cuando...
* Un cambio en un objeto requiere cambiar los demás, pero no sabemos cuántos objetos hay que cambiar.
* Configurar de manera dinámica un componente de la Vista, envés de estáticamente durante el tiempo de compilación.
* Un objeto debe ser capaz de notificar a otros objetos sin que estos objetos estén fuertemente acoplados.

**Ejemplos:**

El ejemplo de Subasta presenta una variante distinta de muchas fuentes en Internet de este patrón, usaremos una clase *Evento* para controlar los sucesos a los que los *Observers* responderan.

* [Subasta](https://github.com/LuisBurgos/design-patterns/tree/master/src/observer/examples/auction)

## <a name="factory">Factory o Factory Method</a> [&#8593;](#lista-de-patrones)

**Propósito:** Definir una interface para crear un objeto, dejando a las subclases decidir de que tipo de clase se realizará la instancia en tiempo de ejecución. Reducir el uso del operador *new*.

Crear objetos en una clase usando un método factory es más flexible que crear un objeto directamente. Es posible conectar la generación de familias de clases que tienen comportamientos en común. Elimina la necesidad de estar haciendo binding (casting) hacia clases específicas dentro del código, ya que éste sólo se entiende con las clases abstractas.

**Aplicación:** Usamos el patrón Factory...
* Cuando una clase no puede anticipar que clase de objetos debe crear, esto se sabe durante el tiempo de ejecución.
* Cuando un método regresa una de muchas posibles clases que comparten carecterísticas comunes a través de una superclase.
* Para encapsular la creación de objetos.

**Ejemplos:**

* [Carros](https://github.com/LuisBurgos/design-patterns/tree/master/src/factory/examples/cars)
* [Naves](https://github.com/LuisBurgos/design-patterns/tree/master/src/factory/examples/ships)

## <a name="abstract-factory">Abstract Factory</a> [&#8593;](#lista-de-patrones)

**Propósito:** Proveer una interfaz para la creación de familias u objetos dependientes relacionados, sin especificar sus clases concretas.

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

Nos permite crear un objeto que está compuesto por muchos otros objetos. Sólo el "*Builder*" conoce a detalle las clases concretas de los objetos que serán creados, nadie más.

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
* [Users](https://github.com/peterm85/design-patterns/tree/master/src/adapter/examples/users) *from:* [https://www.oscarblancarteblog.com/2019/09/05/java-converter-pattern/](https://www.oscarblancarteblog.com/2019/09/05/java-converter-pattern/)

## <a name="decorator">Decorator</a> [&#8593;](#lista-de-patrones)

Extender la funcionalidad de los objetos se puede hacer de forma estática en nuestro código (tiempo de **compilación**) mediante el uso de la herencia, sin embargo, podría ser necesario extender la funcionalidad de un objeto de manera dinámica.

**Propósito:** Adjuntar responsabilidades adicionales a un objeto de forma **dinámica**. Los *decoradores* proporcionan una alternativa flexible para ampliar la funcionalidad.

**Aplicación:** Usamos el patrón [Decorator...](https://github.com/LuisBurgos/design-patterns/tree/master/src/decorator/pattern)
* Cuando necesitamos añadir o eliminar dinámicamente las responsabilidades a un objeto, sin afectar a otros objetos.
* Cuando queremos tener las ventajas de la *Herencia* pero necesitemos añadir funcionalidad durante el tiempo de ejecución. Es más flexible que la *Herencia*,
* Simplificar el código agregando funcionalidades usando muchas clases diferentes.
* Evitar sobreescribir código viejo agregando, envés, código nuevo.

**Ejemplos:**
* [Pizzas](https://github.com/LuisBurgos/design-patterns/tree/master/src/decorator/examples/pizzas)

## <a name="facade">Facade</a> [&#8593;](#lista-de-patrones)

**Propósito:** Proporcionar una interfaz unificada para un conjunto de interfaces de un subsistema. *Facade* define una interfaz de alto nivel que hace que el subsistema sea más fácil de usar.

**Detalles:**
* Este patrón protege los clientes de los componentes del subsistema, propiciando el menor uso de componentes para que el subsistema pueda ser utilizado.
* Además, promueve un bajo acoplamiento entre subsistemas y clientes.
* Este patrón no evita que los clientes usen las clases internas del subsistema, si es que es necesario.
* Es importante mencionar que el objeto *Facade* debe ser extremadamente simple. **No** debe convertirse en un **objeto "dios".**

**Aplicación:** Usamos el patrón [Facade...](https://github.com/LuisBurgos/design-patterns/tree/master/src/facade/pattern)
* Cuando queremos encapsular un subsistema complejo con una interface más simple.
* Para crear una interface simplificada que ejecuta muchas acciones "detŕas del escenario".
* Existen muchas dependencias entre clientes y la implementación de clases de una abstracción. Se introduce el facade para desacoplar el subsistema de los clientes y otros subsistemas.
* Necesitamos *desacoplar* subsistemas entre sí, haciendo que se comuniquen únicamente mediante *Facades*.
* Para definir un punto de entrada a cada nivel del subsistema.

**Ejemplos:**
* [Banco](https://github.com/LuisBurgos/design-patterns/tree/master/src/facade/examples/bank)
* [Computadora](https://github.com/LuisBurgos/design-patterns/tree/master/src/facade/examples/computer)

## <a name="proxy">Proxy</a> [&#8593;](#lista-de-patrones)

Tengamos en cuenta el siguiente escenario: Es necesario instanciar objetos sólo cuando sean efectivamente solicitados (*request*) por el cliente.

Un **Proxy** o sustituto:
1. Crea una instancia del objeto real la primera vez que el cliente realiza una solicitud del proxy.
2. Recuerda la identidad de este objeto real.
3. Finalmente, envía la solicitud del servicio al objeto real.

**Propósito:**
* Proveer un sustituto o *"placeholder"* de otro objeto para controlar el acceso a este.
* Usar un nivel extra de indirección para permitir el acceso distribuido, controlado e inteligente.
* Agregar un *"wrapper"* para proteger el componente real de la complejidad innecesaria. Este *wrapper* permite agregar funcionalidad al objeto de interés sin cambiar el código del objeto.

Aunque a simple vista tenga similitudes al patrón Facade, ambos tiene matices diferentes. 
* Mientras que los objetos Proxy representan a un objeto, los objetos Facade representan a un subsistema de objetos.
* Un objeto cliente Proxy no puede acceder a un objeto interno directamente, mientras que Facade no lo impide.
* Un objeto Proxy provee control de acceso a un único objeto de interés. Sin embargo, un objeto Facade provee una interface de alto nivel a un subsistema de objetos.

**Aplicación:** Usamos el patrón [Proxy...](https://github.com/LuisBurgos/design-patterns/tree/master/src/proxy/pattern)
* Cuando haya necesidad de una referencia más versátil y sofisticada a un objeto, no un simple puntero.
* Para adicionar seguridad al acceso de un objeto. El Proxy determinará si el cliente puede acceder al objeto de interés.
* Para proporcionar una API simplificada para que el código del cliente no tenga que lidiar con la complejidad del código del objeto de interés.
* Para proporcionar una interfaz de los *web services* o recursos *REST*.

**Escenarios de uso:**
* *Remote Proxy*: Representa un objeto local que pertenece a un espacio de direcciones diferente.
* *Virtual Proxy*: En lugar de un objeto complejo o pesado, utiliza una representación de esqueleto. Consideremos una imagen la cual es enorme en tamaño, podemos representarla mediante un objeto proxy virtual y cuando sea solicitado cargamos el objeto real.
* *Protection Proxy*: Controla el acceso al objeto original. Este tipo es útil cuando se necesita manejar diferentes permisos de acceso.

**Ejemplos:**
* [Images](https://github.com/LuisBurgos/design-patterns/tree/master/src/proxy/examples/images)
* [ATM](https://github.com/LuisBurgos/design-patterns/tree/master/src/proxy/examples/atm)

## <a name="command">Command</a> [&#8593;](#lista-de-patrones)

 El patrón *Command* encapsula comandos( llamados a métodos) en objetos, permitiéndonos realizar peticiones sin conocer exactamente la petición que se realiza o el objeto al cuál se le hace la petición. Este patrón nos provee las opciones para hacer listas de comandos, hacer/deshacer acciones y otras manipulaciones.

 Este patrón desacopla al *objeto que invoca* la operación del *objeto que sabe cómo* llevar a cabo la misma. Un objeto llamado *Invoker* transfiere el *comando* a otro objeto llamado *Receiver* el cual ejecuta el código correcto para el *comando* recibido.

**Propósito:** Encapsular una petición en forma de objeto, permitiendo de ese modo que parametrizar clientes con diferentes peticiones, "colas" o registros de solicitudes, y apoyar las operaciones de deshacer.

**Aplicación:** Usamos el patrón [Command...](https://github.com/LuisBurgos/design-patterns/tree/master/src/command/pattern)
* Cuando queremos realizar peticiones en diferentes tiempos. Se puede hacer a través de la especificación de una "cola".
* Para implementar la función de deshacer (*undo*), ya que se puede almacenar el estado de la ejecución del comando para revertir sus efectos.
* Cuando necesitemos mantener un registro (*log*) de los cambios y acciones.

**Usos típicos:**
* Mantener un historial de peticiones. (*requests*)
* Implementar la funcionalidad de *callbacks*.
* Implementar la funcionalidad de *undo*.

**Ejemplos:**
* [Electrónicos](https://github.com/LuisBurgos/design-patterns/tree/master/src/command/examples/devices)
* [Hechizos](https://github.com/LuisBurgos/design-patterns/tree/master/src/command/examples/spells)

## <a name="objectpool">Object Pool</a> [&#8593;](#lista-de-patrones)

**Propósito:** Permite reutilizar objetos con el fin de evitar el costo de crearlos cada vez que la aplicación los requiera, manteniendo así un almacén de objetos creados previamente para ser utilizados.

Cuando un objeto es tomado del pool dejará de estar disponible hasta que se devuelva.
Si no hay objetos disponibles, se crea uno nuevo y se agrega al conjunto.
En algunos casos los recursos pueden ser limitados por lo que se especifica un número máximo de objetos. Si se alcanza este número y se solicita un nuevo elemento, puede lanzarse una excepción, o se puede bloquear el hilo de trabajo hasta que un objeto se libere de nuevo.

**Aplicación:** Usamos el patrón [Object Pool](https://github.com/peterm85/design-patterns/tree/master/src/objectpool/pattern) cuando...
* Se requiere trabajar con una gran cantidad de objetos, los cuales son computacionalmente caros de crear.
* Se requiere trabjar con objetos por un tiempo muy corto y que luego de su uso son desechados.

**Escenarios de uso:**
* *Database connection*: Si hay una necesidad de abrir demasiadas conexiones para una base de datos tomaría demasiado tiempo crear una nueva y el servidor de base de datos podría sobrecargarse.
* *Share resources*: Diferentes clientes necesitarán el mismo recurso en diferentes momentos.

**Referencia:** [https://www.javatpoint.com/object-pool-pattern](https://www.javatpoint.com/object-pool-pattern)

## <a name="bridge">Bridge</a> [&#8593;](#lista-de-patrones)

**Propósito:** Permite desacoplar una abstracción de su implementación, de manera que ambas puedan ser modificadas independientemente sin necesidad de alterar por ello la otra.

**Aplicación:** Usamos el patrón [Bridge](https://github.com/peterm85/design-patterns/tree/master/src/bridge/pattern) cuando...
* Se desea evitar un enlace permanente entre la abstracción y su implementación. Esto puede ser debido a que la implementación debe ser seleccionada o cambiada en tiempo de ejecución.
* Tanto las abstracciones como sus implementaciones deben ser extensibles por medio de subclases. En este caso, el patrón Bridge permite combinar abstracciones e implementaciones diferentes y extenderlas independientemente.
* Cambios en la implementación de una abstracción no deben impactar en los clientes, es decir, su código no debe tener que ser recompilado.
* Se desea compartir una implementación entre múltiples objetos (quizá usando contadores), y este hecho debe ser escondido a los clientes.

**Usos típicos:**
* *Desacoplar* interfaz e implementación.
* Mejorar la *extensibilidad*.
* Esconder los detalles de la implementación a los clientes.

**Ejemplos:**
* [Taller](https://github.com/peterm85/design-patterns/tree/master/src/bridge/examples/workshop)

**Referencia:** [https://www.geeksforgeeks.org/bridge-design-pattern/](https://www.geeksforgeeks.org/bridge-design-pattern/)

## <a name="flyweigh">Flyweight</a> [&#8593;](#lista-de-patrones)

**Propósito:** Permite eliminar o reducir la redundancia cuando tenemos gran cantidad de objetos que contienen información idéntica, además de lograr un equilibrio entre flexibilidad y rendimiento (uso de recursos).

Una característica importante es que los objetos Flyweight son **inmutables**, por lo que no podrán ser modificados una vez construidos.
Puede utilizarse conjuntamente con el patrón Factory, de tal modo que en el momento en que se soliciten instancias del objeto, compruebe si ya existe un tipo Flyweight y devuelva esa referencia. En caso de que no exista la creará y la registrará.

**Aplicación:** Usamos el patrón Flyweight cuando...
* Reducir el uso de memoria y/o evitar errores con la misma (java.lang.OutOfMemoryError).
* Aunque la creación de objetos puede ser rápida, se podría reducir los tiempos de ejecución compartiendo objetos.

**Ejemplos:**
* [Counter Strike](https://github.com/peterm85/design-patterns/tree/master/src/flyweight/examples/counterstrike)

**Referencia:** [https://www.geeksforgeeks.org/flyweight-design-pattern/](https://www.geeksforgeeks.org/flyweight-design-pattern/)

## <a name="chain">Chain of Responsability</a> [&#8593;](#lista-de-patrones)

**Propósito:** Evita acoplar el emisor de una petición a su receptor dando a más de un objeto la posibilidad de responder a una petición.

Cada elemento deberá tener referencia al siguiente.

**Aplicación:** Usamos el patrón Chain of Responsability cuando...
* Hay más de un objeto que puede manejar una petición, y el manejador no se conoce a priori, sino que debería determinarse automáticamente.
* Se quiere enviar una petición a un objeto entre varios sin especificar explícitamente el receptor.
* El conjunto de objetos que pueden tratar una petición debería ser especificado dinámicamente.

**Ejemplos:**
* [Army](https://github.com/peterm85/design-patterns/tree/master/src/chain/examples/army)

## <a name="memento">Memento</a> [&#8593;](#lista-de-patrones)

**Propósito:** Almacenar el estado de un objeto (o del sistema completo) en un momento dado, de manera que se pueda restaurar en ese punto de manera sencilla.

Se mantiene almacenado el estado del objeto para un instante de tiempo en una clase independiente de aquella a la que pertenece el objeto (pero sin romper la encapsulación), de forma que ese recuerdo permita que el objeto sea modificado y pueda volver a su estado anterior.

**Aplicación:** Usamos el patrón [Memento](https://github.com/peterm85/design-patterns/tree/master/src/memento/pattern) cuando...
* Se quiere poder restaurar el sistema desde estados pasados.
* Se desea facilitar el hacer y deshacer de determinadas operaciones, para lo que habrá que guardar los estados anteriores de los objetos sobre los que se opere (o bien recordar los cambios de forma incremental).

**Ejemplos:**
* [Time Machine](https://github.com/peterm85/design-patterns/tree/master/src/memento/examples/timemachine)

**Referencia:** [https://www.geeksforgeeks.org/memento-design-pattern/](https://www.geeksforgeeks.org/memento-design-pattern/)

## <a name="mediator">Mediator</a> [&#8593;](#lista-de-patrones)

**Propósito:** Define un objeto que encapsula cómo un conjunto de objetos interactúan, pudiendo alterar el comportamiento del programa en ejecución

La comunicación entre objetos es encapsulada con un objeto mediador. Los objetos no se comunican de forma directa entre ellos, en lugar de ello se comunican mediante el mediador. Esto reduce las dependencias entre los objetos en comunicación, reduciendo entonces la Dependencia de código.

**Aplicación:** Usamos el patrón Mediator cuando ...
* Se desea reducir la dependencia entre clases evitando que los objetos se relacionen entre ellos de forma explícita, y permitiendo variar cualquier interacción independientemente.

**Ejemplos:**
* [Air Traffic Controller](https://github.com/peterm85/design-patterns/tree/master/src/mediator/examples/airtrafficcontroller)

**Referencia:** [https://www.geeksforgeeks.org/mediator-design-pattern/](https://www.geeksforgeeks.org/mediator-design-pattern/)

## <a name="template">Template Method</a> [&#8593;](#lista-de-patrones)

**Propósito:** Define el esqueleto de programa de un algoritmo en un método, llamado método de plantilla, el cual difiere algunos pasos a las subclases.

Permite redefinir ciertos pasos seguros de un algoritmo sin cambiar la estructura del algoritmo.

**Aplicación:** Usamos el patrón Template Method cuando ...
* Se desea dejar que las subclases que se implementan (a través del método primordial) tengan un comportamiento que puede variar.
* Evitar duplicación en el código: la estructura general de flujo de trabajo, está implementada una vez en el algoritmo de clase abstracta, y variaciones necesarias son implementadas en cada de las subclases.
* Controlar en qué punto(s) la subclassing está permitida. En oposición a una sencilla sobrecarga polimórfica, donde el método de base sería enteramente reescrito, permitiendo un cambio radical en el flujo. Sólo los detalles específicos del flujo se pueden cambiar.

**Ejemplos:**
* [Order Managing](https://github.com/peterm85/design-patterns/tree/master/src/template/examples/ordermanaging)

**Referencia:** [https://www.geeksforgeeks.org/template-method-design-pattern/](https://www.geeksforgeeks.org/template-method-design-pattern/)

## <a name="iterator">Iterator</a> [&#8593;](#lista-de-patrones)

**Propósito:** Define una interfaz que declara los métodos necesarios para acceder secuencialmente a un grupo de objetos de una colección.

Algunos de los métodos que podemos definir en la interfaz Iterador son:

Primero(), Siguiente(), HayMas() y ElementoActual().

**Aplicación:** Usamos el patrón Iterator cuando ...
* Se desea acceder a los elementos de un contenedor de objetos (por ejemplo, una lista) sin exponer su representación interna.

**Ejemplos:**
* [Vectors](https://github.com/peterm85/design-patterns/tree/master/src/iterator/examples/vectors)
* [Notifications](https://github.com/peterm85/design-patterns/tree/master/src/iterator/examples/notifications)

**Referencia:** [https://www.geeksforgeeks.org/iterator-pattern/](https://www.geeksforgeeks.org/iterator-pattern/)

## <a name="visitor">Visitor</a> [&#8593;](#lista-de-patrones)

**Propósito:** Separar el algoritmo de la estructura de un objeto.

La idea básica es que se tiene un conjunto de clases elemento que conforman la *estructura* de un objeto. Cada una de estas clases elemento tiene un método aceptar (accept()) que recibe al objeto visitante (visitor) como argumento. El visitante es una interfaz que tiene un método visit diferente para cada clase elemento; por tanto habrá implementaciones de la interfaz visitor de la forma: visitorClase1, visitorClase2... visitorClaseN. El método accept de una clase elemento llama al método visit de su clase.

Si hay demasiadas implementaciones de la interface visitor, se hace dificil extender.

**Aplicación:** Usamos el patrón Visitor cuando ...
* Se desea mover la lógica operacional desde los objetos a otra clase.
* Se desea definir una operación sobre objetos de una jerarquía de clases sin modificar las clases sobre las que opera.
* Se desea representar una operación que se realiza sobre los elementos que conforman la estructura de un objeto
* Teniendo un buen número de instancias de un pequeño número de clases, se desea realizar alguna operación que involucra a todas o a la mayoría de ellas.

**Ejemplos:**
* [Airport Security Control](https://github.com/peterm85/design-patterns/tree/master/src/visitor/examples/airportsecuritycontrol)
* [Arithmetic](https://github.com/peterm85/design-patterns/tree/master/src/visitor/examples/arithmetic)

## <a name="state">State</a> [&#8593;](#lista-de-patrones)

**Propósito:** Permite a un objeto alterar su comportamiento dependiendo de su estado interno.

**Aplicación:** Usamos el patrón [State](https://github.com/peterm85/design-patterns/tree/master/src/state/pattern) cuando ...
* Un determinado objeto tiene diferentes estados y también distintas responsabilidades según el estado en que se encuentre en determinado instante.
* Se desea simplificar casos en los que se tiene un complicado y extenso código de decisión que depende del estado del objeto.

**Ejemplos:**
* [Mobile Alerts](https://github.com/peterm85/design-patterns/tree/master/src/state/examples/mobilealerts)

**Referencia:** [https://www.geeksforgeeks.org/state-design-pattern/](https://www.geeksforgeeks.org/state-design-pattern/)

## <a name="interpreter">Interpreter</a> [&#8593;](#lista-de-patrones)

**Propósito:** Define una representación para su gramática junto con un intérprete del lenguaje.

**Aplicación:** Usamos el patrón Interpreter cuando ...
* Se desea representar expresiones regulares que representen cadenas a buscar dentro de otras cadenas..
* Para definir un lenguaje que permita representar las distintas instancias de una familia de problemas.

**Ejemplos:**
* [SQL](https://github.com/peterm85/design-patterns/tree/master/src/interpreter/examples/sql)

**Referencia:** [https://www.baeldung.com/java-interpreter-pattern](https://www.baeldung.com/java-interpreter-pattern)