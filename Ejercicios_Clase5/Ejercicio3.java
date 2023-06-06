package Ejercicios_Clase5;

import java.util.Scanner;

/*
3) Calculadora de descuento:
Pídele al usuario que ingrese el precio original de un producto.
Pídele al usuario que ingrese el porcentaje de descuento.
Calcula el precio final después de aplicar el descuento utilizando la fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
Muestra el precio final al usuario.
*/
public class Ejercicio3 {
    public static void main(String[] args){
        Scanner pedirDatos = new Scanner(System.in);
        System.out.println("Ingresar precio original de su producto");
        Double precioOriginal=pedirDatos.nextDouble();
        System.out.println("Ingresar precio original de su producto");
        Double porcentajeDescuento=pedirDatos.nextDouble();
        Double precioFinal=precioOriginal-(precioOriginal*porcentajeDescuento/100);
        System.out.println("El precio final del producto es: "+ precioFinal);
    }
}
