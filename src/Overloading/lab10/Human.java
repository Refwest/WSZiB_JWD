package Overloading.lab10;
//F

/*Stwórz klasy Human oraz Boy ustawiając je w odpowiedniej relacji.
Na przykładzie symbolicznej metody eat() zademonstruj działanie mechanizmu przesłaniania.*/
public class Human {
    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.eat();
        boy.hi();

        Human human = new Human();
        human.eat();
        human.hi();
    }

    public void eat() {
        System.out.println("Human eat food");
    }

    public void hi() {
        System.out.println("Human says hi");
    }
}
