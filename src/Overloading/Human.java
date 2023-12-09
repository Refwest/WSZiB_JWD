package Overloading;
/*Stwórz klasy Human oraz Boy ustawiając je w odpowiedniej relacji.
Na przykładzie symbolicznej metody eat() zademonstruj działanie mechanizmu przesłaniania.*/
public class Human {
    public static void main(String[] args) {

       Human human  = new Human();
        human.eat();
        Boy boy = new Boy();
        boy.eat();

    }
    void eat(){
        System.out.println("Ludzie są wszystko żerni");
    }
}
