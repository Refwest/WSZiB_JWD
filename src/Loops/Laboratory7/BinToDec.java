package Loops.Laboratory7;

/*F     Napisz program, który:
        konwertuje binarną liczbę całkowitą na postać dziesiętną,
        dane wejściowe są wprowadzane jako ciąg znaków,
        wynik powinien być zmienną typu long,
        nie korzystaj z gotowych rozwiązań.
        Przykłady:
        binary	decimal
        0	0
        11	3
        1010101010101011	43691
        1110000110000101100101000000	236476736*/

public class BinToDec {
    public static void main(String[] args) {
        String binary = "1110000110000101100101000000";
        Long result = 0L;

        for (int i = 0; i < binary.length(); i++) {
            int reversIndex = binary.length() - 1 - i;
            int argument = Character.getNumericValue(binary.charAt(reversIndex));
            result += argument * (int) Math.pow(2, i);
        }
        System.out.println("Binarnie " + binary + " to " + result + " dziesiętnie.");
    }
}
