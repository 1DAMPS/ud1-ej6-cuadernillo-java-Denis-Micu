//Escribe un programa que muestre por pantalla el resultado de una multiplicación. Añade un comentario JavaDoc a la clase con:
//una breve descripción del programa
//las etiquetas @author y @version
//Genera la documentación con javadoc y revisa el archivo HTML resultante.

/**
 * Programa que muestra por pantalla el resultado de una multiplicación.
 * 
 * @author Denis Micu
 * @version 1.0
 */
public class Ej20 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
        int resultado = num1 * num2;
        
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}
