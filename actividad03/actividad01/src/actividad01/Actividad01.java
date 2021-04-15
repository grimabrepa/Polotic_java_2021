package actividad01;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * * @author Marcelo Resolver los siguientes ejercicios. Intentar ejecutarlos y
 * probarlos con datos de prueba.
 *
 * a. Llevar a cabo un programa que incluya un vector que almacene los nombres:
 * Alejandra, Leonardo, Rosa, Guillermo, Gabriel, Daniel, Luisa y Ludmila.
 * Realizar un recorrido del vector para cargar los datos y otro recorrido para
 * mostrar los mismos por pantalla.
 *
 * b. Realizar un programa que permita la carga de 10 números en un vector. Una
 * vez cargados, se necesita que el programa determine cual es el mayor y cuál
 * es el menor de ellos.
 *
 * c. Realizar un programa que permita la carga de 15 números en un vector. Una
 * vez cargados, se necesita que el programa cuente e informe por pantalla
 * cuántas veces se cargó el número 3.
 *
 * d. Un empleado desea almacenar en un vector sus 12 sueldos del año. A partir
 * de esto, necesita un programa que determine y muestre por pantalla la suma
 * total de sus 12 sueldos y el promedio de sueldo que tuvo en el año.
 *
 * e. En tres vectores diferentes se guardan los nombres, temperaturas mínimas y
 * máximas de 5 ciudades de la provincia de Misiones. En el primer vector se
 * guardan los nombres de las ciudades, en el segundo las temperaturas mínimas
 * alcanzadas y en el tercero las temperaturas máximas alcanzadas en la última
 * semana. Se necesita un programa que permita la carga de las ciudades, sus
 * temperaturas mínimas y máximas; además, deberá poder informar por pantalla
 * cual fue la ciudad con la temperatura más baja y cual con la temperatura más
 * alta (dando a conocer al mismo tiempo la cantidad de grados).
 *
 */
public class Actividad01 {

    public static void main(String[] args) {
        /*        //a)
        String nombres[] = new String[8];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese un Nombre");
            nombres[i] = sc.next();
        }
        System.out.println("\n Mostrar Nombres");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println((i + 1) + "-" + nombres[i]);
        }
        //b)

        int numeros[] = new int[10];

          System.out.println("Ingrese un Nombre");
    for (int i = 0; i < numeros.length; i++) {
    int aleatorio =(int)(Math.random()*50+1);
           numeros[i] = aleatorio;
               
           }
     for (int i = 0; i < numeros.length; i++) {
               System.out.println(numeros[i]);
        }
    int valorMaximo =numeros[0];
    int valorMinimo = numeros[0];
    
        for (int i = 0; i < numeros.length-1; i++) {
             if (valorMaximo<numeros[i+1]) {
                valorMaximo =numeros[i+1];
            }
             if(valorMinimo>numeros[i+1]){
                 valorMinimo =numeros[i+1];
             }
        }
        System.out.println("Valor Maximo " + valorMaximo);
        System.out.println("Valor Minimo " + valorMinimo);
         
        //c)
        int numeros02[] = new int[15];
        int valorBuscados = 3;
        int cantidadRepetidos = 0;

        for (int i = 0; i < numeros02.length; i++) {
            int aleatorio = (int) (Math.random() * 50 + 1);
            numeros02[i] = aleatorio;

        }
        for (int i = 0; i < numeros02.length; i++) {
            System.out.println(numeros02[i]);
            if (valorBuscados == numeros02[i]) {
                cantidadRepetidos++;
            }
        }
        System.out.println("Total de repetidos :" + cantidadRepetidos);
         */
        //d)
       /* int totalSueldo = 0;
        int sueldo[] = new int[12];
        double promedioSueldo;
        for (int i = 0; i < sueldo.length; i++) {
            int aleatorio = (int) (Math.random() * 60000 + 1);
            sueldo[i] = aleatorio;
        }

        for (int i = 0; i < sueldo.length; i++) {
            System.out.println(sueldo[i]);
            totalSueldo = totalSueldo + sueldo[i];
        }

        promedioSueldo = totalSueldo / sueldo.length;

        System.out.println("Total sueldos: " + totalSueldo);
        System.out.println("Promedio sueldos: " + promedioSueldo);*/
        
      //e)
      String ciudades[];
      int temperaturaMaxima[], temperaturaMinima[];
      int largoVector = 3;
      int indiceMinima=0;
      int indiceMaxima =0;
      Scanner sc = new Scanner(System.in);
      
      ciudades = new String[largoVector];
      temperaturaMaxima = new int [largoVector];
      temperaturaMinima = new int [largoVector];
     
        for (int i = 0; i < ciudades.length; i++) {
            System.out.println("Ingrese el nombre de una Ciudad");
            ciudades[i] = sc.next();
        }
        for (int i = 0; i < temperaturaMinima.length; i++) {
            System.out.println("Ingrese el valor de temperatura Minima");
            temperaturaMinima[i] = sc.nextInt();
        }
        for (int i = 0; i < temperaturaMaxima.length; i++) {
            System.out.println("Ingrese el valor de temperatura Maxima");
            temperaturaMaxima[i] = sc.nextInt();
        }
        
        for (int i = 0; i < largoVector-1; i++) {
            if(temperaturaMinima[i]>temperaturaMinima[i+1]){
                indiceMinima=i+1;
            }
            if (temperaturaMaxima[i]<temperaturaMaxima[i+1]) {
                indiceMaxima=i+1;
            }
        }
        System.out.println("Ciudad con temperatura minima es: "+ciudades[indiceMinima]);
        System.out.println("Ciudad con temperatura minima es: "+ciudades[indiceMaxima]);
    }

}
