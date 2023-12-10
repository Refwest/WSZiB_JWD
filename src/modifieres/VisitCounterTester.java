package modifieres;

public class VisitCounterTester {
    public static void main(String[] args) {
        VisitCounter vc = new VisitCounter();
        vc.increment();
        vc.increment();
        vc.increment();
        vc.increment();
        vc.increment();
        vc.increment();
        vc.increment();
        vc.increment();

        System.out.println(vc);

//        vc.counter = 1000;
        System.out.println(vc.getCounter());
    }


}
