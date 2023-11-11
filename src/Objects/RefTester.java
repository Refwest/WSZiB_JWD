package Objects;

import java.awt.*;

public class RefTester {
    public static void main(String[] args) {
        Point p1, p2;
        p1 = new Point(100, 100);
        p2 = p1;
        p1.x = 200;
        p2.y = 200;
        System.out.println("P1 x: " + p1.x + " and P1 y: " + p1.y);
        System.out.println("P2 x: " + p2.x + " and P2 y: " + p2.y);
    }
}
