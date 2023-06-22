package Clase5;

import java.util.Scanner;

/*
5) Juego de adivinar el número:
Genera un número aleatorio entre 1 y 100. Pídele al usuario que adivine el número.
*/
public class Ejercicio5 {
    public static void main(String[] args){
        Integer numeroAleatorio= (int) (Math.random()*100+1);
        Scanner pedirDatos = new Scanner(System.in);
        System.out.println("Juguemos a la adivinanza. Ingresa un numero entre el 1 al 100");
        Integer numero=pedirDatos.nextInt();
        if(numero==numeroAleatorio){
            System.out.println("Acertaste, el numero a adivinar es: "+numeroAleatorio);
        }else{
            System.out.println("Lo siento, el numero era: "+numeroAleatorio);
        }

    }
}
