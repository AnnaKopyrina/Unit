package com.unit3DZ;

import java.util.Scanner;

public class Raduga {

    public static void main(String[] args) {
        int num;
        Scanner number = new Scanner(System.in);
        System.out.println("Задание с цветом радуги");
        System.out.println("Введите номер цвета радуги: ");
        num = number.nextInt();
        switch (num) {
            case 1:
                System.out.println(+num+" цвет радуги: Красный");
                break;
            case 2:
                System.out.println(+num+" цвет радуги: Оранжевый");
                break;
            case 3:
                System.out.println(+num+" цвет радуги: Желтый");
                break;
            case 4:
                System.out.println(+num+" цвет радуги: Зеленый");
                break;
            case 5:
                System.out.println(+num+" цвет радуги: Голубой");
                break;
            case 6:
                System.out.println(+num+" цвет радуги: Синий");
                break;
            case 7:
                System.out.println(+num+" цвет радуги: Фиолетовый");
                break;
            default:
                System.out.println("Введите число от 1 до 7, ведь цветов радуги равно 7.");
        }
    }
}
