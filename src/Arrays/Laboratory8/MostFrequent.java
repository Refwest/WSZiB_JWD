package Arrays.Laboratory8;

//F Napisz program, który znajdzie najczęściej występującą cyfrę w tablicy.
//Przykłady:
//
//wejście	rezultat
//4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3	4 (5 razy)
public class MostFrequent {
    public static void main(String[] args) {
        int[] array = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3, 4, 1, 2, 4, 9, 3, 5};
        int[] digit = new int[10];
        int mostFrequent = 0;

        for (int i = 0; i < array.length; i++) {
            digit[array[i]]++;
        }

        for (int i = 0; i < digit.length; i++) {
            if (digit[i] > digit[mostFrequent]) {
                mostFrequent = i;
            }
        }
        System.out.println("Najczęściej powtarzającą się cyfrą jest: " + mostFrequent + ",");
        System.out.println("występuje: " + digit[mostFrequent] + " razy.");


//      Alternatywne
/*        int[] arra = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3, 4, 1, 2, 4, 9, 3, 5};
        int most = 0;
        int a = 0;
        int number = 0;


        for (int i = 0; i < arra.length; i++) {

            for (int j = i; j < arra.length; j++) {
                if (arra[i] == arra[j]) {
                    a++;
                }
            }
            if (most < a) {
                most = a;
                number = arra[i];
            }
            a = 0;
        }
        System.out.println("Najczęściej się powtarza: " + number + ", aż: " + most + " razy.");*/
    }
}
