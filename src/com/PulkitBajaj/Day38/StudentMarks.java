package com.PulkitBajaj.Day38;

import java.util.Scanner;
public class StudentMarks {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int a=sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            float avg = (a+b+c)/3f;
            if(avg>=90){
                System.out.println("A");
            }
            else if(avg<90 && avg>=80){
                System.out.println("B");
            }
            else {
                System.out.println("Fail");
            }
        }
    }
