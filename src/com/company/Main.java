package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Random rand = new Random();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int mynum = rand.nextInt(100) + 1;
        System.out.println("PC-number is: " + mynum);

        String answer = "no";

        do {

            for (int i = 1; i < 11; i++) {

                int usernum = scan.nextInt();
                //  System.out.println("User has entered: "+usernum);

                if (mynum > usernum) {
                    System.out.println("PC-value is greater than user-value");

                } else if (mynum < usernum) {
                    System.out.println("PC-value is smaller than user-value");
                } else {
                    System.out.println("PC-value and user-value are equal. You have guessed!");
                    System.out.println("The number of chances used: " + i);
                    break;
                }
                if (i == 10) {
                    System.out.println("You have lost!");
                    System.out.println("Do you want to try one more time?");
                    answer = scan.next();
                }
            }
        }
        while (answer.equals("yes"));
        System.out.println("Thank you for participation!");
    }
}
