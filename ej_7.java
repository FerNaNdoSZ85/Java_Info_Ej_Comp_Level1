import java.util.Scanner;

public class ej_7 {
    public static void main(String[] args) {
        System.out.println("Ingrese un texto en minusculas y se muestra en mayusculas");
        Scanner cadena = new Scanner(System.in);
        String texto = cadena.nextLine();
        Character letra;

        for (int i = 0; i < texto.length(); i++) {
            letra = texto.charAt(i);    //letra contiene un caracter de la cadena
            int codigoASCII = letra; //con int paso de caracter minuscula,a codigo ascii
            int asciiMayus = codigoASCII - 32; // convierto de minus a mayus restando 32 en el ascii
            String mayuscula = Character.toString(asciiMayus); //convierto el codigo ascii en string
            System.out.print(mayuscula);
        }
    }
}