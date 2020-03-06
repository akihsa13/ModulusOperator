package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	testOddness();
	keepContained();
	lastDigit();





    }

    public static void testOddness() {
// testOddness
        //Number is odd:

        // we want to find if a number is even or odd
        Scanner keyboard;
        System.out.println("give me a positive number");

        keyboard = new Scanner (System.in);
       int number = keyboard.nextInt();


        System.out.println("Number is odd : "  + (number % 2!=0));

    }

    public static void keepContained() {


        Scanner keyboard;
        keyboard = new Scanner (System.in);
        System.out.println("Insert a positive number");
        int number= keyboard.nextInt();
        System.out.println(number+" contained is:"+((number% 8)+5));



    }

    public static void lastDigit() {


        Scanner keyboard;
        keyboard =  new Scanner  (System.in);
        System.out.println("insert a number that is 4 places long");
        int number = keyboard.nextInt();
        System.out.println("the last digit number is:"+(number%10));




    }





}
