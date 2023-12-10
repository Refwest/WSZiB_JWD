package Comparing;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee a = new Employee("Kowalski", 22, 440);
        Employee b = new Employee("Kowalski", 22, 440);
        Employee c = new Employee("Kowalski", 22, 440);
        Employee d = new Employee("Kowalski", 22, 440);

        for (int i = 0; i < 1000000; i++) {
            if (!a.equals(b)) {
                System.out.println("Mamy cię!");
                System.exit(-1);
            }
        }
        System.out.println("Wszystko ok");


    }
}
