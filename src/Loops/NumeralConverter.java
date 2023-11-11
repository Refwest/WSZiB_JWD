package Loops;

public class NumeralConverter {
    public static void main(String[] args) {
        System.out.println(convert("dwójka"));

    }

    public static int convert(String str) {
        switch (str) {
            case "jeden":
            case "jedynka":
                return 1;
            case "dwa":
            case "dwójka":
                return 2;
            case "trójka":
            case "trzy":
                return 3;
            default:
                return 0;
        }

    }

    public static int convert2(String str) {
        return switch (str) {
            case "jeden":
            case "jedynka":
                yield 1;
            case "dwa":
            case "dwójka":
                yield 2;
            case "trójka":
            case "trzy":
                yield 3;
            default:
                yield 0;
        };

    }
}
