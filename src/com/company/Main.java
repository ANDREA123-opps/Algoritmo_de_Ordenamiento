package com.company;

import java.util.Random;
import java.util.Timer;

public class Main {

    public static int[] bubbleSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]< arr[j]){
                    int exa = arr[i];
                    arr[i] = arr[j];
                    arr[j] = exa;
                }
            }
        }
        return arr;
    }

    public  static int[] mergeSort(int[] arr){

        if(arr.length <= 1){
            return arr;
        }

        int means = arr.length /2;

        int[] lower = new int[means];
        int[] higher = new int[arr.length - means];
        for (int i = 0; i < means; i++) {
            lower[i] = arr[i];
        }

        for (int i = 0; i < higher.length ; i++) {
            higher[i] = arr[i + lower.length];
        }
        return  merge(mergeSort(lower), mergeSort(higher));
    }

    public static int[] merge(int[] a, int[] b){
        int[] retval = new int[a.length+ b.length];
        int i = 0; int j = 0; int k = 0;
        while (j < a.length && k < b.length ){
            if(a[j] < b[k]){
                retval[i++] = a[j++];
            }else{
                retval[i++] = b[k++];
            }
        }

        while (j < a.length){
            retval[i++] = a[j++];
        }

        while (k < b.length){
            retval[i++] = b[k++];
        }
        return retval;
    }

    public static void main(String[] args) {
      //  ALGORITMO DE ORDENAMIENTO BURBUJA Y FUSION
        int[] arreglo1 = new int[40000];
        int[] arreglo2 = new int[40000];

        for (int i = 0; i < arreglo1.length; i++){
            int exa = (int)(Math.random()*99)+1;
            arreglo1[i] = exa;
            arreglo2[i] = exa;
        }

        arreglo1 = mergeSort(arreglo1);
        arreglo2 = bubbleSort(arreglo1);

        Timer timer = new Timer();

        // Algoritmo de ordenamiento burbuja
        System.out.println("Tiempo de ejecucionn --- BUBBLE SORT---");
        for (int i = 0; i < arreglo2.length; i++){
            long Time = System.nanoTime();
            System.out.print(arreglo2[i]+", ");
            System.out.println(Time + " Nanosegudos");
        }

        // Algoritmo de ordenamiento por fusion
        System.out.println("Tiempo de ejecucion de --- MERGE SORT ---");
        for (int i = 0; i < arreglo1.length; i++) {
            long Time = System.nanoTime();
            System.out.print(arreglo1[i]+", ");
            System.out.println(Time + " Nanosegundos");

        }

    }

    }

