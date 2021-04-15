package actividad02;

import java.util.Scanner;

/**
 *
 * @author Marcelo a. Llevar a cabo un programa que permite cargar completamente
 * con números 5 una matriz de 4x5 (4 filas, 5 columnas).
 *
 * Llevar a cabo un programa que permita cargar mediante teclado una matriz de 3
 * x 3 (3 filas, 3 columnas) con razas de perros. Una vez cargada, se debe
 * permitir al usuario ingresar por teclado una raza de perro que quiera buscar;
 * el programa deberá poder encontrarla y mostrar un mensaje con la posición
 * (fila, columna) donde la encontró. En caso de que la raza de perro no se
 * encuentre en la matriz, se deberá informar la situación mediante un mensaje
 * por pantalla.
 *
 * b. Llevar a cabo un programa que permita completar con números 1 toda la
 * diagonal principal de una matriz de 6 x 6. Entiéndase por diagonal principal
 * aquella que comienza en [0,0] y termina en [6,6].
 *
 * d. En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de
 * secundario. Cada fila corresponde a las notas y al promedio de cada alumno.
 * i. Se necesita un programa que permita a un profesor cargar en las 3 primeras
 * posiciones de cada fila las notas del alumno y que en la última columna se
 * calculen los promedios. ii. Una vez realizados los cálculos, se desea mostrar
 * las 3 notas de cada alumno y el promedio correspondiente recorriendo la
 * matriz. Ejemplo:
 *
 * e. Una compañía de vuelos cuenta con 6 destinos a los que realiza 3 vuelos
 * diariamente, uno por la mañana, otro al mediodía y otro por la noche. Para
 * administrar estos datos, utiliza una matriz, donde cada fila es un destino y
 * en cada columna se guarda la cantidad de asientos disponibles. i. Se necesita
 * un programa que permita la carga de la matriz con la cantidad de asientos
 * para cada vuelo. ii. Al mismo tiempo, el programa debe permitir a un usuario
 * ingresar el número de destino al que quiere dirigirse, el número de vuelo
 * (dependiendo si quiere viajar a la mañana, al mediodía o a la noche) y la
 * cantidad de pasajes que necesita. iii. A partir de la solicitud del usuario,
 * el programa debe controlar si hay la cantidad suficiente de asientos para la
 * cantidad de pasajes que se requiere. En caso de que así sea, se debe mostrar
 * un cartel por pantalla que diga “su reserva fue realizada con éxito” y se
 * debe descontar del total de asientos los solicitados por el usuario. En caso
 * de no haber más asientos disponibles, se debe informar otro cartel que diga
 * “disculpe, no se pudo completar su operación dado que no hay asientos
 * disponibles”. iv. Desde la compañía de vuelos manifiestan que NO CONOCEN
 * cuantas ventas/reservas se hacen por día. Por lo cual, para finalizar las
 * ventas se ingresa la palabra “finish”.
 *
 */
