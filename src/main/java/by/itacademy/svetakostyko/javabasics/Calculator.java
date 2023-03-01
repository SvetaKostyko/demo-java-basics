package by.itacademy.svetakostyko.javabasics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double c = scan.nextDouble();
        String b = scan.next();
        double result;
        switch (b) {
            case "*":
                result = a * c;
                System.out.println(result);
                break;
            case "/":
                if (c != 0) {
                    result = a / c;
                    System.out.println(result);
                    break;
                } else {
                    System.out.println("impossible to resolve");
                    break;
                }
            case "+":
                result = a + c;
                System.out.println(result);
                break;
            case "-":
                result = a - c;
                System.out.println(result);
                break;
        }
    }
}
