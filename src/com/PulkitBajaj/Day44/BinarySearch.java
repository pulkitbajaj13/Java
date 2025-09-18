package com.PulkitBajaj.Day44;

import java.util.Scanner;

public class BinarySearch {
    static int binarySearch(int[] arr,int left,int right,int target){
        if(left>right){
            return -1;
        }
        int mid=(left+right)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
            return binarySearch(arr,left,mid-1,target);
        }
        else{
            return binarySearch(arr,mid+1,right,target);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int target= sc.nextInt();
        int result=binarySearch(arr,0,n-1,target);
        if(result==-1){
            System.out.println("Not Found");
        }
        else{
            System.out.println(result);
        }
    }
}
