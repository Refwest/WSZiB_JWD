package modifieres;

public class Demo {
    static synchronized protected final void specialMethod(){
    }
    public static final int NUMBER = 5;

    final int num;

    public Demo(int num) {
        this.num = 60;
        num++;
    }

    public static void main(String[] args) {

        final int number;

        Demo d1 = new Demo(50);
        System.out.println(d1);

        System.out.println();

        System.out.println("Start");
        number = 1;
        System.out.println("Koniec");

    }

}
