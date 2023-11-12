package Objects;

import java.util.Locale;
//Edycja tekstu
public class Printf {
    public static void main(String[] args) {
        int x = 1500000;
        double y = 1500000.55;
        String z = "edycja tekstu";
        boolean a = false;

//Integer
        System.out.printf("%d", x); //dopiero po dodaniu %n przenosi do nowej liniii
        System.out.println("brak nowej linii w powyższym souf");
        System.out.printf("%,d zł%n", x); // , pomiędzy % i d powoduje podzielenie tysięcami liczby
        System.out.printf(Locale.CHINA, "%,d $%n", x); // Locale.CHINA lub new Locale("us") powoduje zmianę standardów językowych

//Decimal - double
        System.out.printf("%f%n", y);

        System.out.printf("%,f zł%n", y);
        System.out.printf("%,.3f zł%n", y); // .3 - trzy miejsca po przecinku; , - rozdziela tysiące w liczbach

//String
        System.out.printf("%s%n", z);
        System.out.printf("%S%n", z);
        System.out.printf("%.4s%n", z);

//Boolean
        System.out.printf("%B", false);
        System.out.printf("%n%b", a);
    }
}
