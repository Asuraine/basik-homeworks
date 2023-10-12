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
            checkSign();
        }
        if (numberUser == 3) {
            selectColor();
        }
        if (numberUser == 4) {
            compareNumbers();
        }
        if (numberUser == 5) {
            addOrSubtractAndPrint();
        }

    }


    public static void grettings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public static void checkSign() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите переменную а");
        int a = scanner.nextInt();
        System.out.println("Введите переменную b");
        int b = scanner.nextInt();
        System.out.println("Введите переменную c");
        int c = scanner.nextInt();
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

    public static void addOrSubtractAndPrint() {
        int initValue = 8;
        int delta = 5;
        boolean increment;
        if (increment = initValue > delta) {
            System.out.println("Сумма:" + (initValue + delta));
        } else
            System.out.println("Вычетание:" + (initValue - delta));
    }
}
