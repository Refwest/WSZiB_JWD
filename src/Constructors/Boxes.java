package Constructors;

import Overloading.Box;

import java.awt.*;

public class Boxes {
    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;

    public Boxes(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Boxes(Point topLeft, Point bottomRight) {
        this.x1 = topLeft.x;
        this.y1 = topLeft.y;
        this.x2 = bottomRight.x;
        this.y2 = bottomRight.x;
    }

    public Boxes(Point topLeft, int w, int h) {
        this.x1 = topLeft.x;
        this.y1 = topLeft.y;
        this.x2 = x1 + w;
        this.y2 = y1 + h;
    }

    void printBox() {
        System.out.print("Box: <" + x1 + ", " + y1);
        System.out.println(", " + this.x2 + ", " + this.y2 + ">");
    }
    public static void main(String[] args) {
        Box rect = new Box();

/*

        System.out.println("Tworzymy box (25,25) i (50,50)");
        rect.Boxes(25, 25, 50, 50);
        rect.printBox();

        System.out.println("\n \nTworzymy box z punktami (10,10) i (20,20)");
        Point topLeft = new Point(10, 10);
        Point bottomRight = new Point(20, 20);
        rect.Boxes(topLeft, bottomRight);
        rect.printBox();


        System.out.println("\n \nTworzymy box z punktem (7,9), szerokością 50 i wysokością 20");
        rect.Boxes(new Point(7, 9), 50, 20);
        rect.printBox();
    }
*/

    }}
