Abstract Factory purpose
      El patr—n de Abstract Factory define una interface o una abstracci—n de una clase para crear una familia de objetos relacionados, pero sin especificar sus sub-clases en concreto.
	El patr—n de Abstract Factory es un patr—n de dise–o creacional, un Abstract Factory es in factory que retorna factories. Esta capa de abstracci—n es muy œtil. un factory normal puede ser usada para crear un grupo de objetos relacionados. Un Abtract factory retorna factories. As’ que un Abstract Factory es usado para retornar factories que pueden ser usados para crear un grupo de objetos relacionados.
Ventajas/desventajas
* Asilamiento de clases concretas: El patr—n Abstract Factory nos ayuda controlando los objetos de clases que una aplicaci—n crea. Porque un factory encapsula la responsabilidad y el proceso de crear objetos, este patron a’sla a los clientes de la implementaci—n de las clases. 
* Dificultad en respaldar nuevos tipos de productos: Extender Abstract Factories para producir nuevos tipos de productos no es f‡cil. Eso es porque los interfaces de Abstrac Factory arreglan el grupo de productos que pueden ser creados. Respaldar nuevos tipos de productos requiere extender la interface del factory, el cual involucra cambiar la clase Abstract Factory y todas las subclases.

