import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ej_8 {
    
    public static void main(String[] args) {
        List<String> Persona = new ArrayList<>();
        Scanner dato = new Scanner(System.in);
        System.out.print("Nombre y Apellido: ");
        String nya = dato.nextLine();
        Persona.add(nya);
        System.out.print("Edad: ");
        String edad = dato.nextLine();
        Persona.add(edad);
        System.out.print("Dirección: ");
        String dire = dato.nextLine();
        Persona.add(dire);
        System.out.print("Ciudad: ");
        String Ciudad = dato.nextLine();
        Persona.add(Ciudad);
        
        for (int i = 3; i >= 0; i--){
            System.out.print(Persona.get(i)+" - ");
    }
    }
}
