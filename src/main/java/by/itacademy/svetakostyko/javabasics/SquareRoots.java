package by.itacademy.svetakostyko.javabasics;

import java.util.Scanner;

public class SquareRoots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double D;
        D = (double) b * b - 4 * a * c;
        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println(x1);
            System.out.println(x2);
        } else if (D == 0) {
            double x = -b / (2 * a);
            System.out.println(x);
        } else if (D < 0) {
            System.out.println("No roots");
        }
    }
}
