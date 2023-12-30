package Constructors.Lab11;
//F


// Zaprojektuj hierarchię klas tak, aby:
//
//klasa C dziedziczyła po klasie B, a klasa B dziedziczyła po klasie A

//instrukcja new C(); lub new B(); lub new A();
// wyświetliła kolejno informacje o wywoływaniu poszczególnych konstruktorów wszystkich klas

//instrukcja new C(true); lub new B(true); lub new A(true);
// utworzyła konkretny obiekt nie informując o wywołaniu konstruktorów

//instrukcja new C(false); lub new B(false); lub new A(false);
// utworzyła konkretny obiekt informując tylko o wywołaniu “pierwszego” konstruktora (konstruktory klas bazowych milczą)

public class ConstructTester {
    public static void main(String[] args) {
        new C(false);
    }
}

class A {

    public A() {
        System.out.println("Konstruktor A");
    }

    public A(boolean condition) {
        if (!condition) {
            System.out.println("Konstruktor A z boolean");
        }
    }
}

class B extends A {
    public B() {
        System.out.println("Konstruktor B");
    }

    public B(boolean condition) {
        super(true);
        if (condition != true) {
            System.out.println("Konstruktor B z boolean");
        }
    }
}

class C extends B {
    public C() {
        System.out.println("Konstruktor C");
    }

    public C(boolean condition) {
        super(true);
        if (!condition) {
            System.out.println("Konstruktor C z boolean");
        }
    }
}