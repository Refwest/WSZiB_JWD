package CodeWars;

/*Write a function that takes in a string of one or more words, and returns the same string, but with all five or more letter words reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.

Examples:

spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
spinWords( "This is a test") => returns "This is a test"
spinWords( "This is another test" )=> returns "This is rehtona test"*/
public class SpinWords {

    public static void main(String[] args) {
        String spinWords = "Hey fellow warriors";
        System.out.println(spinWords(spinWords));
    }

    public static String spinWords(String sentence) {
        String[] spinArray = sentence.split(" ");
        String result = "";
        for (int i = 0; i < spinArray.length; i++) {
            if (spinArray[i].length() > 4) {
                spinArray[i] = (new StringBuilder(spinArray[i]).reverse()).toString();
            }
            result += spinArray[i] + " ";
        }
        return (result = result.substring(0,result.length()-1));
    }

}
