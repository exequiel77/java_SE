package paquete01;

/**@author exequiel
 * Las cadenas de caracteres no son un tipo de dato primitivo sino una clase
 * que predefinida por java, esta es la clase String (empieza con mayuscula
 * denotando que es una clase). Con lo que tambien indica que tiene metodos
 * tambien predefinidos.
 * Las cadenas son muy utilizados ejemplo: nombre de personas, direcciones,
 * comentarios, un sin de aplicaciones. Por lo que cual es de vital importancia
 * conocerlas.
 */
public class CadenaDeCaracteres {
    
    public static void main(String[] args) {
        //Declaracion de una cadena
        String cadena; //String es una clase, por lo que cadena es de la clase String
        //Asignacion de una cadena
        cadena = "Hola Mundo!!!. Estoy Usando Cadenas De Texto...";//las cadenas se colocan con comillas dobles
        //impresion por consola de una cadena
        System.out.println("Cadena de texto: "+cadena);
        
        //obtener la longitud de una cadena
        System.out.println("-------------------------------------------------");
        int longitud = cadena.length(); //length() es un metodo de la clase String que retorna la longitud de una cadena (entero)
        System.out.println("Longitud de cadena: "+longitud);
        
        //mostrar la cadena en mayusculas
        System.out.println("-------------------------------------------------");
        String mayusculas = cadena.toUpperCase();//toUpperCase() es un metodo de la clase String que transforma todos sus caracteres en mayusculas
        System.out.println("Cadena en mayusculas: "+mayusculas);
        
        //mostrar la cadena en minusculas
        System.out.println("-------------------------------------------------");
        String minusculas = cadena.toLowerCase();//toLowerCase() es un metodo de la clase String que transforma todos los caracteres de una cadena a minusculas
        System.out.println("Cadena en minusculas: "+minusculas);
        
        //concatenar cadenas cadena = cadena1 seguida de cadena2
        System.out.println("-------------------------------------------------");
        System.out.println("Concatenando cadenas: "+mayusculas+minusculas);
        
        //extraer una sub cadena desde la posicion 5 hasta la posicion 20
        System.out.println("-------------------------------------------------");
        String subCadena = cadena.substring(5,20);
        System.out.println("Cadena recortada: "+subCadena);
        
        //corroborar si dos cadenas son iguales
        //condicion retorna un booleano(true o false)
        System.out.println("-------------------------------------------------");
        if(mayusculas.equals(minusculas)){//cadena1.equals(cadena2) este metodo comprueba si una cadena es igual a otra
            //En caso de que sean iguales
            System.out.println("Las cadenas son iguales");
        }else{
            //caso contrario
            System.out.println("Las cadenas son distintas");
        }
        
        //Recorrer una cadena posicion por posicion. Arranca desde la posicion 0
        //i<cadena.length(): recorrer la cadena hasta el ultimo caracter
        //i++: incrementar en uno. Empezar en 0 luego 1 luego 2 hasta n.
        int cantidadMayusculas=0, cantidadMinusculas=0, cantidadEspacios=0;
        int cantidadSignos=0, cantidadNumeros=0;
        System.out.println("-------------------------------------------------");
        for(int i=0; i<cadena.length(); i++){
            char caracter = cadena.charAt(i);//captura el caracter de la posicion i
            System.out.println("Caracter: "+caracter+"-Posicion: "+i);
            
            //el caracter es una minuscula?
            if(Character.isLowerCase(caracter)){
                cantidadMinusculas++; //incrementar cantidad de contador
            }
            
            //el caracter es una minuscula?
            if(Character.isUpperCase(caracter)){
                cantidadMayusculas++;//incrementar cantidad de contador
            }
            
            //el caracter es un espacio en blanco
            if(Character.isWhitespace(caracter)){
                cantidadEspacios++;//incrementar cantidad de contador
            }
            
            //el caracter es un signo? si no es letra o digito debe ser un signo o espacio en blanco
            if(!Character.isLetterOrDigit(caracter)){// ! indica distinto o si no es asi.
                cantidadSignos++;//aumentar el contador del contador
            }
        }
        //La cantidad de signos se le deben restar los espacios en blanco
        cantidadSignos = cantidadSignos - cantidadEspacios;
        //imprimir el valor de los contadores
        System.out.println("-------------------------------------------------");
        System.out.println("Cantidad de mayusculas: "+cantidadMayusculas);
        System.out.println("Cantidad de minusculas: "+cantidadMinusculas);
        System.out.println("Cantidad de espacios en blanco: "+cantidadEspacios);
        System.out.println("Cantidad de signos especiales: "+cantidadSignos);
    }
    
}
