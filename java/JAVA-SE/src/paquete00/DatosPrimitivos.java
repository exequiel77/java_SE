package paquete00;

/**@author exequiel
 * En este caso denotaremos los tipos de datos primitivos de java.
 * Java es fuertemente tipado si un dato es de un tipo especifico no se le puede
 * asignar un valor de otro tipo. Ej: int a = 15.67 no se le puede asignar un
 * valor flotante a una variable entera
 */
public class DatosPrimitivos {
    
    public static void main(String[] args) {
        //Declaracion y asignacion de una variable int(entera) rango []
        int entero = 10;
        //Declaracion y asignacion de una variable flotante rango[]
        double flotante = 46.73;
        //Declaracion y asignacion de una variable booleana rango[true - false]
        boolean booleana = false;
        //Declaracion y asignacion de un caracter rango [A hasta Z o a hasta z]
        char caracter = 'a';
        
        //imprimir por consola los valores de las variables
        System.out.println("Entero: "+entero);
        System.out.println("Flotante o decimal: "+flotante);
        System.out.println("Booleana: "+booleana);
        System.out.println("Caracter: "+caracter);
        
        //cambiar el valor de todas las variables
        entero = 20;
        flotante = 16.44;
        booleana = true;
        caracter = 'z';
        
        //Volver a imprimir por consola las variables con los nuevos valores
        System.out.println("---------------Nuevos valores--------------------");
        System.out.println("Entero: "+entero);
        System.out.println("Flotante o decimal: "+flotante);
        System.out.println("Booleana: "+booleana);
        System.out.println("Caracter: "+caracter);
    }
    
}
