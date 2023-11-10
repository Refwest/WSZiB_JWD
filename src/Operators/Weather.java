package Operators;

public class Weather {
    public static void main(String[] args) {
        float fah = 86;
        System.out.println(fah + " stopni Fahrenheita to:");
        fah -= 32;
        fah /= 9;
        fah *= 5;
        System.out.println(fah + " stopni Celsjusza\n ");

        float cel = 33;
        System.out.println(cel + " stopni Celsjusza to:");

        cel /= 5;
        cel *= 9;
        cel += 32;
        System.out.println(cel + " stopni Fahrenheita");

        int a = 20;
        int b = a-- + a++;
        System.out.println(b);
    }
}
