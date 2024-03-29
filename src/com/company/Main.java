package com.company;
import java.util.Random;
public class Main {

    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);
        merge(a, l, r, mid, n - mid);
    }
    public static void merge(
            int[] a, int[] l, int[] r, int izq, int der) {
        int i = 0, j = 0, k = 0;
        while (i < izq && j < der) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < izq) {
            a[k++] = l[i++];
        }
        while (j < der) {
            a[k++] = r[j++];
        }
    }

    public static void heapSort(int[]arr, int a){
        int i;
        /*for (i = 0; i < arr.length; i++){

            System.out.print(" " + arr[i]);
        }*/
        for (i = arr.length; i > 1; i--) {

            fnSortHeap(arr, i - 1);
        }
        /*for (i = 0; i < arr.length; i++){
            System.out.print(" " + arr[i]);
        }*/
    }

    public static void fnSortHeap(int array[], int arr_ubound) {

        int i, o;
        int lChild, rChild, mChild, root, temp;

        root = (arr_ubound - 1) / 2;

        for (o = root; o >= 0; o--) {
            for (i = root; i >= 0; i--) {
                lChild = (2 * i) + 1;
                rChild = (2 * i) + 2;

                if ((lChild <= arr_ubound) && (rChild <= arr_ubound)) {
                    if (array[rChild] >= array[lChild])
                        mChild = rChild;
                    else
                        mChild = lChild;
                } else {
                    if (rChild > arr_ubound)
                        mChild = lChild;
                    else
                        mChild = rChild;
                }

                if (array[i] < array[mChild]) {
                    temp = array[i];
                    array[i] = array[mChild];
                    array[mChild] = temp;
                }
            }
        }

        temp = array[0];
        array[0] = array[arr_ubound];
        array[arr_ubound] = temp;
        return;
    }

    public static void main(String[] args) {

        //Tamaño del arreglo
        int arreglo2[] = new int[50000];
        int arr[] = new int[arreglo2.length];

        Random random = new Random();
        for (int j = 0; j < arreglo2.length; j++) {
            arreglo2[j] = random.nextInt();
        }
        for (int j = 0; j < arr.length; j++) {
            arr[j] = random.nextInt();
        }
        ///Metodo HeapSort///
        System.out.println();
        Long inicio = System.nanoTime();
        heapSort(arr,arr.length);
        Long fin = System.nanoTime();
        System.out.println();
        System.out.println("Arreglo HeapSort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("El tiempo de ejecucuión del HeapSort es: "+ (( fin - inicio )/0.000001)+" milisegundos");
        ///Metodo MergeSort///
        System.out.println();
        Long Inicio = System.nanoTime();
        mergeSort(arreglo2,arreglo2.length);
        Long Fin = System.nanoTime();
        System.out.println("Arreglo MergeSort");
        for(int i=0; i < arreglo2.length; i++){
            System.out.print(arreglo2[i] + " ");
        }
        System.out.println();
        System.out.println("El tiempo de ejecucuión del MergeSort es: "+ (( Fin - Inicio )/0.000001)+" milisegundos");

    }
    }


