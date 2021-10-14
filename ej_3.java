import java.util.Scanner;

public class ej_3 {
    public static void main(String[] args) {
        System.out.println("Ingrese un valor, este se muestra con incrementos de uno en uno");
        Scanner valor = new Scanner(System.in);
        int numero = valor.nextInt();
        int cont1 = 1;
        int aux = 0;

        while (cont1 <= numero) {
            aux = cont1;
            for (int i = 1; i <= aux; i++) {
                System.out.print(i+" ");
            }
            System.out.println("");
            cont1 += 1;
        }
    }
}
