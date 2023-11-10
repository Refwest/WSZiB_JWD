package Operators.Laboratory5;

public class Investment {
//    Napisz program, który oblicza ile warta byłaby inwestycja na kwotę 14 000 zł,
//    gdyby jej wartość zwiększyła się w pierwszym roku o 40%, w drugim roku
//    zanotowała stratę w wysokości 1500 zł, a w trzecim roku zwiększyła się o 12%.

    public static void main(String[] args) {
        int invest = 14_000;
        System.out.printf("Wartość początkowa inwestycji to: %,d zł%n",  invest);
        invest *= 1.4F;
        System.out.printf("Wzrost wartości inwestycji w pierwszym roku do %,d zł%n ",  invest);
        invest -= 1_500;
        System.out.printf("Spadek wartości inwestycji w drugim roku do: %,d zł%n", invest);
        invest *= 1.12F;
        System.out.printf("Wzrost wartości inwestycji w trzecim roku do: %,.2f zł%n", (double) invest);
    }
}
