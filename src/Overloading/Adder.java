package Overloading;

public class Adder {
    public static void main(String[] args) {
        System.out.println(sum(5, 5));
        System.out.println(sum(5, 5, 5));

    }
    static int sum(int a, int b){
        System.out.println("suma dwóch liczb całkowitych");
        return a + b;
    }
    static int sum(int a, int b, int c){
        System.out.println("suma trzech liczb całkowitych");
        return a + b + c;
    }
}
