package paquete02.clases;

/**@author exequiel
 * Las clases son tipos de datos definidos por el usuario. Una clase es una abstraccion
 * de la realidad(que es algo muy complejo). Ejemplo una clase Persona, Alumno,
 * Profesor, Animal, Empresa, Venta, ... El nombre de las clases Empiezan con mayusculas.
 * Una clase tiene atributos o propiedades y metodos o acciones.
 * Un objeto es una instancia de una clase. Ej Persona p = new Persona(); donde p
 * es un objeto de la clase persona
 */
public class EjemploClases {
    
    public static void main(String[] args) {
        /*Crearemos objetos personas de distintas maneras. Haremos que saluden y
        muestren sus datos de distintas formas. Elegir la que mas convenga segun
        el planteo del problema o tambien se pueden combinar las formas
        */
        
        //Manera 1
        Persona p1 = new Persona();//instanciamos un objeto p1 de la clase persona
        p1.setDni(1);//el dni de la persona sera 1
        p1.setNombre("Juan");//el nombre de persona sera Juan
        p1.setApellido("Juarez");//el apellido de persona sera Juarez
        p1.saludar();//hacer que la persona salude
        //mostrar sus datos
        System.out.println("Dni: "+p1.getDni()+" - Apellido: "+p1.getApellido()+" - Nombre: "+p1.getNombre());
        System.out.println("-------------------------------------------------");
        
        //Manera 2
        Persona p2 = new Persona();
        p2.setApellido("Robles");
        p2.setDni(2);
        p2.setNombre("Ana");
        p2.saludar();
        //mostrar sus datos con el primer metodo mostrarDatos
        p2.mostrarDatos1();
        System.out.println("-------------------------------------------------");
        
        //Manera 3
        Persona p3 = new Persona(3,"Esteban","Lopez");//constructor 2 de persona
        p3.saludar();
        System.out.println(p3.mostrarDatos2());//llama al segundo metodo para mostrar datos
    }
    
}