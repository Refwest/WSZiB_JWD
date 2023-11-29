package Homework;

public class UserArray {
//F   Napisz program, który:
//    *stworzy tablicę liczb typu int o rozmiarze, który będziemy
//    podawać jako argument przy starcie programu,
//    wypełni tablicę kolejno liczbami od 1 do n, gdzie n to rozmiar tablicy,
//    wyświetli zawartość tablicy,
//    *dokona konwersji tablicy tak, aby elementy ułożyły się odwrotnie (ciąg malejący: n, n-1, n-2… 1),
//    wyświetli zawartyość przekonwertowanej tablicy,
//    *fragmenty programu odpowiadjące za konkretne zadania zostaną wyodrębnione jako oddzielne metody.

    public static void main(String[] args) {
        int[] array = new int[Integer.parseInt(args[0])];
        fillIn(array);
        System.out.println();
        revers(array);
    }

    public static void fillIn(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
            System.out.println((i) + " argument tablicy to: " + a[i]);
        }
        System.out.println("---------------------------");
    }

    public static void revers(int[] b) {
        int[] c = new int[b.length];
        for (int i = (b.length - 1); i >= 0; i--) {
            c[(b.length - (i + 1))] = b[(i)];
            System.out.println((b.length - (i + 1)) + " argument tablicy to: " + c[(b.length - (i + 1))]);
        }
        System.out.println("---------------------------");
    }

}
