package com.costum;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) throws MyFirstException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        int number1 = scanner.nextInt();
        System.out.println("enter second number");
        int number2 = scanner.nextInt();
        MyMain myMain = new MyMain();
        try {
            System.out.println(myMain.add(number1,number2));
        } catch (MyFirstException e) {
            System.out.println(e);
            e.printStackTrace();
        }finally {
            scanner.close();
        }

    }
    public int add(int number1, int number2) throws MyFirstException {

        int sum = 0;
        sum = number1 + number2;
        if (sum <= 150) {
            throw new MyFirstException("Custom exception occurred");
        } else {
            return sum;
        }
    }
}