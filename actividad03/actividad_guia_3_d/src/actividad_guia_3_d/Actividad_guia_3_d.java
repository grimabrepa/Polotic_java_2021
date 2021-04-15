
package actividad_guia_3_d;

import java.util.Scanner;

/**
 *
 * @author Marcelo
 * 
 *  d. En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de
 * secundario. Cada fila corresponde a las notas y al promedio de cada alumno.
 * i. Se necesita un programa que permita a un profesor cargar en las 3 primeras
 * posiciones de cada fila las notas del alumno y que en la última columna se
 * calculen los promedios. ii. Una vez realizados los cálculos, se desea mostrar
 * las 3 notas de cada alumno y el promedio correspondiente recorriendo la
 * matriz. Ejemplo:
 */
public class Actividad_guia_3_d {

   
    public static void main(String[] args) {
        //d ****************Comienzo de Actividad***************************
/*Variables y asignaciones*/
        Scanner sc = new Scanner(System.in);
        int tamanio = 4;
        double notas[][] = new double[tamanio][tamanio];
        double acumulador;
        double promedio = 0;

/*comienzo de la carga de la matriz*/
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

/*Fin de la carga de la matriz*/


/*Salida de por pantalla de lo resultados*/
        for (int i = 0; i < tamanio; i++) {
            System.out.println("Alumno: "+ (i+1));
             for (int j = 0; j < tamanio; j++) {
                System.out.print(notas[i][j] + " | ");
            }
            System.out.println("");
        }
/*Finalizacion de muestra del resultado*/
    }
    
}
