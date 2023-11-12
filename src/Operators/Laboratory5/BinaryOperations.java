package Operators.Laboratory5;

public class BinaryOperations {
//    Napisz program, który potwierdzi, że poniższe działanie na liczbach binarnych jest poprawne.
//    11001 & 11101 ^ 00011 = 11010
    public static void main(String[] args) {
        int binNum1 = 0b11001;
        int binNum2 = 0b11101;
        int binNum3 = 0b00011;
        System.out.println(Integer.toBinaryString(binNum1));
        System.out.println(Integer.toBinaryString(binNum2));
        System.out.println("-------------------------------------- &");
        int result = binNum1 & binNum2;
        System.out.println(Integer.toBinaryString(result));
        System.out.println(String.format("%5s", Integer.toBinaryString(binNum3)).replace(' ','0'));
        System.out.println("-------------------------------------- ^");
        result = result ^ binNum3;
        System.out.println(Integer.toBinaryString(result));

        System.out.println("\n" + binNum1);
        System.out.println(binNum2);
        System.out.println("-------------------------------------- &");
        result = binNum1 & binNum2;
        System.out.println(result);
        System.out.printf("%2d %n",binNum3);
        System.out.println("-------------------------------------- ^");
        result = result ^ binNum3;
        System.out.println(result);
    }
}
