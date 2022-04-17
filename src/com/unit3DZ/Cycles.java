package com.unit3DZ;

import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) {
        System.out.println("Задание вывода нечётных чисел от 1 до 99");
        nechet();
        System.out.println("\n\nЗадание вывода чисел от 5 до 1");
        chisla();
        System.out.println("\n\nЗадание вывода cуммы чисел");
        summachisel();
        System.out.println("\n\nЗадание вывода кратных 7 до 100");
        sem();
        System.out.println("\n\nЗадание вывода 10 первых чисел последовательности 0, -5,-10,-15..");
        otrizateln();
        System.out.println("\n\nЗадание выводящее на экран квадраты чисел от 10 до 20");
        kvadratotdecati();
        System.out.println("\n\nЗадание выводящее на экран первые 11 членов последовательности Фибоначчи");
        fibonacci();
        System.out.println("\n\nЗадание выводящее на экран таблицу умножения");
        tablicaumnoj();
        System.out.println("\n\nЗадание выводящее на экран расчёт вклада");
        vclad();
    }

    public static void nechet() {
        for (int nam = 1; nam <= 99; nam++) {
            for (; nam % 2 == 1; nam++) {
                System.out.print(" " + nam);
            }
        }
    }

    public static void chisla() {
        for (int nch = 5; (nch <= 5 && nch > 0); nch--) {
            System.out.print(" " + nch);
        }
    }

    public static void summachisel() {
        int sum;
        Scanner summa = new Scanner(System.in);
        System.out.println("Введите число: ");
        sum = summa.nextInt();
        int sumi = 0;
        if (sum > 0) {
            for (int i = 1; i <= sum; i++) {
                sumi = sumi + i;
            }
            System.out.println("Сумма равна: " + sumi);
         //   summa.close();
        } else {
            System.out.println("Необходимо вводить положительное число");
        }
    }

    public static void sem() {
        int dosta = 0;
        while (dosta < 98) {
            dosta = dosta + 7;

            System.out.print(" " + dosta);
        }
    }

    public static void otrizateln() {
        int zifra = 0;
        for (int kolvo = 0; kolvo < 10; kolvo++) {
            zifra = zifra - 5;
            System.out.print(" " + zifra);
        }
    }

    public static void kvadratotdecati() {
        int zifra1 = 10, kvadrat;
        for (int kolvo = 0; kolvo <= 10; kolvo++) {
            kvadrat = zifra1 * zifra1;
            zifra1++;
            System.out.print(" " + kvadrat);
        }
    }

    public static void fibonacci() {
        int chislo = 1, chislo1 = 1, chislo2;
        System.out.print(chislo + " ");
        for (int i = 0; i < 10; i++) {
            chislo2 = chislo + chislo1;
            System.out.print(chislo2 + " ");
            chislo = chislo1;
            chislo1 = chislo2;
        }
        System.out.println();

    }

    public static void tablicaumnoj() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }

    public static void vclad() {
        int sumvclada, kolvomesac, sumprozent=0, vcladitog ;
        Scanner sumvclada1 = new Scanner(System.in);
        Scanner kolvomesac1 = new Scanner(System.in);
        System.out.println("Введите сумму вклада: ");
        sumvclada = sumvclada1.nextInt();
        System.out.println("Введите количество месяцев: ");
        kolvomesac = kolvomesac1.nextInt();
        if (sumvclada > 0 && kolvomesac > 0) {
            for (int i = 0; i <= kolvomesac; i++) {
                sumprozent = ((sumvclada * 7) / 100) * kolvomesac;
            }
            vcladitog = sumvclada + sumprozent;
            System.out.println("Итоговая сумма вклада равна: " + vcladitog);

        } else {
            System.out.println("Данные не могут быть отрицательными");
        }
       // sumvclada1.close();
       // kolvomesac1.close();
        }
    }

