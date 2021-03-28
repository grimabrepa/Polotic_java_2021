
package actividad01;
/** 
 * @author Marcelo
 * actividad: 1) Probar realizar las operaciones que se citan a continuación en el IDE Netbeans, registrar los errores obtenidos y responder a las preguntas citadas.
a. Declarar una variable de tipo entero, otra de tipo double y otra de tipo String.
b. Asignar un valor a la variable de tipo entero y asignar esta última a la variable de tipo double.
* ¿Existe un error? ¿Se puede hacer esta operación?
c. Asignar un valor a la variable de tipo double y asignar esta última a la variable de tipo entero. 
* ¿Existe un error? ¿Se puede hacer esta operación?
d. Asignar el valor 35 a la variable de tipo String. ¿Existe un error? ¿Se puede hacer esta operación?
e. Si quiero almacenar el número 48 en la variable String. ¿Cómo debo realizar la asignación?
2) Realizar un programa que permita el intercambio de valores entre dos variables. 
* Por ejemplo: Si una variable numero vale 35, y una variable numero2 vale 20, 
* realizar las acciones necesarias para que numero pase a valer 20 y numero2 pase a valer 35. 
* Una vez realizado el cambio mostrar el resultado por pantalla.
 */
public class Actividad01 {

    public static void main(String[] args) {
  //ACTIVIDAD 1.1
    //Item a:
  int entero;
  double doble;
  String cadena;
  
  //b: respuesta: No se produjo ningun error, esta operacion es valida por que la variable receptora
  // es de mayor capacidad que la variable contenida
  entero = 2021;
  doble = entero;

  //c: Hay error en este tipo de asignaciones- esta operacion presenta error de tipo, esta operacion
  // se soluciona realizando un casteo para cambiar el tipo de la caja contenida
  doble = 20.21;
  entero = (int)doble;
  
  //d: No hay error por que el valor 35 fue introduciod como una cadena al colocarle la doble comillas
  // esta operacion es valida.
  cadena = "35";
  
  //e: En el punto d, se explica la operacion a realizar
  cadena = "48";
  
  //ACTIVIDAD 1.2
    int numero, numero2, aux;
    numero =35;
    numero2 = 20;
        System.out.println("Numeros iniciales");
        System.out.println("El valor 1 es: " + numero);
        System.out.println("El valor 2 es: " + numero2);
    aux= numero;
    numero=numero2;
    numero2=aux;
        System.out.println("\nNumeros intercambiados");
        System.out.println("El valor 1 es: " + numero);
        System.out.println("El valor 2 es: " + numero2);
    }
  }

