package com.PulkitBajaj.Day47;

public class CommandLineComplex {
    public static void main(String[] args) {
            if(args.length==1){
                System.out.println("OK");
                System.out.println("Number of args "+ args.length);
            }
            else{
                System.out.print("Invalid args");
            }
        }
    }
