package com.me;

import java.util.Scanner;


public class IsNumber {

    public static void isActualNumber(){

        Scanner sc = new Scanner(System.in);
        int inputNumber;

        do {
            System.out.println("Please type in the number that you would to see how many palindromes " +
                    "exist up to, then press enter;");

            while (!sc.hasNextInt()) {
                System.out.println("That is not a number you HILLBILLY, now try again;");
                sc.next(); // this is important!
            }
            inputNumber = sc.nextInt();
        } while (inputNumber <= 0);
        System.out.println("Thank you! Got " + inputNumber);
        System.out.println("Here are the palindromes that exist up to " + inputNumber + "....");

    }


}

