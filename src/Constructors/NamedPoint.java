package Constructors;

import javax.naming.Name;
import java.awt.*;

public class NamedPoint extends Point {
    String name;

    public NamedPoint(int x, int y, String name) {
        super(x, y);
        this.name = name;
    }

    public static void main(String[] args) {
        NamedPoint namedPoint = new NamedPoint(5, 3, "SmallPoint");
        System.out.println(namedPoint.x);
        System.out.println(namedPoint.y);
        System.out.println(namedPoint.name  );
    }
}
