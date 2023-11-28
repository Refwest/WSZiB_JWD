package Loops.Training;

import java.math.BigInteger;

public class BigInt {
    public static void main(String[] args) {
        BigInteger factorial = BigInteger.ONE;
//        System.out.println(factorial)

        int silnia = 5;
        for (int i = 1; i <= silnia; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
            System.out.println(factorial);
        }
        System.out.println(factorial);
    }
}
