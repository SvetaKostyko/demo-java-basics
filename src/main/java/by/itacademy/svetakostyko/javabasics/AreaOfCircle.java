package by.itacademy.svetakostyko.javabasics;

import java.util.Scanner;

public class AreaOfCircle {
    public double countArea(double r) {
        double s = r * r * Math.PI;
        return s;
    }

    public static void main(String[] args) {
        AreaOfCircle area = new AreaOfCircle();
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        System.out.println(area.countArea(radius));
    }
}
