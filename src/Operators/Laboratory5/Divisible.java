package Operators.Laboratory5;

public class Divisible {
//    Napisz wyrażenie logiczne, które sprawdza, czy dana liczba całkowita może być podzielona (bez reszty) przez 7 i 5 jednocześnie.
    public static void main(String[] args) {
        int number = 35;
        boolean devide = (number % 5 == 0 && number % 7 == 0);
        System.out.println("Czy liczba " + number + " jest podzielna przez 5 i 7 bez reszty?\n" + devide);
    }
}
