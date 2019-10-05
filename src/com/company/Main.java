package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
      //  ALGORITMO DE ORDENAMIENTO BURBUJA Y FUSION
        int arreglo[] = new int[5];
        int auxiliar = 0;

        Scanner in = new Scanner(System.in);

        //Introducir variables desde teclado

        for (int i = 0; i < arreglo.length; i++){
            System.out.println("Introduzca el valor de la posicion "+ i +" :");
            arreglo[i] = in.nextInt();
            System.out.println("");
        }
        //Aplicando el metodo de la burbuja
        for (int i = 0; i < arreglo.length - 1; i++){
            for (int j = i; j < arreglo.length; j++){
                if (arreglo[i] > arreglo[j]){
                    auxiliar = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = auxiliar;
                }
            }
        }

        //Mostrando los datos ordenados
        for (int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i] + " ");
        }
    }
}
