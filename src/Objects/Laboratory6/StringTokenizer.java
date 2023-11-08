package Objects.Laboratory6;

public class StringTokenizer {
    /*Utwórz program, który zmienia datę urodzin w formacie
    DD/MM/RRRR (na przykład 29/04/2016) na trzy oddzielne teksty.*/

    public static void main(String[] args) {
        String birthday = "29/04/2016";
        java.util.StringTokenizer str1 = new java.util.StringTokenizer(birthday,"/");
        int a = str1.countTokens();        //z jakiegoś powodu str1.countTokens podstawiony do pentli for nie działa poprawnie
        for (int i = 0; i < a; i++) {
            System.out.println(i);
            System.out.println(str1.nextToken());
        }

    }
}
