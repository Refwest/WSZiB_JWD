package Objects.Laboratory6;

import java.util.StringTokenizer;

public class Birthday {
    /*Utwórz program, który zmienia datę urodzin w formacie
    DD/MM/RRRR (na przykład 29/04/2016) na trzy oddzielne teksty.*/

    public static void main(String[] args) {
        String birthday = "29/04/2016";
        StringTokenizer str1 = new StringTokenizer(birthday,"/");
        int a = str1.countTokens();        //z jakiegoś powodu str1.countTokens podstawiony do pentli for nie działa poprawnie
        for (int i = 0; i < a; i++) {

            System.out.println(str1.nextToken());
        }

        System.out.println("------------------------");
        
        //Alternatywne rozwiązanie

        System.out.println("Dzień: " + birthday.substring(0, 2));
        System.out.println("Miesiąc: " + birthday.substring(3,5));
        System.out.println("Rok: " + birthday.substring(6, 10));
    }
}
