import java.sql.SQLOutput;
import java.util.Scanner;

/*
1) Calculadora de edad de perros:
Pídele al usuario que ingrese la edad de su perro.
Convierte esa edad a años de perro (se dice que 1 año humano equivale a 7 años de perro).
*/
public class Ejercicio1 {
    public static void main(String[] args){
        Scanner pedirDatos = new Scanner(System.in);

        System.out.println("Ingresar la edad de su perro");
        Integer edadPerro=pedirDatos.nextInt();

        Integer edadAniosPerro=edadPerro*7;
        System.out.println("La edad de su perro es: "+edadAniosPerro);
    }
}
