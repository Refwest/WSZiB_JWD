package Homework;

//        Napisz program wyświetlający świąteczną choinkę składającą się z
//        losowych elementów następującego zbioru znaków ASCII: ‘+’, ‘.’, ‘*’,
//        ‘~’, ‘^’, ‘o’. Wysokość choinki powinna być podawana jako argument
//        programu. Jeżeli wysokość nie zostanie określona to powinna zostać
//        przyjęta domyślna wartość 18.

import java.util.Random;
import java.util.random.RandomGenerator;

public class ChristmasTree {
    public static void main(String[] args) {
        int height;
        char[] christmasBalls = {'+', '.', '*', '~', '^', 'o'};
        Random generator = new Random();
        if (args.length > 0) {
            height = Integer.parseInt(args[0]);
        } else {
            height = 18;
        }
        for (int i = 1; i <= height; i++) {
            for (int j = (height - i); j > 0; j--) {
                System.out.printf("%s", " ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.printf("%s", christmasBalls[generator.nextInt(christmasBalls.length)]);
            }
            System.out.println();
        }
    }
}
