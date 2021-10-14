import java.util.Scanner;

public class ej_4 {
    public static void main(String[] args){
        System.out.println("Ingrese un valor, y se calculara el factorial");
        Scanner valor = new Scanner(System.in);
        int factorial = valor.nextInt();
        if (factorial == 0){
            System.out.println("el factorial de cero es: 1");
        }
        else{
            int aux = factorial;
            int aux2 = factorial;
            while (aux !=1 ){
                factorial= factorial*(aux-1);
                aux --;
            }
            System.out.println("el factorial de " + aux2 + " es: "+factorial);
        }
        }
    }