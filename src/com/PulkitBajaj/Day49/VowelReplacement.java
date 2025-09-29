package com.PulkitBajaj.Day49;

public class VowelReplacement {
    public static void main(String[] args) {
        String str= new String("Pulkit");
        String result="";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                result+='*';
            }
            else{
                result+=ch;
            }
        }
        System.out.print(result);
    }
}
