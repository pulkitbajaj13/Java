package com.PulkitBajaj.Day45;

import java.util.Scanner;

public class SumOfDiagonal {
        public static void main(String[] args) {
            int i,j,sum=0;
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
                        sum+=arr[i][j];
                    }
                }
            }
            System.out.println("Sum = "+sum);
        }
    }
