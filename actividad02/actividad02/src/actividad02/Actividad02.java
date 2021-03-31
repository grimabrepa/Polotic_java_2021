package actividad02;

import java.util.Scanner;

/**
 * 
 * * @author Marcelo
 *1) Ejercicios introductorios
a. Realizar un programa que muestre en pantalla los números del 1 al 35 (uno abajo del otro). 
* Utilizar para esto alguna estructura repetitiva.
b. Realizar un programa que dado por teclado un límite numérico por teclado (por ejemplo 100)
* muestre en pantalla todos los números hasta ese límite (empezando por 1).
c. Realizar un programa que muestre por pantalla los números del 200 al 250 saltando de 2 en dos.
* La secuencia debería ser: 200…202…204…etc.
d. Realizar un programa que lleve a cabo la cuenta regresiva para el año nuevo.
* La cuenta debe comenzar en 10 y terminar en 1.
e. Realizar un programa que muestre en pantalla palabras que sean ingresadas 
* por teclado hasta que se ingrese la palabra “salir”.
2) Ejercicios integradores
Resolver los siguientes ejercicios. Intentar ejecutarlos y probarlos con datos de prueba.
a. Un gerente de una empresa prestadora de servicios de internet necesita un programa 
* que permita realizar el cálculo del monto a pagar de la factura de consumo de 
* internet de 5 clientes de una empresa. Para ello, el algoritmo debe solicitar por teclado dos datos: DNI del cliente y el tipo de servicio. Los tipos de servicio son 3:
    i. Internet 30 megas (cuyo valor es de $890 – 10% de descuento)
    ii. Internet 50 megas (Cuyo valor es de $1050 – 5% de descuento)
    iii. Internet 100 megas (Cuyo valor fijo es de $1600)
El programa debe poder calcular el monto a pagar (dependiendo del tipo de servicio con el que cuente
* el cliente) e informar por pantalla el DNI del mismo junto con el monto a pagar 
* y el número de servicio con el que cuenta.

* b. Un niño de primaria necesita realizar 10 cálculos diferentes entre dos números. 
* Para esto necesita un programa que, para cada cálculo, permita el ingreso de los dos números 
* por separado al igual que la operación que desea hacer entre ambos. 
* Al mismo tiempo debe poder realizar el cálculo en cuestión y mostrar el resultado por pantalla.
Por ejemplo:
Número 1 = 25 Número 2 = 15 Operador = +
Desarrollo Web Full Stack con Java – Ing. Luisina de Paula
c. En la ciudad de Oberá, Misiones se realiza año a año la “Maratón del Inmigrante” 
* en el marco de la Fiesta Nacional del Inmigrante. 
* El evento cuenta con un día de inscripciones el día anterior a la carrera,
* por lo que se desconoce la cantidad exacta de inscriptos que puede llegar a haber.
* Desde la Federación de Colectividades (Organismo que organiza), manifestaron que se solicitan
* los siguientes datos para la inscripción de cada participante: dni, nombre, apellido y edad.
En cuanto a las categorías posibles para una inscripción, se manejan las siguientes:
• Menores A (de 6 a 10 años)
• Menores B (de 11 a 17 años)
• Juveniles (de 18 a 30 años)
• Adultos (de 31 a 50 años)
• Adultos mayores (mayores de 50 años)
Se necesita un programa que, a partir del ingreso de los datos y edad de cada participante, se muestre por pantalla a qué categoría debe ser inscripto. Cabe destacar que, al finalizar el día, para dar fin a las inscripciones, se debe ingresar un dni con el valor 0 y un nombre con la palabra “fin”.
*/
public class Actividad02 {

   
    public static void main(String[] args) {
        //a)
        
      String dni;
       int tipoServicio;
       double importe;
       importe =0;
       Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese su DNI");
       dni = sc.nextLine();
       System.out.println("Ingrese tipo de servicio");
       tipoServicio = sc.nextInt();
       
       switch(tipoServicio){
           case 1:
               importe = 890 +890 *0.1;
               break;
          
           case 2:
               importe = 1050 +1050 *0.05;
               break;
               
           case 3:
               importe = 1600;
               break;
          default:
              System.out.println("Ingreso un tipo de servicio no valido");
              
       } 
       
        System.out.println("\n FACTURA TIPO c");
        System.out.println("Cliente Nº: " + dni);
        System.out.println("Importe total: $ " + importe);
        System.out.println("tipo de Servicio Nº:" + tipoServicio);
        
        
      //b)
      double numero1, numero2, resultado;
      int operador, cantidadOperaciones;
      resultado =0;
      cantidadOperaciones = 10;
      
        for (int i = 0; i < cantidadOperaciones; i++) {
            System.out.println("\nIngrese el primer valor");
        numero1 = sc.nextDouble();
        System.out.println("Ingrese el segundo valor");
        numero2 = sc.nextDouble();
        
        System.out.println("Ingrese la operacion que necesita realizar");
        System.out.println("1-Suma");
        System.out.println("2-Resta");
        System.out.println("3-Multiplicacion");
        System.out.println("4-Division");
        operador =sc.nextInt();
        
        switch(operador){
            case 1:
               resultado = numero1 + numero2;
               break;
          
           case 2:
              resultado = numero1 - numero2;
               break;
               
           case 3:
               resultado = numero1 * numero2;
               break;
           case 4:
               resultado = numero1 / numero2;
               break;
          default:
              System.out.println("Ingreso una operacion  no valida es: ");   
        }
        System.out.println("Reultado de la operacion solicitada - " + resultado);
        
      //c)
        String dni2, nombre, apellido;
        int edad;
        do {            
            System.out.println("Ingrese su DNI: ");
            dni2 = sc.next();
            System.out.println("Ingrese su  Nombre: ");
            nombre = sc.next();
            System.out.println("Ingrese su Apellido: ");
            apellido = sc.next();
            System.out.println("Ingrese su Edad:");
            edad =sc.nextInt();
            System.out.println("");
            if(edad >=6 && edad<=10){
                System.out.println("Menores A (de 6 a 10 años)");
            }else if(edad >=11 && edad<=17){
                System.out.println("Menores B (de 11 a 17 años)");
            }else if(edad >=18 && edad<=30){
                System.out.println("Juveniles (de 18 a 30 años)");
            }else if(edad >=31 && edad<=50){
                System.out.println("Adultos (de 31 a 50 años)");
            }else if(edad>50){
                System.out.println("Adultos mayores (mayores de 50 años)");
            }else{
                System.out.println("edad no contemplada");
            }    
        } while (!dni2.equals("0") && !nombre.equalsIgnoreCase("fin"));
        
       
      
    }
    }
    
}
