package Homework;

import java.math.BigInteger;

public class Matrix {
//F    Napisz program, który dla dowolnej liczby całkowitej n z przedziału (1
//    ≤ n ≤ 30) wypisuje macierz jak w poniższych przykładach. Użyj dwóch
//    zagnieżdżonych pętli.
//      n = 4	matrix
//      --------------
//        1  2  3  4
//        2  3  4  5
//        3  4  5  6
//        4  5  6  7

    public static void main(String[] args) {
        int n = 4;
        System.out.println("n = " + n + " matrix");
        System.out.println("--------------");
        for (int j = 0; j < n; j++) {
            for (int i = 1 + j; i <= n + j; i++) {
                System.out.printf("%3d", i);
            }
            System.out.println();
        }
    }
}
