package ua.alevel.modul;

import java.util.Arrays;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        System.out.println("Input quantity of elements: ");
        Scanner in = new Scanner(System.in);
        int massSize = in.nextInt();
        int[] mass = new int[massSize];

        for (int i = 0; i< mass.length; i++){
            mass[i] = (int) ( Math.random() * 7 );
        }

        boolean[] isUnique = new boolean[mass.length];

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                if (mass[i] == mass[j]) {
                    if (i == j) {
                        isUnique[i] = true; // индексы совпадают -> рассматривается один и тот же элемент
                    } else isUnique[i] = false; // индексы разные -> повторяющийся элемент
                    break; // нет смысла проверять дальше, уже известно что элемент повторяется
                } else isUnique[i] = true; // элементы массива разные
            }
        }

        int countUniqueElements = 0;
        for (int i = 0; i < mass.length; i++) {
            if (isUnique[i]) {
                countUniqueElements++;
            }
        }

        System.out.println("Array " + Arrays.toString(mass) + " contains " + countUniqueElements + " unique elements.");
    }
}
