package Arrays.Laboratory8;

//F     Zdefiniuj dowolną trójwymiarową tablicę elementów dowolnego typu i wyświetl jej zawartość w sposób przedstawiony poniżej.
//      arr[0][0][0] = 1
//arr[0][0][1] = 2
//arr[0][0][2] = 3
//arr[0][1][0] = 5
//arr[1][0][0] = 1
//arr[2][0][0] = 6
//arr[2][1][0] = 7
public class Array3d {
    public static void main(String[] args) {

        String[][][] array = new String[3][2][3];
        String[][] integ = {{"1", "2", "3"}, {"4", "5", "6"}};
        String[][] letters = {{"a", "b", "c"}, {"d", "e", "f"}};
        String[][] grLetters = {{"α", "β", "γ"}, {"δ", "ε", "ζ"}};
        array[0] = integ;
        array[1] = letters;
        array[2] = grLetters;
//        String[][][] arra = {{{"1", "2", "3"},{"4", "5", "6"}},{{"a", "b", "c"}, {"d", "e", "f"}},{{"α", "β", "γ"}, {"δ", "ε", "ζ"}}}; - alternatywny zapis

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.println("array[" + i + "]" + "[" + j + "]" + "[" + k + "] = " + array[i][j][k]);
                }
            }
        }

        System.out.println("_____________________");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.printf("%3s", array[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }
    }
}
