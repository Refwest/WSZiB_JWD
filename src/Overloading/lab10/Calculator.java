package Overloading.lab10;
//F

/*Napisz program Calculator posiadający metody o nazwie add sumujące 2 lub 3 liczby typu int lub double.
Przykład

Calculator calc = new Calculator();
int res1 = calc.add(1, 2);
double res2 = calc.add(1.0, 2.4, 3.4);*/

public class Calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double result = calc.add(5.5, 126, 1111.2);
        int result2 = calc.add(2,2);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(calc.add(1,1,222));
        System.out.println(calc.add(1,12,222));
        System.out.println(calc.add(11,12,222));
    }

    public int add(int a, int b) {

        return (a + b);
    }

    public int add(int a, int b, int c) {
        return (a + b + c);
    }

    public double add(double a, double b) {
        return (a + b);
    }

    public double add(double a, double b, double c) {

        return (a + b + c);
    }
}
