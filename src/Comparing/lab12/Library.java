package Comparing.lab12;

public class Library {

    public static void main(String[] args) {

        Book[] library = new Book[5];
        library[0] = new Book("Władca Pierścieni, Bractwo Pierścienia", "J.R.R. Tolkien", "Spółdzielnia Wydawnicza „Czytelnik”", 1954);
        library[1] = new Book("Hobbit, czyli tam i z powrotem", "J.R.R. Tolkien", "Spółdzielnia Wydawnicza „Czytelnik”", 1937);
        library[2] = new Book("Gringo wśród dzikich plemion", "Wojciech Cejrowski", "Bernardinum", 2003);
        library[3] = new Book("");
        library[4] = new Book();

        /*Object[] library = new Object[5];
        library[0] = new Book("asd", "asd", "asd", 2013);*/


    }

}

