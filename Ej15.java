
public class Ej15 {
    public static void main(String[] args) {
        
        int numero = 2147483647; 

         int resultado = numero + 1;

      
        System.out.println("Número original: " + numero);
        System.out.println("Número + 1: " + resultado);

        
         // En lugar de dar error, el int pasa a su valor mínimo (-2147483648).
         
    }
}
