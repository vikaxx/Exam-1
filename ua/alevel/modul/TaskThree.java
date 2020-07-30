package ua.alevel.modul;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] coordinates = new int[3][2];

        System.out.println("input coordinates: ");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 2; j++)
                coordinates[i][j] = in.nextInt();

        double[] sides = new double[3];

        for (int i = 0; i < 3; i++) {
            if (i < 2)
                sides[i] = Math.sqrt((Math.pow(coordinates[i][0] - coordinates[i + 1][0], 2.0)) + (Math.pow(coordinates[i][1] - coordinates[i + 1][1], 2.0)));
            else
                sides[i] = Math.sqrt((Math.pow(coordinates[i][0] - coordinates[0][0], 2.0)) + (Math.pow(coordinates[i][1] - coordinates[0][1], 2.0)));
        }

        double halfPerimeter = p(sides);
        double answer = S(halfPerimeter, sides);
        System.out.println("The area of this triangle is: " + answer);

    }

    public static double p(double[] sides) {
        return (sides[0] + sides[1] + sides[2]) / 2;
    }

    public static double S(double p, double[] sides) {
        return Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));
    }
}
