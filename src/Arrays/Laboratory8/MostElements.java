package Arrays.Laboratory8;

public class MostElements {
    public static void main(String[] args) {
/*
        int[] array = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};
        int most = 0;
        int a = 0;
        int number = 0;


        for (int i = 0; i < array.length; i++) {

            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j]) {
                    a++;
                }
            }
            if (most < a) {
                most = a;
                number = array[i] ;
            }
            a = 0;
        }

        System.out.println("Najczęściej się powtarza: " + number + ", aż: " + most + " razy.");*/

//    Alternatywne rozwiązanie:
        int[] array = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};
        int[] counters = new int[10];

        for (int i = 0; i < array.length; i++) {
            counters[array[i]]++;
        }

        int mostFrequent = 0;


        for (int i = 0; i < counters.length; i++){
            if(counters[i] > counters[mostFrequent]){
                mostFrequent = i;
            }
        }
        System.out.print("Najczęściej występującą cyfrą w tablicy jest cyfra: " + mostFrequent);
        System.out.print(", wystąpiła " + counters[mostFrequent]);


    }
}
