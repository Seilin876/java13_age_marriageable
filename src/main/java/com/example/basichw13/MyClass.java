package com.example.basichw13;


import java.util.Scanner;

public class MyClass {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("male or female?");
        String s = scanner.next();
        while (s.matches("male")==false&&s.matches("female")==false){
            System.out.println("please enter again   male or female??");
            s = scanner.next();
        }
        if(s.matches("male")){
            System.out.println("age?");
            int age = scanner.nextInt();
            if(age<18){
                System.out.println("You can't get married.Don't do stupid thing.");
            }
            else {
                System.out.println("You can get married.God bless you.");
            }
        }
        if(s.matches("female")){
            System.out.println("age?");
            int age = scanner.nextInt();
            if(age<16){
                System.out.println("You can't get married.Just wait to it!");
            }
            else {
                System.out.println("You can get married.Hope you have a wonderful marriage");
            }

        }
    }
}