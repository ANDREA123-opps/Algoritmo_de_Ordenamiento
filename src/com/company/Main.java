package com.company;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        // write your code here
        int arr[] = new int[100000];
        int arr2[] = new int[arr.length];
        Random random = new Random();
        for (int j = 0; j < arr.length; j++) {
            arr[j] = random.nextInt();
        }
        System.arraycopy(arr,0,arr2,0,arr.length);
        System.out.println("Array Before Bubble Sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Long t0 = System.nanoTime();
        bubbleSort(arr);//sorting array elements using bubble sort
        Long t1 = System.nanoTime();
        System.out.println("Array After Bubble Sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("El tiempo de ejecucuión del bubble sort es: "+ (( t1 - t0 )/1e-6)+" milisegundos");
        System.out.println("////////////////////////////////////////////////////////////////////////////////////////");

        ////////////////////////////////////////////////////////////////////////////////
        System.out.println("Array Before Merge Sort");
        for(int i=0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        Long ti = System.nanoTime();
        mergeSort(arr2,arr2.length);//sorting array elements using merge sort
        Long tf = System.nanoTime();
        System.out.println("Array After Merge Sort");
        for(int i=0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        System.out.println("El tiempo de ejecucuión del bubble sort es: "+ (( tf - ti )/1e-6)+" milisegundos");
    }


    public static int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]< arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
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
            int[] a, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
