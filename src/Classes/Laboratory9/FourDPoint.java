package Classes.Laboratory9;
//Utwórz klasę dla czterowymiarowego punktu o nazwie FourDPoint, wg wytycznych:
//klasa FourDPoint powinna dziedziczyć po klasie Point z pakietu java.awt
//napisz statyczną metodę create(int x, int y, int z, int t) tworzącą obiekt klasy FourDPoint
//napisz metodę show() wypisującą wszystkie współrzędne
//stwórz przykładowy 4-wymiarowy punkt i wyświetl jego współrzędne

import Loops.ForLoops;

import java.awt.*;
class FourDPoint extends Point {
    static int x;
    static int y;
    static int z;
    static int t;

    public static void main(String[] args) {
        create(5, 7, 8, 9);
        show();
        FourDPoint.x = 7;
        System.out.println();
        show();
//        System.out.println(FourDPoint.x);

    }

    public static void create(int x, int y, int z, int t) {
        FourDPoint.x = x;
        FourDPoint.y = y;
        FourDPoint.z = z;
        FourDPoint.t = t;

    }

    public static void show() {
        System.out.print("FourDPoint[x:" + FourDPoint.x + ", ");
        System.out.print("y:" + FourDPoint.y + ", ");
        System.out.print("z:" + FourDPoint.z + ", ");
        System.out.print("t:" + FourDPoint.t + "]");
    }
}