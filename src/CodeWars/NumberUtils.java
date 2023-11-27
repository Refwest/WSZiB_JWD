package CodeWars;
//  restrict ourselves to decimal (base 10).
//For example, take 153 (3 digits), which is narcissistic:
//    1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
//and 1652 (4 digits), which isn't:
//    1^4 + 6^4 + 5^4 + 2^4 = 1 + 1296 + 625 + 16 = 1938
//The Challenge:
//Your code must return true or false (not 'true' and 'false') depending upon whether the given number is a Narcissistic number in base 10.
//This may be True and False in your language, e.g. PHP.
//Error checking for text strings or other invalid inputs is not required, only valid positive non-zero integers will be passed into the function.
public class NumberUtils {
    public static void main(String[] args) {
        isNarcissistic(556);
    }
    public static boolean isNarcissistic(int number) {
        String text = Integer.toString(number);
        int result = 0;
        for (int i = 0; i < text.length(); i++) {
            result += Math.pow(Character.getNumericValue(text.charAt(i)), text.length());
        }
        return (result == number ? true : false);
    }
}
