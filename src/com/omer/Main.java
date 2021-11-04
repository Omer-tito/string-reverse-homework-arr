package com.omer;

import java.util.Scanner;

public class Main {

        static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("please enter a String tp rebuild and reverse:");
        String word = SCANNER.nextLine();
            char [] arr = new char[word.length()];
            int index = 0;
        for (int i = word.length()-1; i > -1 ; i--) {
            arr[index] = word.charAt(i);
            index++;
        }
        System.out.println(arr);

    }
}


