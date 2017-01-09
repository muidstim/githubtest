package com.company;

public class Main {

    public static void main(String[] args) {


        System.out.println(encrypt13("abcdefghijklm"));
        System.out.println(encrypt13("nopqrstuvwxyz"));
        System.out.println(encrypt13("ABCDEFGHIJKLM"));

        System.out.println(encrypt13("NOPQRSTUVWXYZ"));
    }

    public static String encrypt13(String data){

        String encrypted = "";

        for(char c: data.toCharArray())
        {
            if ((c >= 'a' && c <= 'm') || (c >= 'A' && c <= 'M')) //a-m  or A-M
            {
                c+=13;
                encrypted += c;
            }
            else if ((c >= 'n' && c <= 'z') || (c >= 'N' && c <= 'Z')) //n-z or N-Z
            {
                c-=13;
                encrypted += c;
            }
            else
            {
                encrypted +=c;
            }
        }

        return encrypted;
    }


    public static String encrypt5(String data){


        String encrypted = "";

        for(char c: data.toCharArray()) {
            if (c >= '0' && c <= '4'){
                c+=5;
                encrypted +=c;
            }
            else if (c >= '5' && c <= '9'){
                c-=5;
                encrypted +=c;
            }
            else
            {
                encrypted +=c;
            }
        }


        return encrypted;
    }

    public static double squareRoot(double number){
        return Math.sqrt(number);
    }

    public static String encrypt13_5(String data){

    return null;


    }
}
