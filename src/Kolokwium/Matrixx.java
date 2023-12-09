package Kolokwium;

//Napisz program posiadający metodę o nazwie showMatrix() wyświetlającą na ekranie dowolną dwuwymiarową tablicę
// liczb całkowitych w postaci macierzy. Zaprezentuj działanie metody.
//
//Przykład:
//1   2   4
//3   2   5
//1   1   1
public class Matrixx {
    public static void main(String[] args) {
        int[][] matrixx = {{1, 2, 4}, {3, 2, 5}, {1, 1, 1}};
        showMatrix(matrixx);
    }
       public static void showMatrix(int[][] matrix) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.printf("%3d", matrix[i][j]);
                }
                System.out.println();
            }
        }

}
