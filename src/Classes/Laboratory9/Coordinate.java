package Classes.Laboratory9;
//Utwórz klasę dla czterowymiarowego punktu o nazwie FourDPoint, wg wytycznych:
//klasa FourDPoint powinna dziedziczyć po klasie Point z pakietu java.awt
//napisz statyczną metodę create(int x, int y, int z, int t) tworzącą obiekt klasy FourDPoint
//napisz metodę show() wypisującą wszystkie współrzędne
//stwórz przykładowy 4-wymiarowy punkt i wyświetl jego współrzędne

import Loops.ForLoops;

import java.awt.*;

public class Coordinate {
    public static void main(String[] args) {
        System.out.println(FourDPoint.create(5, 7, 8, 9).getLocation());
        System.out.println(FourDPoint.create(5, 7, 8, 9).z);
        System.out.println(FourDPoint.show());
    }
}

class FourDPoint extends Point {
    int z;
    int t;

    public static FourDPoint create(int x, int y, int z, int t) {
        FourDPoint point4d = new FourDPoint();
        point4d.x = x;
        point4d.y = y;
        point4d.z = z;
        point4d.t = t;

        return point4d;
    }

    public static FourDPoint show(){
        return new FourDPoint(5, 5, 5, 5);
    }
}




