
package actividad01;

import java.util.Scanner;

/**
 *
 * @author Marcelo
 * a) Realizar un programa que muestre en pantalla los números del 1 al 35 
 * (uno abajo del otro). Utilizar para esto alguna estructura repetitiva.
 * 
 * b)Realizar un programa que dado por teclado un límite numérico (por ejemplo 100)
 * muestre en pantalla todos los números hasta ese límite (empezando por 1).
 * 
 * c)Realizar un programa que muestre por pantalla los números del 200 al 250 saltando de 2 en dos.
 * La secuencia debería ser: 200…202…204…etc.
 * 
 * d)Realizar un programa que lleve a cabo la cuenta regresiva para el año nuevo. 
 * La cuenta debe comenzar en 10 y terminar en 1.
 * 
 * e) Realizar un programa que muestre en pantalla palabras que sean ingresada 
 * por teclado hasta que se ingrese la plabra Salir.
 * 
 */
public class Actividad01 {

   
    public static void main(String[] args) {
     //a)
        System.out.println("Actividad -A");
        int valorInicio, valorFinal;
        valorFinal = 35;
               
        for (valorInicio = 1; valorInicio <= valorFinal; valorInicio++) {
            System.out.println(valorInicio);
        }
        
        
     //b)
        System.out.println("\n Actividad -B");
        Scanner sc = new Scanner(System.in);
        int limite;
        System.out.println("Ingrese un valor Entero para fijar el limite de Iteracion");
        limite =sc.nextInt();
        for (valorInicio = 1;valorInicio  < limite; valorInicio++) {
               System.out.println(valorInicio);
        }
     
     //c)
        System.out.println("\n Actividad -C");
        valorFinal =250;
        for (valorInicio = 200;  valorInicio <= valorFinal; valorInicio+=2) {
            System.out.println(valorInicio);
        }
        
     //d)
        System.out.println("\n Actividad -D");
        valorFinal =1;
        for (valorInicio = 10; valorInicio >=valorFinal; valorInicio--) {
            System.out.println(valorInicio);
        }
     //e
        System.out.println("\n Actividad -E");
        String valorSalida,cadena;
        valorSalida = "salir";
        System.out.println("Ingrese palabras, para terminar con el ingreso, escriba la palabra salir");
        cadena = sc.next().toLowerCase();
        
        while (!cadena.equals( valorSalida)) {            
            System.out.println(cadena);
            System.out.println("Ingrese palabras, para terminar escriba la palabrea salir");
            cadena = sc.next().toLowerCase();
        }
    }
    
}
