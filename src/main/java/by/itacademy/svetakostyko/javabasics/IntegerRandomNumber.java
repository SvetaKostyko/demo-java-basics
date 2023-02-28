package by.itacademy.svetakostyko.javabasics;

public class IntegerRandomNumber {
    public int setRandomNumber() {
        int randomNumber = (int) (Math.random() * 100);
        return randomNumber;
    }

    public static void main(String[] args) {
        IntegerRandomNumber number = new IntegerRandomNumber();
        System.out.println(number.setRandomNumber());
    }
}
