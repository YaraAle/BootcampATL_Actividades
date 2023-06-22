package Clase5;

import java.util.Scanner;

/*
2) Conversor de millas a kilómetros:
Pídele al usuario que ingrese una distancia en millas.
Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
Muestra la distancia en kilómetros al usuario.
*/
public class Ejercicio2 {
    public static void main(String[] args){
        Scanner pedirDatos = new Scanner(System.in);
        System.out.println("Ingresar distancia en millas");
        Double distanciaMillas=pedirDatos.nextDouble();
        Double distanciaKilometros=distanciaMillas*1.60934;
        System.out.println("La distancia en kilometros es: "+distanciaKilometros);
    }
}
