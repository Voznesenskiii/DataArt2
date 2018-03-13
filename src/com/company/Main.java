package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner in = new Scanner(System.in);
        System.out.println("Enter some  number: ");
        int input = in.nextInt();
        System.out.println("Your input is: " + input);

        System.out.println("Enter some  number: ");
        int input2 = in.nextInt();
        System.out.println("Your input is: " + input2);


        int y = Sum(input,input2);
        System.out.println("The answer is = " + y);

    }


    public static int Sum(int a, int b){
        int c = a+b;
        return c;
    }

}
