import java.util.Scanner;

public class ej_6 {
    public static void main(String[] args) {
        System.out.println("Ingrese dos valores, y se calculara la potencia por productos sucesivos");
        Scanner valor = new Scanner(System.in);
        int base = valor.nextInt();
        int exponente = valor.nextInt();
        int potencia = 1;
        if (base == 0) {
        System.out.println(base+ " elevado a " + exponente + "= 0");}
    else if (exponente == 0) {
        System.out.println(base + " elevado a " + exponente + "= 1");
    }
    else {
        for (int i = 1; i <= exponente; i++){
            potencia = potencia* base;}
            System.out.println(base + " elevado a " + exponente + " = " + potencia);
    }

    }
                
            }
