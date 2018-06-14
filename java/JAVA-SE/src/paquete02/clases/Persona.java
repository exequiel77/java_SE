package paquete02.clases;

/**@author exequiel
 * Tomando como ejemplo la clase Persona definiremos sus atributos y metodos.
 * Atributos: una persona tiene un nombre, un apellido, una fecha de nacimiento,
 * una edad, un domicilio, un dni, etc.
 * Metodos: una persona puede saludar, mostrar su info, en fin cualquier tipo de
 * proceso o accion.
 */
public class Persona {
    //Declaracion de atributos
    private int dni; //dni de una persona
    private String nombre, apellido;//nombre y apellido de una persona. Conviene tenerlos diferenciados
    //fin de declaracion de atributos
    
    /*constructor: un constructor es un metodo que sirve para inicializar nuestros objetos
    un constructor no es de ningun tipo y lleva el mismo nombre de la clase.
    */
    public Persona(){//constructor que no recibe ningun parametro
    }
    
    public Persona(int dni, String nombre, String apellido){//constructor que recibe dni- nombre- apellido
        this.dni = dni; //el atributo dni de la clase Persona recibe el valor del parametro dni enviado
        this.nombre = nombre;//el atributo nombre de la clase Persona recibe el valor del parametro nombre enviado
        this.apellido = apellido;//el atributo apellido de la clase Persona recibe el valor del parametro apellido enviado
    }
    
    /*
    Metodos gets y sets. Los metodos gets son usados para devolver el valor de algun atributo
    que puede ser de tipo de dato primitivo u objeto, no reciben ningun parametro.
    Los metodos sets son modificadores de atributos no retornan ningun valor y 
    deben ser del mismo tipo del atributo.
    */
    public int getDni() {//este metodo devuelve un valor entero
        return dni;//retorna el dni de una persona
    }

    public void setDni(int dni) {//este metodo modifica el atribtuo dni de persona
        this.dni = dni;//el atributo dni de persona recibe el valor del paremetro dni
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    //Metodo para saludar
    public void saludar(){
        System.out.println("Hola soy una persona");//muestra un saludo
    }
    
    public void mostrarDatos1(){
        System.out.println("Dni: "+getDni()+" - Apellido: "+getApellido()+" - Nombre: "+getNombre());
    }
    
    public String mostrarDatos2(){
        return "Dni: "+getDni()+" - Apellido: "+getApellido()+" - Nombre: "+getNombre();
    }
}
