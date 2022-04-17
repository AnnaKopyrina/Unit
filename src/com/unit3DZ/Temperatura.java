package com.unit3DZ;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        int num;
        Scanner number = new Scanner(System.in);
        System.out.println("Задание определения температуры");
        System.out.println("Введите количество градусов: ");
        num = number.nextInt();
        if (num>-5)
             System.out.println("Тепло");
        else if (num>=-5 || num>-20)
            System.out.println("Нормально");
            else if (num<=-20)
            System.out.println("Холодно");
    }
}
