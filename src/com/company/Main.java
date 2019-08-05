package com.company;

public class Main {
    public static void printIntMatrix(int ary[][]) {
        printHeader();
        for (int r = 0; r < ary.length; r++) {
            for (int c = 0; c < ary[r].length; c++) {
                if (c == 0) {
                    System.out.print(String.format("%10d", ary[r][c]));
                    System.out.print("   ");
                } else
                    System.out.print(String.format("%11d", ary[r][c]));
            }
            System.out.print('\n');

        }
    }

    public static int addRow(int ary[][], int row) {
        int total = 0;
        for (int i = 1; i < ary[row].length - 1; i++) {
            total += ary[row][i];
        }
        return total;
    }

    public static void fillRandom(int ary[][]) {
        for (int r = 0; r < ary.length; r++) {
            for (int c = 0; c < ary[r].length; c++) {
                if (c == 0) {
                    ary[r][c] = r + 1;
                } else if (c == 8) {
                    ary[r][c] = addRow(ary, r);
                } else
                    ary[r][c] = (int) (Math.random() * 10);
            }
        }
    }

    public static void printHeader() {
        String header = String.format("%10s %10s %10s %10s %10s %10s %10s %10s %10s", "Employee Number", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Total");
        System.out.println(header);
    }

    public static void main(String[] args) {
        String softwareStatement = "Store employees work hours in a X by X Matrix and compute the hours";
        System.out.println(softwareStatement);
        int[][] employees = new int[5][9];
        fillRandom(employees);
        printIntMatrix(employees);

    }
}
