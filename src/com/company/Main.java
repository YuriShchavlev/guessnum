package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Random rand = new Random();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int mynum = rand.nextInt(100) + 1;
        System.out.println("My number is: " + mynum);

        int usernum = scan.nextInt();
        //  System.out.println("User has entered: "+usernum);

        if (mynum > usernum) {
            System.out.println("PC-value is greater than user-value");
        } else if (mynum < usernum) {
            System.out.println("PC-value is smaller than user-value");
        } else {
            System.out.println("PC-value and user-value are equal");
        }


    }
}
