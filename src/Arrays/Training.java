package Arrays;

import java.awt.*;

public class Training {
    public static void main(String[] args) {


        int[] ar = new int[30];
        ar[24] = 150;
        System.out.println(ar[24]);
        System.out.println(ar[25]);

        for(int x : ar){
            System.out.println("ar = " + x);
        }

        Integer[] arra = new Integer[99];
        System.out.println(arra[23]);
        arra[26] = 18;
        System.out.println(arra[26]);
        Integer[] series = {10, 3, 5};
        for(int x : series){
            System.out.println("series = " + x);
        }




//        Points
        Point[] points = new Point[3];
        points[0] = new Point(2, 3);
        points[1] = new Point(45, 19);

        System.out.println(points[1].getLocation());
        double distance = points[1].distance(points[0]);
        System.out.println(distance);
        System.out.println(points[1].distance(points[0]));
    }
}
