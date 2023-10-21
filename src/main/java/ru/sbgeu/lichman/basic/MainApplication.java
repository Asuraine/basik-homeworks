package ru.sbgeu.lichman.basic;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5");
        int numberUser = scanner.nextInt();
        if (numberUser == 1) {
            grettings();
        }
        if (numberUser == 2) {
            checkSign(2, 5, 5);
        }
        if (numberUser == 3) {
            selectColor();
        }
        if (numberUser == 4) {
            compareNumbers();
        }
        if (numberUser == 5) {
            addOrSubtractAndPrint(88, 53, true);
        }

    }


    public static void grettings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    public static void selectColor() {
        int data = 5;
        if (data <= 10) {
            System.out.println("Красный");
        }
        if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        }
        if (data > 20) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 6;
        int b = 5;
        if (a >= b) {
            System.out.println("a >= b");
        } else
            System.out.println("a < b");
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {

        if (increment = initValue > delta) {
            System.out.println("Сумма:" + (initValue + delta));
        } else
            System.out.println("Вычетание:" + (initValue - delta));
    }
}
