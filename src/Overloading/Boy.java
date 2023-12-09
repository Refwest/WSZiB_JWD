package Overloading;

public class Boy extends Human {
    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.eat();

    }
    void eat(){
        System.out.println("Mężczyźni preferują posiłki z mięsem");
    }
}
