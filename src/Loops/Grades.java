package Loops;

public class Grades {
    public static void main(String[] args) {


        //instrukcja warunkowa switch
        //char and Character
        //byte and Byte
        //short and Short
        //int and Integer
        //String
        //enum
        char grades = 'A';
        switch (grades) {
            case 'A':
                System.out.println("Wspaniale");
                break;
            case 'B':
                System.out.println("Dobrze");
                break;
            case 'C':
                System.out.println("Mogło być lepiej!");
                break;
            default:
                System.out.println("Rozważ oszukiwanie");
        }

    }
}
