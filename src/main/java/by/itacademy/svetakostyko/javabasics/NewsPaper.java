package by.itacademy.svetakostyko.javabasics;

import java.util.Scanner;

public class NewsPaper {

    public int countPages(int news) {
        int quantityOfPages = news / 10;
        if (news % 10 != 0) {
            quantityOfPages++;
        }
        return quantityOfPages;
    }

        public static void main(String[] args) {
        NewsPaper newsPaper = new NewsPaper();
        Scanner scanner = new Scanner(System.in);
        int news = scanner.nextInt();
        System.out.println(newsPaper.countPages(news));
    }
}
