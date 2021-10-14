import java.util.Scanner;

public class ej_1 {
    public static void main(String[] args) {
        System.out.println("Hola. Ingrese el nombre de Usuario!!!");
        String usuario = ""; // Creo la variable nombre
        Scanner nombre = new Scanner(System.in); // pido usuario por pantalla
        usuario = nombre.nextLine(); // llamo al metodo sobre el objeto scanner
        System.out.println("HOLA " + usuario);
        
    }
}
