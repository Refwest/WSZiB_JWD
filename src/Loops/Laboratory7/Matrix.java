package Homework;

import java.math.BigInteger;

public class Matrix {
//    Napisz program, który dla dowolnej liczby całkowitej n z przedziału (1
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
        for (int j = 0; j < n; j++) {
            for (int i = 1 + j; i <= n + j; i++) {
                System.out.printf("%3d", i);
            }
            System.out.println();
        }

        BigInteger factorial = BigInteger.ONE;
//        System.out.println(factorial);

        int silnia = 5;
        int z = 1;
        for (int i = 1; i <= silnia; i++) {
             z *= i;
            System.out.println(z);
        }
        System.out.println(z);
    }
}
