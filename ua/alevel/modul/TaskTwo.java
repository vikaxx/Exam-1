package ua.alevel.modul;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        System.out.println("Current horse position.");
        int[] currentPosition = position();
        System.out.println("Desired horse position.");
        int[] desiredPosition = position();

        boolean isAllowed = canMove(currentPosition, desiredPosition);

        if(isAllowed)
        System.out.println("You can move horse.");
        else
            System.out.println("You can not move horse.");
    }

    public static boolean canMove(int[] currentPosition, int[] desiredPosition){
        int vertical = currentPosition[0] - desiredPosition[0];
        int horizontal = currentPosition[1] - desiredPosition[1];

        switch (vertical) {
            case 1:
                switch (horizontal) {
                    case 2:
                        return true;
                    case -2:
                        return true;
                    default:
                        return false;
                }
            case 2:
                switch (horizontal) {
                    case 1:
                        return true;
                    case -1:
                        return true;
                    default:
                        return false;
                }
            case -1:
                switch (horizontal) {
                    case 2:
                        return true;
                    case -2:
                        return true;
                    default:
                        return false;
                }
            case -2:
                switch (horizontal) {
                    case 1:
                        return true;
                    case -1:
                        return true;
                    default:
                        return false;
                }
            default:
                return false;
        }
    }

    public static int[] position() {
        int num = 0, col = 0;

        Scanner in = new Scanner(System.in);
        char alpha;
        System.out.print("Input horse position (letter + number) : ");
        alpha = in.next().charAt(0);

        while (!in.hasNextInt()) {
            System.out.println("Number should be from 1 to 8.");
            in.next();
        }
        num = in.nextInt() - 1;
        switch (alpha) {
            case 'a':
                col = 0;
                break;
            case 'b':
                col = 1;
                break;
            case 'c':
                col = 2;
                break;
            case 'd':
                col = 3;
                break;
            case 'e':
                col = 4;
                break;
            case 'f':
                col = 5;
                break;
            case 'g':
                col = 6;
                break;
            case 'h':
                col = 7;
                break;
            default:
                System.out.println("Letter should be from a to h.");

        }
        if (num > 7 || num < 0) {
            System.out.println("Number should be from 1 to 8.");

        }

        int[] position = {num, col};
        return position;
    }
}
