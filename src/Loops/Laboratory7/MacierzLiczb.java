package Loops.Laboratory7;

public class MacierzLiczb {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            int j = 0;
            int result = 1 + i;
            while (j < n) {
                j++;
                System.out.print(result++ + " ");
            }
            System.out.println("");
        }
    }
}
