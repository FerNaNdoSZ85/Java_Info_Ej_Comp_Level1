import java.util.Scanner;

public class ej_2 {
    public static void main(String[] args) {
        System.out.println("Bienvenido la mini calcu, ingrese dos valores");
        Scanner valor = new Scanner(System.in);
        int entero1 = valor.nextInt();
        int entero2 = valor.nextInt();

        System.out.println(entero1+  " + " + entero2 + " = " + (entero1 + entero2));
        System.out.println(entero1 + " - " + entero2 + " = " + (entero1 - entero2));
        System.out.println(entero1 + " * " + entero2 + " = " + (entero1 * entero2));
        System.out.println(entero1+  " / " + entero2 + " = " + (entero1 / entero2));
        System.out.println(entero1+  " % " + entero2 + " = " + (entero1 % entero2));
    }
}
