import java.util.Scanner;
public class Ej4 {
    public static void main(String[] args) {
    int resultado;
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe el primer número");
    int numero1 = sc.nextInt();  
    System.out.println("Escribe el segundo número");
    int numero2 = sc.nextInt();
    resultado = numero1 + numero2;
    System.out.println(numero1 + " + " + numero2 + " = " + resultado);
    }
}
