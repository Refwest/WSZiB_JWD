package data_type;

public class CharacterType {
    public static void main(String[] args) {
        char c = 64;
        System.out.println(c);
        System.out.println((int) c);

        char d = 1;
        char e = 10;
        asciiInfo('a');
        asciiInfo('b');
        asciiInfo('A');
        asciiInfo('Ą');
        asciiInfo('!');
        asciiInfo('1');
        asciiInfo(d);
        asciiInfo(e);
    }

    public static void asciiInfo(char x) {
        System.out.println("Kod znaku '" + x + "' to: " + (int) x);
    }
}
