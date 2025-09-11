package com.PulkitBajaj.Day38;

public class WhileAndDoWhile {
        public static void main(String[] args) {
            int i = 1;
            // while loop
            System.out.println("Using while loop:");
            while (i <= 10) {
                System.out.println(i);
                i++;
            }
            i = 1;
            // do while loop
            System.out.println("Using do while loop:");
            do {
                System.out.println(i);
                i++;
            } while (i <= 10);
        }
    }
