package com.unit3DZ;

import java.util.Scanner;

public class PoraGoda {
    public static void main(String[] args) {
        int num;
        Scanner number = new Scanner(System.in);
        System.out.println("Задание с оператором switch-case");
        System.out.println("Введите число поры года: ");
        num = number.nextInt();
        switch (num)
        {
            case 1:
            case 2:
            case 12:
                System.out.println("Пора года: Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Пора года: Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Пора года: Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Пора года: Осень");
                break;
            default:
                System.out.println("Ввели некорректное число");
        }

        System.out.println();
        System.out.println("Задание с оператором if-else-if");
        System.out.println("Введите число поры года: ");
        int num2;
        Scanner number2 = new Scanner(System.in);
        num2 = number2.nextInt();
        if ((num2)>=3 && (num2)<=5)
           System.out.println("Пора года: Весна");
            else if ((num2)>=6 && (num2)<=8)
                    System.out.println("Пора года: Лето");
             else if ((num2)>=9 && (num2)<=11)
                System.out.println("Пора года: Осень");
        else if ((num2)==1 || (num2)==2 || (num2)==12)
            System.out.println("Пора года: Зима");
                else System.out.println("Ввели некорректное число");

    }
}

