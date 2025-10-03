//Declara una constante con el valor de IRPF (0.15) y úsala para calcular el sueldo neto de una nómina a partir de su sueldo bruto.
public class Ej13 {
    public static void main(String[] args) {
        
        final double irpf = 0.15;
        double sueldoBruto = 2000.0;
        double sueldoNeto = sueldoBruto - (sueldoBruto * irpf);
        System.out.println("Sueldo bruto: " + sueldoBruto + " €");
        System.out.println("Sueldo neto: " + sueldoNeto + " €");
    }
}