package Overloading.lab10;
/*Napisz program Calculator posiadający metody o nazwie add sumujące 2 lub 3 liczby typu int lub double.
Przykład

Calculator calc = new Calculator();
int res1 = calc.add(1, 2);
double res2 = calc.add(1.0, 2.4, 3.4);*/

public class Calculator {

    public static void main(String[] args) {
        add(5,126);
    }
    public static void add(int a, int b) {
        System.out.println("Suma liczb równa się: " + (a + b));
    }

    public static void add(int a, int b, int c) {
        System.out.println("Suma liczb równa się: " + (a + b + c));
    }
}
