## Aplicabilidad
Se debe usarl el patron Abstract Factory cuando:
- Un sistema debe ser independiente de como se crean o se componen y representan sus productos.
- Un sistema debe ser configurado con una familia de productos de entre varias.
- Una familia de objetos productos relacionados está diseñada para ser usada conjuntamente, y es necesario hacer cumplir esta restrincion.
- Quiere proporcionar una biblioteca de clases de productos y solo quiere revelar sus interfaces, no sus implementaciones.
## Estructura
![Estructura](https://ociotec.com/wp-content/uploads/2010/09/FabricaAbstractaModelo.png)
## Participantes
**FabricaAbstracta** 
- Declara una interfaz para operaciones que crean objetos productos abstractos.

**FabricaConcreta**
- Implementa las operaciones para crear objetos productos concretos.

**ProductoAbstracto**
- Declara una interfaz para un tipo de objeto producto.

**ProductoConcreto**
- Define un objeto producto para que sea creado por la fabrica correspondiente.
- Implementa la interfaz del producto abstracto.

**Cliente**
- Solo usa interfaces declaradas por las clases FabricaAbstracta y ProductoAbstracto.

## Colaboraciones
- Normalmente sólo se crea una unica instancia de una clase FabricaConcreta en tiempo de ejecución. Esta fabrica concreta crea objetos 
productos que tienen una determinada implementación. Para crear diferentes objetos producto, los clientes deben usar una fabrica concreta
diferente.
- FabricaAbstracta delega la creacion de objetos producto en su subclase FabricaConcreta.
