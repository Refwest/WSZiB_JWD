package Overloading;

/*Napisz program Calculator posiadający metody o nazwie add sumujące 2 lub 3 liczby typu int lub double.
        Przykład

        Calculator calc = new Calculator();
        int res1 = calc.add(1, 2);
        double res2 = calc.add(1.0, 2.4, 3.4);*/
public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = calculator.calc(5, 5, 5);
        int b = calculator.calc(5, 5);
        double c = calculator.calc(5.4, 5.3, 5.3);
        double d = calculator.calc(5.1, .9);
        System.out.println("5 + 5 + 5 = " + a);
        System.out.println("5 + 5 = " + b);
        System.out.println(c);
        System.out.println(d);
    }

    int calc(int a, int b) {
        return a + b;
    }

    int calc(int a, int b, int c) {
        return (a + b + c);
    }

    double calc(double a, double b) {
        return (a + b);
    }

    double calc(double a, double b, double c) {
        return this.calc(a, b) + c;
    }
}