public class Actividad02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //a ****************Comienzo de Actividad***************************
        /*int fila, columna;
       fila =4;
       columna =5;
       int matriz[][] = new int[fila][columna];
        
       for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
               matriz[i][j]=5;
           }
        }
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(matriz[i][j]+" ");
           }
            System.out.println("");
        }
            
        }*/
        //b ****************Comienzo de Actividad***************************

        /*int [][] matriz02 =new int[6][6];
        for (int i = 0; i < matriz02.length; i++) {
            for (int j = 0; j < matriz02.length; j++) {
                if (i==j) {
                    matriz02[i][j]=1;
                }
            }
        }
        for (int i = 0; i < matriz02.length; i++) {
            for (int j = 0; j < matriz02.length; j++) {
                System.out.print(matriz02[i][j]+" ");
           }
            System.out.println("");
         */
 /*String razas[][] = new String[2][2];
        String raza;

        for (int i = 0; i < razas.length; i++) {
            for (int j = 0; j < razas.length; j++) {
                System.out.println("Ingrese una Raza");
                razas[i][j] = sc.next();
            }

        }

        System.out.println("Impresion de Lista");
        for (int i = 0; i < razas.length; i++) {
            for (int j = 0; j < razas.length; j++) {
                System.out.print(razas[i][j]);
            }
            System.out.println("");
        }
        System.out.println("Ingrese una raza");
        raza = sc.next();
        int fila = 0;
        int columna = 0;

        for (int i = 0; i < razas.length; i++) {
            for (int j = 0; j < razas.length; j++) {
                if (raza.equals(razas[i][j])) {
                    fila = i;
                    columna = j;
                }
              
            }
        }
        if (true) {
            
        }*/
        //d ****************Comienzo de Actividad***************************
        /* int tamanio = 4;
        double notas[][] = new double[tamanio][tamanio];
        double acumulador;
        double promedio = 0;

        for (int i = 0; i < tamanio; i++) {
            acumulador = 0;
            System.out.println("Alumno: " + (i + 1));

            for (int j = 0; j < tamanio - 1; j++) {
                System.out.println("Ingrese nota: " + (j + 1));
                notas[i][j] = sc.nextDouble();
                acumulador = acumulador + notas[i][j];
            }
            notas[i][tamanio - 1] = acumulador / (tamanio - 1);
            System.out.println("");
        }

        for (int i = 0; i < tamanio; i++) {
            System.out.println("Alumno: "+ (i+1));
            for (int j = 0; j < tamanio; j++) {
                System.out.print(notas[i][j] + " | ");
            }
            System.out.println("");
        }*/
        //e ****************Comienzo de Actividad***************************
        /*Variables y asignaciones*/
        int destino;
        int frecuencia;
        int vuelos[][];
        String destinos[] = {"Rio de Janeiro", "Cancun", "Madrid", "Roma", "Milan", "Iguazu"};
        String frecuencias[] = {"Mañana", "Tarde", "Noche"};
        String  salidaSistema;
        int eleccionDestino;
        int indiceDestino;
        int eleccionFrecuencia;
        int indiceFrecuencia;
        int cantidadPasajes;
        boolean bandera;

        /*Asignaciones*/
        destino = 6;
        frecuencia = 3;
        vuelos = new int[destino][frecuencia];
        eleccionDestino = 0;
        indiceDestino = 0;
        indiceFrecuencia = 0;
        cantidadPasajes =0;
        salidaSistema = "";
        bandera =true;

        /*Comienzo de la carga del vector*/
        for (int i = 0; i < destino; i++) {
            int catidadAsientos;
            for (int j = 0; j < frecuencia; j++) {
                catidadAsientos = (int) (Math.random() * 120 + 1);
                vuelos[i][j] = catidadAsientos;
            }

        }
        System.out.println("VUELOS");
        for (int i = 0; i < destino; i++) {
            System.out.print(destinos[i] + " | ");
            for (int j = 0; j < frecuencia; j++) {
                System.out.print(vuelos[i][j] + " | ");
            }
            System.out.println("");
        }
        /*Fin de la carga del vector*/

        do {
                    System.out.println("");
        System.out.println("");
        /*Comienzo del menu del destino*/
        System.out.println("Bienvenido al menu de destino");
        System.out.println("\t 1-" + destinos[0]);
        System.out.println("\t 2-" + destinos[1]);
        System.out.println("\t 3-" + destinos[2]);
        System.out.println("\t 4-" + destinos[3]);
        System.out.println("\t 5-" + destinos[4]);
        System.out.println("\t 6-" + destinos[5]);
        System.out.println("Ingrese un numero de destino");
        eleccionDestino = sc.nextInt();

        switch (eleccionDestino) {
            case 1:
                System.out.println("El destino seleccionado es: " + destinos[0]);
                indiceDestino = 0;
                break;

            case 2:
                System.out.println("El destino seleccionado es: " + destinos[1]);
                indiceDestino = 1;
                break;

            case 3:
                System.out.println("El destino seleccionado es: " + destinos[2]);
                indiceDestino = 2;
                break;

            case 4:
                System.out.println("El destino seleccionado es: " + destinos[3]);
                indiceDestino = 3;
                break;

            case 5:
                System.out.println("El destino seleccionado es: " + destinos[4]);
                indiceDestino = 4;
                break;
            case 6:

                System.out.println("El destino seleccionado es: " + destinos[5]);
                indiceDestino = 5;
                break;

            default:
                System.out.println("Destino no Valido");
                break;
        }
        /*Final  del menu del destino       */

        System.out.println("");

        /*Comienzo del menu del Frecuencia*/
        System.out.println("Seleccione una Frecuencia");
        System.out.println("\t 1-" + frecuencias[0]);
        System.out.println("\t 2-" + frecuencias[1]);
        System.out.println("\t 3-" + frecuencias[2]);

        System.out.println("Ingrese un numero de fecuencia");
        eleccionFrecuencia = sc.nextInt();

        switch (eleccionFrecuencia) {
            case 1:
                System.out.println("La frecuencia seleccionada es de: " + frecuencias[0]);
                indiceFrecuencia = 0;
                break;

            case 2:
                System.out.println("La frecuencia seleccionada es de: " + frecuencias[1]);
                indiceFrecuencia = 1;
                break;

            case 3:
                System.out.println("La frecuencia seleccionada es de: " + frecuencias[2]);
                indiceFrecuencia = 2;
                break;

            default:
                System.out.println("Frecuencia no Valido");
                break;
        }

        /*Final del menu del Frecuencia*/
        System.out.println("");

/*Comienzo validador de pasajes*/
        System.out.println("Ingrese la cantidad de pasajes a reservar");
        
        cantidadPasajes =sc.nextInt();
        if(cantidadPasajes > vuelos[indiceDestino][indiceFrecuencia]){
            System.out.println("No hay asiento Disponible");
        }else{
            System.out.println("Reserva Realizada con Exito");
            vuelos[indiceDestino][indiceFrecuencia] =vuelos[indiceDestino][indiceFrecuencia]-cantidadPasajes; 
        }
        
        System.out.println("");
        /*Impresion de Vuelos*/
        System.out.println("VUELOS");
        for (int i = 0; i < destino; i++) {
            System.out.print(destinos[i] + " | ");
            for (int j = 0; j < frecuencia; j++) {
                System.out.print(vuelos[i][j] + " | ");
            }
            System.out.println("");
        }
       
/*Final del  validador de pasajes*/
        
/**/
    System.out.println("Para finalizar la compra ingrese la palabra finish o ingrese cualquier caracter");
        salidaSistema = sc.next();
            if (salidaSistema.equalsIgnoreCase("finish")) {
                bandera =false;
            }
            
        } while (bandera);
        System.out.println("Gracias por su compra");
    }
}
