package Loops;

public class Demo {
    public static void main(String[] args) { /* //początek bloku
        int x = 5;
        {
            int y = 10;
            y += x;
            System.out.println(y);
        }
        System.out.println(x);
    */

/*
        int a = 0;
        if(a > 0){
            System.out.println("A jest większe od zera");
        } else if (a < 0) {
            System.out.println(("A jest mniejsze od zera"));
        } else {
            System.out.println(("A jest równe zero"));
        }
    } //koniec bloku

 */

//2
        /*int myScore = 34;
        int yourScore = 44;
        int ourBestScore = myScore > yourScore ? myScore : yourScore;
        System.out.println(ourBestScore);

        if (myScore > yourScore) {
            System.out.println("Najlepszy wynik: " + myScore);
        } else {
            System.out.println("Najlepszy wynik: " + yourScore);
        }*/

//        3

       /* for (int i = 1; i <= 100; i++) {
            System.out.println("i = " + i);
        }*/

//        4

/*

        int i = 0;
        while(i <= 100){
            System.out.println("i = " + i);
            i++;
        }


        do {
            System.out.println("i = " + i);
            i++;
        } while(i <= 100);
*/


//        5
//        Wypisz cyfry parzyste

        for (int i = 0; i < 10; i++) {
            if ( i % 2 != 0){
                continue;
            }
            System.out.print(i);
            System.out.print(" ");
        }

        out: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 50; j++) {
                System.out.println(i+j);
                break out;
            }

        }

    }
}
