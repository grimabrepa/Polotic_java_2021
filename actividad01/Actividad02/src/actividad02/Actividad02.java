package actividad02;

import java.util.Scanner;

/**
 * @author Marcelo 
 * Actividad: Resolver los siguientes ejercicios con estructuras
 * selectivas. Intentar ejecutarlos y probarlos con datos de prueba. 1) Una
 * pequeña despensa desea calcular los sueldos de sus empleados. Los puestos de
 * los mismos pueden tener 3 categorías: 1- repositor, 2-cajero y 3-supervisor.
 * a) Los repositores cobran $15.890 + un bono de 10%. b) Los cajeros cobran
 * $25.630,89 fijos. c) Los supervisores cobran $35.560,20 en bruto al cual se
 * les descuenta un 11% de jubilación. Se necesita una aplicación que,
 * dependiendo el tipo de empleado del que se trate, calcule y muestre en
 * pantalla el correspondiente sueldo.
 *
 * 2) Una mercería vende canutillos y mostacillas al por mayor mediante su
 * página web. Como se trata de una mercería mayorista, solicita la cantidad de
 * paquetes en cada venta y dependiendo de esta realiza los siguientes
 * controles: a) Si la cantidad de productos es menor a 5: Se debe emitir un
 * mensaje indicando que no se permiten compras inferiores a 5 productos. b) Si
 * la cantidad de productos es mayor o igual a 5 pero menor o igual a 15: Se
 * debe emitir un mensaje que el costo de envío es de $200. c) Si la cantidad de
 * productos es mayor o igual a 5 y es mayor a 15: Se debe emitir un mensaje de
 * que el envío es gratuito. Realizar el programa necesario para llevar a cabo
 * los 3 controles citados. 3) Un instituto de inglés desea informar a sus
 * alumnos los días y horarios de sus clases. Para ello, decidió la creación de
 * una aplicación que, a partir del ingreso de la edad del alumno, le informe en
 * qué días y horarios los alumnos tienen clases. Como información, la academia
 * proporciona los siguientes datos respecto a los grupos y los diferentes
 * horarios. a) Kinder (de 4 a 6 años inclusive): Lunes y Miércoles de 16 a 17
 * b) 1st year (de 7 a 8 años inclusive): Martes y Jueves de 16:30 a 17:30 c)
 * 2nd year (de 9 a 10 años inclusive): Martes y Jueves de 17:30 a 19 d) 3rd
 * year (de 11 a 13 años inclusive): Lunes y Miércoles de 17 a 18:30 Realizar el
 * programa solicitado por el instituto, donde a partir del ingreso de la EDAD
 * del alumno, el sistema informe por pantalla los días y horarios de cursada.
 */
public class Actividad02 {

    public static void main(String[] args) {
        //ACTIVIDAD 2.1
        int empleado;
        float sueldo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la categoria del Empleado, ingresando el valor numerico correspondiente");
        System.out.println("1-Repositor");
        System.out.println("2-Cajero");
        System.out.println("3-Supervisor\n");
        empleado = sc.nextInt();
        System.out.println("\n");
        switch (empleado) {
            case 1:
                sueldo = 15890 + 15890 * 0.1F;
                System.out.println("$ " + sueldo);
                break;
            case 2:
                sueldo = 25630.89F;
                System.out.println("$ " + sueldo);
                break;
            case 3:
                sueldo = (float) (35560.20 - 35560.20 * 0.11);
                System.out.println("$ " + sueldo);
                break;
            default:
                System.out.println("El valor ingresado no pertenece a ninguna categoria");
        }
        //ACTIVIDAD 2.2
        int productos;
        System.out.println("Ingrese la cantidad de productos");
        productos = sc.nextInt();

        if (productos >= 5 && productos > 15) {
            System.out.println("Envio gratuito");
        } else {
            if (productos >= 5 && productos <= 15) {
                System.out.println("El costo de envio es de $200.00.-");

            } else {
                System.out.println("No se admiten compras inferiores a cinco Productos");
            }
        }

        //ACTIVIDAD 2.3
        int edad;
        System.out.println("Ingrese la edad del Alumno");
        edad = sc.nextInt();

        if (edad >= 4 && edad <= 6) {
            System.out.println("Lunes y Miércoles de 16 a 17");
        } else {
            if (edad > 6 && edad <= 8) {
                System.out.println("Martes y Jueves de 16:30 a 17:30");
            } else {
                if (edad >= 9 && edad <= 10) {
                    System.out.println("Martes y Jueves de 17:30 a 19");
                } else {
                    if (edad >= 11 && edad <= 13) {
                        System.out.println("Lunes y Miércoles de 17 a 18:30");

                    } else {
                        System.out.println("La edad ingresada no contempla ninguna Clase");
                    }
                }
            }
        }
    }

}
