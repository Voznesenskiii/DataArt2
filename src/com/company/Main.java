package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner in = new Scanner(System.in);
        System.out.println("Enter some number: ");
        int input = in.nextInt();
        System.out.println("Your input is: " + input);


        int c = Sum(6,7);
        System.out.println(c);

    }


    public static int Sum (int a, int b){
        int c = a+b;

        return c;
    }

}
