package Comparing.lab12;

public class Library {

    public static void main(String[] args) {

        Book[] library = new Book[6];
        library[0] = new Book("Władca Pierścieni, Bractwo Pierścienia", "J.R.R. Tolkien", "Spółdzielnia Wydawnicza „Czytelnik”", 1954);
        library[1] = new Book("Hobbit, czyli tam i z powrotem", "J.R.R. Tolkien", "Spółdzielnia Wydawnicza „Czytelnik”", 1937);
        library[2] = new Book("Gringo wśród dzikich plemion", "Wojciech Cejrowski", "Bernardinum", 2003);
        library[3] = new Book("Pas Deltory. Puszcze Milczenia", "Emily Rodda", "Scholastic", 2000);
        library[4] = new Book("Pan Tadeusz", "Adam Mickiewicz", "Aleksander Jełowicki", 1928);
        library[5] = new Book("Hobbit, czyli tam i z powrotem", "J.R.R. Tolkien", "Spółdzielnia Wydawnicza „Czytelnik”", 1937);

        /*Object[] library = new Object[5];
        library[0] = new Book("asd", "asd", "asd", 2013);*/

        System.out.println(library[0].toString());
        System.out.println(library[0].equals(library[1]));
        System.out.println(library[1].equals(library[5]));
    }

}

