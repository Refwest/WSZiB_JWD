package CodeWars;

/*Greed is a dice game played with five six-sided dice. Your mission, should you choose to accept it, is to score a throw according to these rules.
You will always be given an array with five six-sided dice values.

 Three 1's => 1000 points
 Three 6's =>  600 points
 Three 5's =>  500 points
 Three 4's =>  400 points
 Three 3's =>  300 points
 Three 2's =>  200 points
 One   1   =>  100 points
 One   5   =>   50 point
A single die can only be counted once in each roll. For example, a given "5" can only count as part of a triplet (contributing to the 500 points) or
as a single 50 points, but not both in the same roll.

Example scoring

 Throw       Score
 ---------   ------------------
 5 1 3 4 1   250:  50 (for the 5) + 2 * 100 (for the 1s)
 1 1 1 3 1   1100: 1000 (for three 1s) + 100 (for the other 1)
 2 4 4 5 4   450:  400 (for three 4s) + 50 (for the 5)
In some languages, it is possible to mutate the input to the function. This is something that you should never do.
If you mutate the input, you will not be able to pass all the tests.

*/
public class Greed {
    public static void main(String[] args) {
        int[] test = {5, 1, 3, 4, 1};

        System.out.println(greedy(test));
    }

    public static int greedy(int[] dice) {
        int[] side = new int[7];
        int result = 0;
        for (int i = 0; i < dice.length; i++) {
            side[dice[i]]++;
        }

        for (int i = 0; i < side.length; i++) {
            switch (i) {
                case 1:
                    if (side[i] > 2) {result = 1000;
                        side[i] -= 3;
                        result += side[i] * 100;
                    } else {
                        result = side[i] * 100;
                    }
                    System.out.println(result);
                    break;
                case 2:
                    if (side[i] > 2) {
                        result += 200;
                    }
                    System.out.println(result);
                    break;
                case 3:
                    if (side[i] > 2) {
                        result += 300;
                    }
                    System.out.println(result);
                    break;
                case 4:
                    if (side[i] > 2) {
                        result += 400;
                    }
                    System.out.println(result);
                    break;
                case 5:
                    if (side[i] > 2) {
                        result += 500;
                        side[i] -= 3;
                        result += side[i] * 50;
                    } else {
                        result += side[i] * 50;
                    }
                    System.out.println(result);
                    break;
                case 6:
                    if (side[i] > 2) {
                        result += 600;
                    }
                    System.out.println(result);
                    break;
            }
        }
        return result;
    }
}
