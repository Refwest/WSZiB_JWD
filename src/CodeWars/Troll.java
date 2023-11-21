package CodeWars;

//Trolls are attacking your comment section!
//
//A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.
//
//Your task is to write a function that takes a string and return a new string with all vowels removed.
//
//For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
//
//Note: for this kata y isn't considered a vowel.
public class Troll {
    public static void main(String[] args) {
        System.out.println(disemvowel("This website is for losers LOL!"));
        System.out.println(alternative("This website is for losers LOL!"));
        System.out.println(alternative2("This website is for losers LOL!"));

    }

    public static String disemvowel(String str) {
        String[] array = str.split("");
        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    array[i] = "";
            }
        }
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
        }
        return result;
    }

    public static String alternative(String str) {
        return str.replaceAll("(?i)[aeiou]", "");
    }

    public static String alternative2(String str) {
        return str.replaceAll("[aeiou]", "");
    }
}

