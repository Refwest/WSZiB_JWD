package Loops.Laboratory7;

public class BinaryToDecimal {
    public static void main(String[] args) {
        String binary = "111001";
        Long result = 0L;

        for (int i = 0; i < binary.length(); i++) {
            int reversIndex = binary.length() - 1 - i;
            char c = binary.charAt(reversIndex);
            int bit = Character.getNumericValue(c);
            result += bit * (int)Math.pow(2,i);

        }
        System.out.println(binary);
        System.out.println(result);
    }
}
