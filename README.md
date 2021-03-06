# Curso de Programación Orientada a Objetos

Por [Anahí Salgado Díaz de la Vega](https://platzi.com/profesores/anncode/) | **@anncode**

La misión: lograr que la virtualidad sea idéntica a la realidad. El elegido para esta tarea: tú. Sé parte de la generación que logra cambiar el mundo a través de ideas innovadoras, porque la diferencia entre ser testigo del cambio y ser parte de él comienza con Platzi.

- Conocer los diferentes lenguajes de programación orientados a objetos
- Analizar problemas para el desarrollo de proyectos orientado a objetos
- Entender el funcionamiento de los objetos
- Entender el funcionamiento de las clases

## Bienvenida e introducción

### 1. Por qué aprender POO

- **Programaré más rápido:** Mejoro mi capacidad de análisis, pienso bien lo que voy a hacer antes de entrar al código.
- **Dejo de ser programador Jr:** Dominaré conceptos como Encapsulamiento, abstracción, herencia y polimorfismo. Los cuales son claves para llamar la atención de un reclutadores ya que me hace ver como un programador Sr
- **Dejo de copiar y pegar código:** Ya puedo tomar control sobre mi aplicación, no terminará siendo un Frankenstein, un producto que no sabe donde empieza ni donde termina.

Finalmente tendré la capacidad de:

- **Análizar**: Observar, entender y leer muy bien el problema. Empezaré a pensar de forma distinta.
- **Plasmar:** Diseñaré y crearé los diagramas, después de haber realizado el respectivo análisis.
- **Programar:** Programaré nuestro diagrama con cualquier lenguaje que soporte POO.

 ### 2. Qué resuelve la POO

La programación Orientada a Objetos nace de los problemas creados por la programación estructurada y nos ayuda a resolver cierto problemas como:

- Código muy largo: A medida que un sistema va creciendo y se hace más robusta el código generado se vuelve muy extenso haciéndose difícil de leer, depurar, mantener.
- Si algo falla, todo se rompe: Ya que con la programación estructurada el código se ejecuta secuencialmente al momento de que una de esas líneas fallara todo lo demás deja de funcionar.
- Difícil de mantener.
- Código espagueti, sentencias de control anidadas(if else)

> La POO simplifica la programación.

 ### 3. Paradigma orientado a Objetos

La **Programación Orientada a Objetos** viene de una filosofía o forma de pensar que es la **Orientación a Objetos** y esto surge a partir de los problemas que necesitamos plasmar en código.

Es **analizar un problema en forma de objetos** para después llevarlo a código, eso es la **Orientación a Objetos**.

Un **paradigma** es una teoría que suministra la base y modelo para resolver problemas. La paradigma de Programación Orientada a Objetos se compone de 4 elementos:

- Clases
- Propiedades
- Métodos
- Objetos

Y 4 Pilares:

- Encapsulamiento
- Abstracción
- Herencia
- Polimorfismo

 ### 4. Lenguajes Orientado a Objetos

Algunos de los lenguajes de programación Orientados a Objetos son:

- **Java**:
  - Orientado a Objetos naturalmente
  - Es muy útilizado en Android
  - Y es usado del lado del servidor o Server Side
  - Extensión: `.java`
- **PHP**
  - Lenguaje interpretado
  - Pensado para la Web
  - Extensión: `.php`
- **Python**
  - Diseñado para ser fácil de usar
  - Múltiples usos: Web, Server Side, Análisis de Datos, Machine Learning, etc
  - Extensión: `.py`
- **Javascript**
  - Lenguaje interpretado
  - Orientado a Objetos pero basado en prototipos
  - Pensado para la Web
  - Extensión: `.js`
- C#
- Ruby
- Kotlin

 ### 5. Instalando Visual Studio Code

Pues que comience la aventura y digo aventura porque te darás cuenta de lo emocionante que será poder trabajar 4 lenguajes de programación en un solo entorno de desarrollo y sí, precisamente eso es lo que nos resuelve Visual Studio Code el cual será nuestro campeón en este curso.

Visual Studio Code lo puedes encontrar en las tres versiones básicas de Sistema Operativo (Windows, Mac y Linux) y lo puedes descargar directo en este enlace: https://code.visualstudio.com/download. Es muy ligero y basta con un Siguiente, siguiente, siguiente para instalar.

¡Súper! Todo salió bien. Ahora pasemos a configurarlo para cada lenguaje.

Primero ubica la sección de **Extensiones** o en inglés **Extensions**, además de la barra de Search porque estaremos buscando la extensión para cada lenguaje.

#### Java

- Instala la extensión **Java Extension Pack** de microsoft (son varias extensiones que se instalan)
- Instala la extensión **Debugger for Java**, o verifica si se instaló en el paquete previo.

#### Python

- Instalar python descargando desde python.org
- Instalar la extensión Python en VSC de microsoft.
- Ir a **View > Command Paletter** escribir y seleccionar: *Python: select interpreter*
- Elegir la versión de python instalada en la pc ejm: *python 3.10.2 64-bit*
- Listo eso es todo.

#### PHP

Primero necesitamos instalar el intérprete de PHP, la forma más fácil es descargando XAMPP:

[Descarga XAMPP](https://www.apachefriends.org/es/index.html)

Puedes descargarlo tanto para Linux, Windows o macOS.

Una vez descargado simplemente debes abrirlo e instalarlo dando click al botón de “Next” como cualquier programa normal. Si te sale una ventana de permisos de Firewall simplemente permite ambas opciones:

Con el intérprete instalado, para configurar PHP buscaremos la extensión **PHP Server** y pulsamos “Instalar”

Ahora debemos asegurarnos de que PHP y la extensión estén conectados. Para ello, en Visual Studio Code nos vamos a settings:

Y aquí buscamos “PHP Server”, nos debería aparecer algo como esto:

- En el apartado `Phpserver: PHP Config Path` debe decir: `C:\xampp\php\php.ini`.
- En el apartado `Phpserver: PHP Path` debe decir: `C:\xampp\php\php.exe`.

❗ *Estas rutas pueden variar si durante la instalación de XAMPP cambiaste el directorio de instalación, o si tu Windows está instalado en otro disco que no sea el disco `C:`.*

#### JavaScript

En este caso no necesitamos instalar absolutamente nada, utilizaremos el editor con su configuración por defecto.

---

#### Comencemos nuestro proyecto

Ya está todo listo, ahora dejemos creado el proyecto.

Para esto seleccionaremos la opción **Add workspace folder**

A continuación creamos una carpeta llamada **CursoPOOUber** y damos clic en Add para finalizar. Ahora generemos esta estructura de carpetas para manejar los documentos correspondientes al lenguaje de programación:

- java
- js
- php
- python

¡Ya terminamos, estamos listos!

 ### 6. Diagramas de Modelado

**OMT**: Object Modeling Techniques. Es una metodología para el análisis orientado a objetos. Ya no es usado (1991)

**UML**: *Unified Modeling Language* o *Lenguaje de Modelado Unificado*. Tomó las bases y técnicas de OMT unificándolas. Tenemos más opciones de diagramas como lo son Clases, Casos de Uso, Objetos, Actividades, Iteración, Estados, Implementación. Es el que se está usando (1997).

 ### 7. Qué es UML

Como ya viste UML significa **Unified Modeling Language** el cual es un lenguaje estándar de modelado de sistemas orientados a objetos.

Esto significa que tendremos una manera gráfica de representar una situación, justo como hemos venido viendo. A continuación te voy a presentar los elementos que puedes utilizar para hacer estas representaciones.

#### Las Clases

Las **clases** se representan así:

![clase.png](.\img\clase-1897e6cf-84b3-4432-926b-aff4fc4db122.jpg)

En la parte superior se colocan los atributos o propiedades, y debajo las operaciones de la clase. Notarás que el primer caracter con el que empiezan es un símbolo. Este denotará la visibilidad del atributo o método, esto es un término que tiene que ver con Encapsulamiento y veremos más adelante a detalle.

Estos son los niveles de **visibilidad** que puedes tener:

**-** private
**+** public
**#** protected
**~** default

Una forma de representar las relaciones que tendrá un elemento con otro es a través de las flechas en UML, y aquí tenemos varios tipos, estos son los más comunes:

##### Asociación

![associacion.png](.\img\associacion-d2e1b691-b6e9-4854-85e2-d3ffdf0a9049.jpg)

Como su nombre lo dice, notarás que cada vez que esté referenciada este tipo de flecha significará que ese elemento contiene al otro en su definición. La flecha apuntará hacia la dependencia.

![uml-relacion-asociacion.jpg](.\img\uml-relacion-asociacion-99b916c6-1f80-4b61-889a-ebf6e74f4f23.jpg)

Con esto vemos que la ClaseA está asociada y depende de la ClaseB.

##### Herencia

![herencia.png](.\img\herencia-2eb98d5e-bcad-4162-b236-aa87eba20e76.jpg)

Siempre que veamos este tipo de flecha se estará expresando la herencia.
La dirección de la flecha irá desde el hijo hasta el padre.

![herencia-clases.png](.\img\herencia-clases-53cb3117-def7-433f-adc5-4ad183d6b5e7.jpg)

Con esto vemos que la ClaseB hereda de la ClaseA

##### Agregación

![agregacion.png](.\img\agregacion-6489d946-cc06-4e3c-a976-f6435531b4f2.jpg)

Este se parece a la asociación en que un elemento dependerá del otro, pero en este caso será: Un elemento dependerá de muchos otros. Aquí tomamos como referencia la multiplicidad del elemento. Lo que comúnmente conocerías en Bases de Datos como *Relaciones uno a muchos*.

![uml-relacion-agregacion.jpg](.\img\uml-relacion-agregacion-adb20be8-d6c2-41d1-b002-2cfa37639240.jpg)

Con esto decimos que la ClaseA contiene varios elementos de la ClaseB. Estos últimos son comúnmente representados con listas o colecciones de datos.

##### Composición

![composicion.png](.\img\composicion-1da1dd19-6925-42d9-9727-7fd8cb031b0c.jpg)

Este es similar al anterior solo que su relación es totalmente compenetrada de tal modo que conceptualmente una de estas clases no podría vivir si no existiera la otra.

![uml-relacion-composicion.jpg](.\img\uml-relacion-composicion-2d4cb1fa-5422-44e3-849b-3a3e2d276733.jpg)

Con esto terminamos nuestro primer módulo. Vamos al siguiente para entender cómo podemos hacer un análisis y utilizar estos elementos para construir nuestro diagrama de clases de Uber.

## Orientación a Objetos

 ### 8. Objetos

Los Objetos son aquellos que tienen propiedades y comportamientos, también serán sustantivos.

- Pueden ser **Físicos o Conceptuales**

Para identificar objetos debemos tener en cuenta que estos siempre van a tener **propiedades** y **comportamientos**. Además, estos siempre serán sustantivos.

Las **Propiedades** también pueden llamarse atributos y estos también serán sustantivos. Algunos atributos o propiedades son nombre, tamaño, forma, estado, etc. Son todas las características del objeto.

> Es importante tener en cuenta que el atributo no sea el resultado, como Verde. En este caso el atributo es el **Color**.

Los **Comportamientos** serán todas las operaciones que el objeto puede hacer, suelen ser **verbos** o **sustantivos y verbo**. Algunos ejemplos pueden ser que el usuario pueda hacer login, logout o makeReport.

> Es importante tener en cuenta el contexto en que está el objeto

```mermaid
classDiagram
	class Perro
	Perro : +nombre
	Perro : +color
	Perro : +raza
	Perro : +tamaño
	Perro : +ladrar()
	Perro : +comer()
	Perro : +dormir()
	Perro : +morder()
	Perro : +pelear()
```

 ### 9. Abstracción y Clases

Una **Clase** es el modelo por el cual nuestros objetos se van a construir y nos van a permitir generar más objetos.

Analizamos Objetos para crear **Clases**. Las **Clases** son los modelos sobres los cuales construiremos nuestros objetos.

**Abstracción** es cuando separamos los datos de un objeto para generar un molde.

 ### 10. Modularidad

La **modularidad** va muy relacionada con las clases y es un principio de la Programación Orientado a Objetos y va de la mano con el *Diseño Modular* que significa dividir un sistema en partes pequeñas y estas serán nuestros módulos pudiendo funcionar de manera independiente.

![image-20220305103823185](.\img\image-20220305103823185.png)

La **modularidad** de nuestro código nos va a permitir

- Reutilizar: usar un modulo en diferentes partes
- Evitar colapsos
- Hacer nuestro código más mantenible: se puede añadir mas módulos o modificarlos
- Legibilidad: cada módulo es independiente
- Resolución rápida de problemas: el problema se da en solo un módulo

**Clase**

Nos permite:

- Modularidad
- Divide el programa en diferentes partes o módulos/clases
- Separar las clases en archivos diferentes (es una buena práctica)

 ### 11. Analizando Uber en Objetos

![image-20220305110351166](.\img\image-20220305110351166.png)

**Objetos identificados**

- Usuario
- Ruta
- Conductor
- Autos (uberx, uberpool, etc)
- pago con tarjeta, paypal o cash
- Viaje o trip

 ### 12. Reto 1: identificando Objetos

Sistema de adopciones de perritos, se identifican los siguientes objetos:

- Usuario o adoptante
- Perro o mascota
- Veterinario o director
- Centro de adopción
- catálogo
- reunión (verificación, decisión)
- seguimiento
- adopción (abarca todo)

## Programación Orientada a Objetos: Análisis

 ### 13. Clases en UML y su sintaxis en código

![image-20220305114948578](.\img\image-20220305114948578.png)

Ejemplo para un objeto persona:

![image-20220305115044802](.\img\image-20220305115044802.png)

Definición de clases y sus métodos en diferentes lenguajes:

Java

```java
class Person {
    String name = "";
    void walk(){}
}
```

Python

```python
class Person:
    name = ""
    def walk():
```

JavaScript

```js
function Person (){}
Person.prototype.walk = function(){}
```

PHP

```php
class Person {
    $name ="";
    function walk(){}
}
```

 ### 14. Modelando nuestros objetos Uber

![image-20220305123138145](.\img\image-20220305123138145.png)

 ### 15. Qué es la herencia

**Don’t repeat yourself** es una filosofía que promueve la reducción de duplicación en programación, esto nos va a inculcar que no tengamos líneas de código duplicadas.

Toda pieza de información nunca debería ser duplicada debido a que incrementa la dificultad en los cambios y evolución

La **herencia** nos permite crear nuevas clases a partir de otras, se basa en modelos y conceptos de la vida real. También tenemos una jerarquía de **padre e hijo**.

Puede darse el caso de que la clase padre tenga un hijo o muchos.

![image-20220305131245950](.\img\image-20220305131245950.png)

A la clase padre también se le conoce como superclase y a las clases hijas como subclases, en algunos lenguajes incluso son palabras reservadas.

![image-20220305131308233](.\img\image-20220305131308233.png)

 ### 16. Aplicando Herencia a nuestro proyecto Uber

![image-20220305143235082](.\img\image-20220305143235082.png)

![image-20220305143253270](.\img\image-20220305143253270.png)

![image-20220305143315474](.\img\image-20220305143315474.png)

**Modelo UML final:**

![img](D:\Platzi\escuelaProgramacion\programacion-orientada-objetos\img\diagrama_10b7b328-fbde-4cc2-b758-0b31ec6f0260.jpg)

 ### 17. Reto 2: analicemos un problema

Imagina que nuestro sistema de adopciones creció y ahora ofrece adoptar pericos, loros, gatos y hamsters.

Genera un nuevo análisis, aplica herencia para abstraer mejor el problema y lograr modularidad en el *software*.

Comparte tus resultados en la sección de discusiones.

![Preview](.\img\centro_adopciones_uml-a0be4070-f577-4607-ac0f-95e0b4cdb906.jpg)

![image-20220305183218610](.\img\image-20220305183218610.png)

## Clases, Objetos y Método constructor

 ### 18. Creando carpetas iniciales para el curso

La estructura de carpetas que estaremos manejando durante el curso será la siguiente:

```tex
CursoPOOUber
├── Java
├── JS
├── PHP
└── Python
```

Básicamente nuestra carpeta raíz será la carpeta `CursoPOOUber` y dentro crearemos las carpetas `Java`, `JS`, `PHP` y `Python` en las cuales iremos guardando nuestros archivos a medida que avanzamos en el curso.

#### Configurando el workspace para Python

En una clase anterior instalamos Python, sin embargo, como estaremos guardando todo el código de este lenguaje dentro de la carpeta `Python` debemos informarle a Visual Studio Code que el código va a estar ahí, de esta forma podemos evitar problemas a futuro cuando usemos módulos.

Para hacer esto es muy sencillo, dentro de nuestra carpeta `CursoPOOUber` vamos a crear una nueva carpeta llamada `.vscode` (ojo, el punto al inicio del nombre es importante). Dentro de esta carpeta vamos a crear un nuevo archivo llamado `settings.json` y dentro de este archivo vamos a poner la siguiente información:

```json
{
    "python.autoComplete.extraPaths": ["./Python"],
}
```

De esta forma le estamos diciendo a nuestro editor de código que todos nuestros archivos de Python van a estar dentro de la carpeta `Python`, por tanto, él sabrá que cualquier módulo deberá leerlo desde esa carpeta, y no desde la carpeta raíz, lo cual evitará que te marque errores en el futuro.

**Es importante** que cuando abras tu proyecto en Visual Studio Code, lo abras desde la carpeta `CursoPOOUber`, de esta forma, el editor de código te mostrará en el árbol de carpetas a tus 5 carpetas que has creado:

![folder_structure.png](.\img\folder_structure-214fcc01-2f6a-4a61-82d1-f8688e142380.jpg)

¡Estamos listos para empezar a codear! Nos vemos en las siguiente clase donde empezaremos a definir clases con Java y Python.

 ### 19. Definiendo clases en Java y Python

Las clases en Java:

```java
//Main.java
class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
//Account.java
class Account {
    Integer id;
    String name;
    String document;
    String email;
    String password;
}
//Car.java
class Car {
    Integer id;
    String license;
    String driver;
    Integer passenger;
}
//Payment.java
class Payment {
    Integer id;
}
//Route.java
import java.util.ArrayList;

public class Route {
    Integer id;
    ArrayList<Double> start;
    ArrayList<Double> end;
}
```

Las clases en Python:

```python
#main.py
if __name__ == "__main__":
    print("Hello World!")
#account.py
class Account:
    id          = int
    name        = str
    document    = str
    email       = str
    password    = str
#car.py
class Car:
    id          = int
    license     = str
    driver      = str
    passenger   = int
#payment.py
class Payment:
    id  = int
#route.py
class Route:
    id      = int
    start   = []
    end     = []
```

 ### 20. Definiendo Clases en JavaScript

JavaScript

```js
//Account.js
function Account(){
    this.id;
    this.name;
    this.document;
    this.email;
    this.password;
}
//Car.js
function Car(){
    this.id;
    this.license;
    this.driver;
    this.passenger;
}
//Payment.js
function Payment(){
    this.id;
}
//Route.js
function Route(){
    this.id;
    this.init;
    this.end;
}
```

PHP

```php
//Account.php
<?php
class Account {
    public $id;
    public $document;
    public $email;
    public $password;
}
//Car.php
<?php
class Car {
    public $id;
    public $driver;
    public $passengers;
}
//Payment.php
<?php
class Payment {
    public $id;
}
//Route.php
<?php
class Route{
    public $id;
    public $start = array();
    public $end = array();
}
```

 ### 21. Objetos, método constructor y su sintaxis en código

Los **objetos** nos ayudan a crear instancia de una clase, el objeto es el resultado de lo que modelamos, de los parámetros declarados y usaremos los objetos para que nuestras clases cobren vida.

Maneras de declarar objetos:

```java
//java
Person person = new Person();
```

```javascript
//JavaScript
var person = new Person();
```

```php
//php
$person = new Person();
```

```python
#Python
person = Person();
```

Los **métodos constructores** dan un estado inicial al objeto y podemos añadirle algunos datos al objeto mediante estos métodos. Los atributos o elementos que pasemos a través del constructor serán los datos mínimos que necesita el objeto para que pueda vivir.

```java
//Java
public Person (String name){
    this.name = name;
}
Person person = new Person ("Ann");
```

```js
//JavaScript
function Person (name){
    this.name = name;
}
var person = new Person("Ann");
```

```php
//php
public function_constructor ($name){
    $this->name = name;
}
$person = new Person ("Ann");
```

```python
#Python
def__init__(self, name):
    self.name = name;
person = Person ("Ann")
```

 ### 22. Objetos. Dando vida a nuestras clases en Java y Python

Java:
```java
//main.java
class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Car car = new Car();
        car.license = "AMG232";
        car.driver = "Andres Herrera";
        car.passenger = 4;
        car.printDataCar();

        Car car1 = new Car();
        car1.license = "AFD45";
        car1.driver = "Juan Martinez";
        car1.passenger = 2;
        car1.printDataCar();
    }
}
```
Python:
```python
#main.py
from hashlib import new
from car import Car

if __name__ == "__main__":
    print("Hello World!")
    car = Car()
    car.license = "ASD234"
    car.driver = "Andres Herrera"
    print(vars(car))

    car2 = Car()
    car2.license = "AKD234"
    car2.driver = "Juan Martinez"
    print(vars(car2))
```

 ### 23. Declarando un Método Constructor en Java y JavaScript

Java:

```java
//Account.java
class Account {
    Integer id;
    String name;
    String document;
    String email;
    String password;

    public Account (String name, String document){
        this.name = name;
        this.document = document;
    }
}
//Car.java
class Car {
    Integer id;
    String license;
    Account driver;
    Integer passenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    void printDataCar(){
        System.out.println(

            "El nombre del conductor es " + driver.name + " y su licencia es " + license
        );
    }
}
//Main.java
class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Car car = new Car("AMQ23", new Account("Andres Herrera", "AND2345"));
        car.passenger = 4;
        car.printDataCar();

        Car car1 = new Car("SD454", new Account("Martin Lopez", "AND343"));
        car1.passenger = 2;
        car1.printDataCar();
    }
}
```

JavaScript:

```js
//Account.js
function Account(name, document){
    this.id;
    this.name = name;
    this.document = document;
    this.email;
    this.password;
}
//Car.js
function Car(license, driver){
    this.id;
    this.license = license;
    this.driver = driver;
    this.passenger;
}

Car.prototype.printDataCar = function(){
    console.log(this.driver);
    console.log(this.driver.name);
    console.log(this.driver.document);
}
//index.js
var car = new Car("AW456", new Account("Andres Herrera", "AND453"));
car.passenger = 3;
car.printDataCar();
```

```html
<!--index.html llamado de módulos-->
<scrpt src="Account.js"></scrpt>
<scrpt src="Car.js"></scrpt>
<scrpt src="index.js"></scrpt>
```

 ### 24. JavaScript orientado a objetos, lo más nuevo

A partir de las nuevas especificaciones del EcmaScript 6 ya podemos declarar una clase con la palabra reservada *class*, aunque es importante aclarar que estos no dejan de ser prototipos, sino todo lo contrario.

Además tendremos una palabra clave para definir un constructor, y dentro de este estarán las propiedades de nuestra clase definidas listas para inicializarse.

Transcribamos el código JavaScript que generamos en la clase anterior a este nuevo estándar.

La clase **Car** quedaría así:

```js
//Car.js
class Car {
    constructor (license, driver){
        this.id;
        this.license = license;
        this.driver = driver;
        this.passenger;
    }
    
    printDataCar (){
        console.log(this.driver);
        console.log(this.driver.name);
        console.log(this.driver.document);
    }
}
```

Si quisiéramos declarar un método, en esta nueva sintaxis dejaremos de utilizar la palabra clave `function`.

```js
//Account.js
class Account {
    constructor (name, document){
        this.id;
        this.name = name;
        this.document = document;
        this.email;
        this.password;
    }
}

//Route.js
class Route {
    constructor (){
        this.id;
        this.init;
        this.end;
    }
}

//Payment.js
class Payment {
    constructor (){
        this.id;
    }
}
```

En este caso para instanciar un objeto seguiremos usando la palabra clave `new`.

```js
//index.js
var car = new Car("AW456", new Account("Andres Herrera", "QWE234"));
car.passenger = 3;
car.printDataCar();
```

Y los resultados serán los mismos.

 ### 25. Declarando un método constructor en Python

En Python encontrarás un concepto denominado **Métodos Mágicos**, estos métodos son llamados automática y estrictamente bajo ciertas reglas. El método constructor en Python forma parte de esta familia de métodos y como aprendimos en la clase anterior lo declaramos usando `__init__`, aunque si nos ponemos estrictos este método no construye el objeto en sí. El encargado de hacer esto es `__new__` y el método `__init__` se encargará de personalizar la instanciación de la clase, esto significa que lo que esté dentro de `__init__` será lo primero que se ejecute cuando se cree un objeto de esta clase.

Para nuestro proyecto tenemos la necesidad de que algunas variables se inicialicen obligatoriamente cuando ocurra la instanciación. Así que declaremos el método `__init__` en las clases de nuestro proyecto con las propiedades obligatorias.

Para la clase Account quedaría algo así, notarás que usamos la palabra clave **self**, esta es muy parecida a lo que venimos trabajando a otros lenguajes con **this**. Y como su nombre lo dice hace referencia a los datos que componen la clase, en este caso `self.name` está llamando al atributo name que se encuentra en la línea 3 de la clase y, le está asignando el dato que se pasa en el método `__init__` de la línea 8.

```python
class Account:
    id          = int
    name        = str
    document    = str
    email       = str
    password    = str

    def __init__(self, name, document):
        self.name = name
        self.document= document
```

Ahora veamos la clase Car:

```python
from account import Account


class Car:
    id          = int
    license     = str
    driver      = Account("","")
    passenger   = int

    def __init__(self, license, driver):
        self.license = license
        self.driver = driver
```

Lo que notarás de diferente es que cambiamos el tipo de dato de **driver**, ahora es de tipo Account y como ves está solicitando los dos datos obligatorios para instanciar un objeto de este tipo. Esto lo verás más en acción en el próximo fragmento de código del archivo `main.py`. Además, mucho ojo, en la primera línea observamos que es importante importar la clase para poderla usar.

Nuestro archivo `main.py` ahora se verá así:

```python
from car import Car
from account import Account

if __name__ == "__main__":
    print("Hello World!")

    car = Car ("AMS234", Account("Andrea Herrera", "ANS455"))
    print(vars(car))
    print(vars(car.driver))
```

Observa que estamos importando las dos clases que usaremos y las estamos instanciando en los métodos constructores.

Los resultados serán los siguientes:

![Captura de pantalla 2019-01-21 a la(s) 1.14.06.png](D:\Platzi\escuelaProgramacion\programacion-orientada-objetos\img\Captura de pantalla 2019-01-21 a la(s) 1.14.06-613a190d-a678-490c-a010-81150b4b883f.jpg)

El código de este ejemplo lo encuentras en este enlace:
https://github.com/anncode1/Curso-POO-Platzi/tree/3.2.ConstructorPython

#### Reto 3

Ahora que ya viste cómo creamos un método constructor en Python, mira esta clase https://platzi.com/clases/2034-php-poo/32133-polimorfismo/ y **hazlo también para PHP**. Compártenos tus resultados en la sección de discusiones.

```php
//Account.php
<?php
class Account {
    public $id;
    public $document;
    public $email;
    public $password;

    public function __construct($name, $document){
        $this->name = $name;
        $this->document = $document;
    }
}

//Car.php
<?php
class Car {
    public $id;
    public $driver;
    public $passengers;

    public function __construct($license, $driver){
        $this->license = $license;
        $this->driver = $driver;
    }

    public function printDataCar(){
        echo "License: $this->license, Driver: {$this->driver->name}, document: {$this->driver->document}";
    }
}

//index.php
<?php
require_once('Car.php');
require_once('Account.php')

$car = new Car ("ASD455", new Account("Andres Herrera", "ANS678"));
$car->printDataCar();
```

## Herencia

 ### 26. Aplicando herencia en lenguaje Java y PHP

```java
//java
class Student extends Person
```

```python
#python
class Student(Person):
```

```js
//JavaScript
student.prototype = new Person();
```

```php
//PHP
class Student extends Person
```

 ### 27. Solución del reto de herencia en PHP

```php
//index.php
<?php
require_once('car.php');
require_once('uberX.php');
require_once('uberPool.php');
require_once('account.php');

$uberX = new UberX("CVB233", new Account("Andres Herrera", "AND44"), "Chevrolet", "Sparl");
$uberX->printDataCar();

echo('<br>');

$uberPool = new UberPool("AMD33", new Account("Andrea Farran", "ASD99"), "Nissan", "Centra");
$uberPool->printDataCar();

?>
```

 ### 28. Aplicando herencia en lenguaje Python y JavaScript

```python
#UberBlack.py
from car import Car

class UberBlack(Car):
    typeCarAccepted = []
    seatsMeterial = []

    def __init__(self, license, driver, typeCarAccepted, seatsMaterial):
        super.__init__(license, driver)
        self.typeCarAccepted = typeCarAccepted
        self.seatsMeterial = seatsMaterial
```

```js
//uberBlack.js
class UberBlack extends Car{
    constructor(license, driver, typeCarAccepted, seatsMaterial){
        super(license, driver)
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
}
```

 ### 29. Otros tipos de Herencia

A partir de ahora las clases que estén siendo heredades las llamaremos familias.

Acabamos de aplicar herencia a la familia **Car**. Ahora apliquémosla a la familia **Payment**.

En clases anteriores te mencioné que otro punto de partida que puedes tomar para aplicar herencia es del hecho de que hay clases que lógicamente deberían estar en una familia, como es el caso de Payment.

Repasemos el diagrama de Payment

![Familia Payment](img\Captura de pantalla 2019-01-21 a la(s) 12.21.03-6c3f1263-88f7-44db-a123-ba70c028069c.jpg)

Notarás que a nivel de código parece inservible pero cuando estemos en el caso de uso Pagar un Viaje, probablemente en ese momento no sabremos cuál es el método de pago, y necesitemos ingresar un dato lo suficientemente genérico que conceptualmente nos dé la información que necesitamos, en este caso que es un Payment. Este es un tipo de Polimorfismo y uno de los principios SOLID del software que obedece a la Inyección de Dependencias. Lo veremos más adelante a detalle.

Ahora nos faltará crear las clases y aplicar su herencia.

 ### 30. Reto 4

Nos queda la Jerarquía Account pendiente.

Tomando como referencia nuestros diagramas. Plásmala en tu lenguaje de programación favorito.

```js
//user.js
class User extends Account{
    constructor(id, name, document, email, password){
        super(name, document);
        this.id = id;
        this.email = email;
        this.password = password;
    }
}
//driver.js
class Driver extends Account{
    constructor(id, name, document, email, password){
        super(name, document);
        this.id = id;
        this.email = email;
        this.password = password;
    }
}
//account.js
class Account{
    constructor(name, document){
        this.id;
        this.name = name;
        this.document = document;
        this.email;
        this.password;
    }

    printDataAccount(){
        console.log({
            name: this.name,
            document: this.document,
            email: this.email
        })
    }
}
//index.js
//code...
var user = new User('User', 'Jorge Perez', 'ANS88', 'email@email', 'asdfjksd');
user.printDataAccount();
```

## Encapsulamiento

 ### 31. Encapsulamiento

El **Encapsulamiento** es hacer que un dato sea inviolable, inalterable cuando se le asigne un modificador de acceso.

Algunos beneficios de encapsulación son:

- Controlar la manera en que los datos son accedidos o modificados
- El código es mas flexible y fácil de cambiar a partir de nuevos requerimientos
- Poder modificar una parte del código sin afectar otras partes del mismo
- Ayuda a mantener la integridad de los datos

Modificadores de acceso en *Java*:

`public`: Todas las clases, mas permisivo

`protected`: Clases, Paquetes y Sub Clases

`default`: Clases y Paquetes

`private`: Clases

 ### 32. Encapsulando atributos en Java

```java
//Car.java
class Car {
    Integer id;
    String license;
    Account driver;
    private Integer passenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
/*         passenger = 3;
        System.out.println("Passenger: " + passenger); */
    }

    void printDataCar(){
        if(passenger != null){
            System.out.println(

                "El nombre del conductor es " + driver.name + " y su licencia es " + license
            );
        }
    }

    //Uso de getter and setter
    public Integer getPassenger(){
        return passenger;
    }

    public void setPassenger(Integer passenger){
        if(passenger == 4){
        this.passenger = passenger;
        } else{
            System.out.println("El valor debe ser 4");
        }
    }
}

//Main.java
class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Car car = new Car("AMQ23", new Account("Andres Herrera", "AND2345"));
        //car.passenger = 4;
        car.setPassenger(4); //set passenger
        car.printDataCar();

        Car uberX = new UberX("ASD44", new Account("Juan Rojas", "DOC55"), "Nissan", "Sentra");
        //uberX.passenger = 2;
        uberX.setPassenger(4); //set passenger
        uberX.printDataCar();

        Payment paypal = new PayPal(95844, "paypal@mail.com");
        paypal.printDataPayment();

        Account driver = new Driver(555, "Maria Arrieros", "DOC444", "driver@mail.com", "4dk·323");
        driver.printDataAccout();
    }
}
```

## Polimorfismo

 ### 33. Generando polimorfismo en Java

**Polimorfismo**: Muchas formas. Poli = muchas, morfismo = formas. **NO** es Poliformismo

Es construir métodos con el mismo nombre pero con comportamiento diferente.

![Polimorfismo](img/image-20220315183503709.png)

 ### 34. Generando polimorfismo en PHP

Para esto creamos getters and Setters en Car.php. Además agregamos una una función para que asigne los pasajeros en uberVan.php.

## Cierre del curso

 ### 35. El diagrama UML de Uber

Este es el diagrama que finalmente obtuvimos, aquí solo faltaría añadirle los atributos que posee cada clase.

![Captura de pantalla 2019-01-21 a la(s) 3.20.10.png](img/Captura de pantalla 2019-01-21 a la(s) 3.20.10-075bf981-504e-46b5-acb5-3d9bc67e8ea5.jpg)

Recopilemos todo lo que hemos aprendido para explicar los últimos detalles.

En primer lugar notarás que tenemos 3 tipos de flechas:

#### Asociación

![associacion.png](img/associacion-d2e1b691-b6e9-4854-85e2-d3ffdf0a9049-16473991668762.jpg)

Como su nombre lo dice, notarás que cada vez que esté referenciada este tipo de flecha significará que ese elemento contiene al otro en su definición. Si recuerdas la clase Car, este contenía una instancia de Driver. La flecha apuntará hacia la dependencia.

![car-driver.png](img/car-driver-204d198e-60fa-4c57-a0d0-0668c0e011d7.jpg)

#### Herencia

![herencia.png](img/herencia-2eb98d5e-bcad-4162-b236-aa87eba20e76-16473991668765.jpg)

Siempre que veamos este tipo de flecha se estará expresando la herencia.
En nuestro diagrama tuvimos al menos tres familias conviviendo. La dirección de la flecha irá desde el hijo hasta el padre.

**Familia Car**

![Captura de pantalla 2019-01-24 a la(s) 1.24.30.png](img/Captura de pantalla 2019-01-24 a la(s) 1.24.30-ff45a4c0-dfa8-464b-8590-5d48cfa03eb5.jpg)

**Familia Account**
![Captura de pantalla 2019-01-24 a la(s) 1.24.13.png](img/Captura de pantalla 2019-01-24 a la(s) 1.24.13-bc9edb69-8909-487b-9619-350dcb933638.jpg)

**Familia Payment**
![Captura de pantalla 2019-01-24 a la(s) 1.24.42.png](img/Captura de pantalla 2019-01-24 a la(s) 1.24.42-ef7679b6-3b93-45c1-a4d9-1d6a24f4aa2a.jpg)

#### Composición

![composicion.png](img/composicion-1da1dd19-6925-42d9-9727-7fd8cb031b0c-164739916687610.jpg)

Pasemos a una de nuestras piezas claves, pues notarás en el centro del diagrama la clase **Trip** que está vinculada a User, Car, Route y Payment. La composición va a significar una asociación entre estas clases con la diferencia de que para que esta clase pueda vivir forzosamente necesita a las demás. Es decir que estas clases son obligatorias para que la clase Trip pueda existir, esta dependencia obligatoria podríamos expresarla en el método constructor de la clase Trip, pues para que un objeto pueda ser creado dependerá de que los demás existan.

![Captura de pantalla 2019-01-24 a la(s) 1.46.08.png](img/Captura de pantalla 2019-01-24 a la(s) 1.46.08-72aaa220-d916-4cae-9ac2-5a8ebe375b80.jpg)

Esta clase Trip poseerá la lógica más fuerte del negocio aquí será donde se concentrarán la mayor cantidad de clases.

Esto es todo nuestro diagrama de clases, que quedó totalmente expresado en nuestro proyecto.

 ### 36. Conclusiones

- UML
- Programación: Java, PHP, python, JavaScript
- Encapsulamiento, abstracción, herencia y polimorfismo
- Clases, Objetos y Métodos

 ### 37. Bonus: Qué es la programación Orientada a Objetos

En la POO hay 5 cosas fundamentales:

- **Clases:** Son el molde más genérico y del cual podemos instanciar muchos objetos.
- **Objetos:** Son creados de las clases y tienen datos y funcionalidad.
- **Atributos:** Son las características especificas del objeto (Son las variables dentro del código)
- **Métodos:** Son las funciones o acciones que puede hacer este objeto.
- **Instanciar:** Es la creación de un objeto desde una clase a eso se le llama instancia o instancias.

**Los pilares de la POO son:**

- **Abstracción:** Es separar cada uno de los datos de un objeto para poder crear su molde (clase)
- **Encapsulamiento:** Es aislar un dato para que este sea privado y no pueda ser visto o modificado.
- **Herencia:** Es crear una o más clases a partir de una clase que ya existe. Y se les llaman subclases.
- **Polimorfismo: **Es construir métodos con el mismo nombre pero con comportamiento diferente.

#### Aproved course!

**Ahora sabes:**

- Conocer los diferentes lenguajes de programación orientados a objetos
- Analizar problemas para el desarrollo de proyectos orientado a objetos
- Entender el funcionamiento de los objetos
- Entender el funcionamiento de las clases
- Dominar las características de la programación orientada a objetos
