package com.PulkitBajaj.Sorting;

import java.util.Scanner;

public class QuickSort {
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
            i++;
            int temp = arr[high];
            arr[high] = arr[i];
            arr[i] = temp;
            return i;
        }
        static void quickSort(int[] arr,int low,int high){
            if(low<high) {
                int pindex = partition(arr, low, high);
                quickSort(arr, low, pindex - 1);
                quickSort(arr, pindex + 1, high);
            }
        }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            quickSort(arr, 0, n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
