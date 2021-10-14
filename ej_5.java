import java.util.Scanner;

public class ej_5 {
    public static void main(String[] args) {
        System.out.println("Ingrese dos valores, y se calculara el producto por sumas sucesivas");
        Scanner valor = new Scanner(System.in);
        int operando1 = valor.nextInt();
        int operando2 = valor.nextInt();
        int suma = 0;
        if (operando1 == 0 || operando2 == 0){ 
            System.out.println(operando1+" x "+operando2+" = "+ "0");}
        else{
            for (int i = 1; i <= operando2; i++) {
                suma = suma + operando1;
            }
        System.out.println(operando1+" x "+operando2+" = "+ suma);
    }
}
}
