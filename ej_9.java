
import java.util.Scanner;

public class ej_9 {
    public static void main(String[] args) {
        char letra;
        char letra2;
        Scanner texto = new Scanner(System.in);
        System.out.println("dado un texto, determina la cantidad de veces que aparece un caracter ");
        
        String textoCualquiera = texto.nextLine();
        letra = texto.next().charAt(0);
        
        int contador = 0;
        
        for (int i = 0; i <= textoCualquiera.length() - 1; i++) {
            letra2 = textoCualquiera.charAt(i);
            if (letra == letra2) {
                contador++;
            }
        }
        System.out.print(contador);
    }
}