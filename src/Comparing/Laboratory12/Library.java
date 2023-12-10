package Comparing.Laboratory12;



public class Library {

    public static void main(String[] args) {
        Object[] library = new Object[5];
        library[0] = new Book("Władca Pierścieni Drużyna Pierścienia", "JRR Tolkien", "Wieża", 2002);
        library[1] = new Book("Hobbit", "JRR Tolkien", "Wieża", 2000);
        library[2] = new Book("Władca Pierścienie Dwie Wieże", "JRR Tolkien", "Wieża", 2000);
        library[3] = new Book("Harry Potter", "JK Rolwing", "Kraków", 2000);
        library[4] = new Book("Władca Pierścieni Drużyna Pierścienia", "JRR Tolkien", "Wieża", 2002);

        System.out.println(library[0].toString());
        System.out.println(library[1].toString());
        System.out.println("Są takie same: " + library[0].equals(library[1]));

        equals(library[1], library[2]);
        equals(library[0], library[4]);
    }


    public static void equals(Object a, Object b) {
        System.out.println();
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println("Są takie same: " + ((a.equals(b))?"Tak":"Nie"));
    }

}
