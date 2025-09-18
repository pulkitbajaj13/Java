package com.PulkitBajaj.Day43;


import java.util.Scanner;

public class Cache {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cache Size: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] cache = new String[n+1];
        System.out.println("Enter the data: ");
        for(int i=0;i<n;i++){
            cache[i]=sc.nextLine();
        }
        System.out.println("Enter new ele: ");
        String newele = sc.nextLine();
        cache[n]=newele;
        for(int i=n;i>=1;i--){
            System.out.println(cache[i]);
        }
    }
}
