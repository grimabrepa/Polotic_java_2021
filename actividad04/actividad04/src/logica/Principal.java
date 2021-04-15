
package logica;

import igu.Ventana;

/**
 *
 * @author Marcelo
 * Resolver los siguientes ejercicios. Intentar ejecutarlos y probarlos con datos de prueba.
 * 1. Se necesita una Interfaz Gráfica de Usuario (IGU) para el login de una aplicación. 
 * La IGU debe tener un jTextField para el nombre de usuario y otro para la contraseña (con sus respectivas labels/etiquetas). Al mismo tiempo se necesita un botón de login y otro para limpiar los datos. Al hacer click en el botón de login, debe verificar si el usuario y contraseña son correctos; de ser así, debe manifestar un saludo “Bienvenido usuario” en un textArea (donde usuario debe ser reemplazado por el nombre del usuario).
 * Si el usuario es incorrecto, debe dar a conocer dicha situación.
 * Establecer como usuario y contraseña correctos los siguientes:
 * • Usuario: admin
 * • Contraseña: 123Prueba
 * • Ejemplo del diseño de la Interfaz:
 */
public class Principal {

   
    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        
        
            }
    
}
