package Clase7;

import java.util.Arrays;
import java.util.Scanner;

/*1) Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.*/
/*2) Después de realizar el ejercicio anterior, agregar que muestre el número mayor y el número menor.*/
/*3) Ahora, hay que mostrar el promedio.
Para hacer esto se suman todos los números y se divide por 5,
ya que el usuario agregó 5 números.*/
public class Ejercicio1 {
    public static void main(String[] args){
        Scanner pedirDatos = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length ; i++) {
            System.out.println("Ingresa un número: ");
            numeros[i] = pedirDatos.nextInt();
        }
        System.out.println("Los numeros ingresados son:"+ Arrays.toString(numeros));

        int menor = numeros[0];
        int mayor = numeros[0];
        int suma = 0;
        for (int i=0; i<numeros.length; i++){
            if(numeros[i]<menor){
                menor = numeros[i];
            }
            if(numeros[i]>mayor){
                mayor = numeros[i];
            }
            suma = suma+numeros[i];
        }
        System.out.println("El número mayor es: "+mayor +", "+"El número menor es: "+menor);

        int promedio=suma/numeros.length;
        System.out.println("La sumatoria de los numeros ingresados es: " + suma);
        System.out.println("El promedio es: " + promedio);

    }
}
