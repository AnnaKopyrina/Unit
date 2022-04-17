package com.unit3DZ;

import java.util.Scanner;

public class Chetnoe {
    public static void main(String[] args) {
        int num;
        Scanner number = new Scanner(System.in);
        System.out.println("Задание вывода чётности");
        System.out.println("Введите число: ");
        num = number.nextInt();
        if (num % 2 == 1)
            System.out.println("Число нечётное");
        else System.out.println("Число чётное");
        number.close();
    }
}
