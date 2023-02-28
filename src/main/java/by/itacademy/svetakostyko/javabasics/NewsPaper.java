package by.itacademy.svetakostyko.javabasics;

import java.util.Scanner;

public class NewsPaper {
    Scanner scanner = new Scanner(System.in);
    int news = scanner.nextInt();

    public int countPages() {
        int  quantityOfPages = news / 10;
        if (news % 10 != 0) {
            quantityOfPages++;
        }
        return quantityOfPages;
    }
}
