package Ejercicios_Clase5;

import java.util.Scanner;

/*
4) Calculadora de propinas:
Pídele al usuario que ingrese el total de la cuenta en un restaurante.
Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina / 100).
*/
public class Ejercicio4 {
    public static void main(String[] args){
        Scanner pedirDatos = new Scanner(System.in);
        System.out.println("Ingresar el total de la cuenta");
        Double totalCuenta=pedirDatos.nextDouble();
        System.out.println("Ingresar el porcentaje de propina que desea dejar");
        Double porcentajePropina=pedirDatos.nextDouble();
        Double propina=totalCuenta*(porcentajePropina/100);
        System.out.println("La propina es de: "+ propina);
    }
}
