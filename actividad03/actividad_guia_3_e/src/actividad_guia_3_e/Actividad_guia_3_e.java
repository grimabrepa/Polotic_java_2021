
package actividad_guia_3_e;

import java.util.Scanner;

/**
 *
 * @author Marcelo
 * * e. Una compañía de vuelos cuenta con 6 destinos a los que realiza 3 vuelos
 * diariamente, uno por la mañana, otro al mediodía y otro por la noche. Para
 * administrar estos datos, utiliza una matriz, donde cada fila es un destino y
 * en cada columna se guarda la cantidad de asientos disponibles. 
 *      i. Se necesita un programa que permita la carga de la matriz con la cantidad de asientos
 * para cada vuelo. 
 *          ii. Al mismo tiempo, el programa debe permitir a un usuario
 * ingresar el número de destino al que quiere dirigirse, el número de vuelo
 * (dependiendo si quiere viajar a la mañana, al mediodía o a la noche) y la
 * cantidad de pasajes que necesita. 
 *          iii. A partir de la solicitud del usuario,
 * el programa debe controlar si hay la cantidad suficiente de asientos para la
 * cantidad de pasajes que se requiere. En caso de que así sea, se debe mostrar
 * un cartel por pantalla que diga “su reserva fue realizada con éxito” y se
 * debe descontar del total de asientos los solicitados por el usuario. En caso
 * de no haber más asientos disponibles, se debe informar otro cartel que diga
 * “disculpe, no se pudo completar su operación dado que no hay asientos
 * disponibles”. 
 *      iv. Desde la compañía de vuelos manifiestan que NO CONOCEN
 * cuantas ventas/reservas se hacen por día. Por lo cual, para finalizar las
 * ventas se ingresa la palabra “finish”.
 */
public class Actividad_guia_3_e {

    public static void main(String[] args) {
         //e ****************Comienzo de Actividad***************************

/*Variables y asignaciones*/
        Scanner sc = new Scanner(System.in);
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


/*Comienzo del menu del destino*/
        do {
                    System.out.println("");
        System.out.println("");
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
        
/*Comienzo del Menu de salida*/
    System.out.println("Para finalizar la compra ingrese la palabra finish o ingrese cualquier caracter");
        salidaSistema = sc.next();
            if (salidaSistema.equalsIgnoreCase("finish")) {
                bandera =false;
            }
/*Final  del Menu de salida*/            
        } while (bandera);
        
/*Final  del menu del destino       */
        System.out.println("Gracias por su compra");

    }
    
}
