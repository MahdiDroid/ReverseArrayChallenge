package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        int scope=0;
        System.out.println("Enter Array Limit");
        scope=scanner.nextInt();
        int [] numbers = new int[scope];

        for (int i = 0; i<scope;i++){
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i<numbers.length;i++){
            System.out.print(numbers[i]);
            System.out.print(",");
        }
        reverseArray(numbers);



    }
    public static void reverseArray(int[] numbs){
        int temp;
        for (int i = 0; i<numbs.length / 2;i++){
            temp = numbs[i];
            numbs[i] = numbs[(numbs.length -1)-i];
            numbs[(numbs.length -1)-i]=temp;
        }
        System.out.println();
        for (int i = 0; i<numbs.length;i++){

            System.out.print(numbs[i]);
            System.out.print(",");
        }
    }
}
