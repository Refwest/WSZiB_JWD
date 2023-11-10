package Variable.Laboratory3;

public class Square {
    //    Napisz program obliczający pole powierzchni, obwód oraz długość przekątnej dla kwadratów o następujących długościach boku: 2, 7, 11 oraz 19.
    public static void main(String[] args) {
        int square1 = 2;
        int square2 = 7;
        int square3 = 11;
        int square4 = 19;

        sqParameters(square1);
        sqParameters(square2);
        sqParameters(square3);
        sqParameters(square4);
    }

    public static void sqParameters(int a) {
        System.out.println("Kwadrat o boku: " + a + " ma: ");
        System.out.println("pole powierzchni równe: " + a * a);
        System.out.println("obwód równy: " + (4 * a));
        System.out.printf("przekątną o długości: %.2f%n", (a * Math.sqrt(a)));
        System.out.println("-----------------------------------------");
    }

}


