package Classes.Laboratory9;

//Napisz program, który oblicza pierwiastek kwadratowy z liczby podanej jako argument programu. Uruchom program z wiersza poleceń.
//Przykład
//
//java SquareRootApp 16
//4.0
public class SquareRoot {
    public static void main(String[] args) {
        System.out.println("Enter your value: ");
        double sqrRoot = Math.sqrt(Integer.parseInt(args[0]));
        System.out.printf("Square root of: %s is equal to: %.2f %n", args[0], sqrRoot);
    }
}

//dir
// cd
/// cd..
//java SquareRoot.java 9
//javac SquareRoot.java

