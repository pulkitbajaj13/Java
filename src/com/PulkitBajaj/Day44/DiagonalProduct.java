package com.PulkitBajaj.Day44;

import java.util.Arrays;
import java.util.Scanner;
public class DiagonalProduct {
    public static void main(String[] args) {
        int i,j,product=1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr= new int[n][n];
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==j){
                    product*=arr[i][j];
                }
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==j){
                    arr[i][j]=product;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
