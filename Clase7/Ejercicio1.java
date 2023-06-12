package Clase7;

import java.util.Arrays;
import java.util.Scanner;

/*Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.*/
public class Ejercicio1 {
    public static void main(String[] args){
        Scanner pedirDatos = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length ; i++) {
            System.out.println("Ingresa un número: ");
            numeros[i] = pedirDatos.nextInt();
        }
        System.out.println("Los numeros ingresados son:"+ Arrays.toString(numeros));
    }
}
