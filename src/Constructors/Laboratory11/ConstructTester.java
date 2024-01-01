package Constructors.Laboratory11;

/*klasa C dziedziczyła po klasie B, a klasa B dziedziczyła po klasie A
*instrukcja new C(); lub new B(); lub new A(); wyświetliła kolejno informacje o wywoływaniu poszczególnych konstruktorów wszystkich klas
*instrukcja new C(true); lub new B(true); lub new A(true); utworzyła konkretny obiekt nie informując o wywołaniu konstruktorów
*instrukcja new C(false); lub new B(false); lub new A(false); utworzyła konkretny obiekt informując tylko o wywołaniu “pierwszego”
konstruktora (konstruktory klas bazowych milczą)*/
/*
public class ConstructTester {
    public static void main(String[] args) {
        new C(false);
    }
}

class A {
    public A() {
        System.out.println("Działa konstruktor A()");
    }

    public A(boolean silent) {
        super();
    }

}

class B extends A {
    public B() {
        System.out.println("Działa konstruktor B()");
    }

    public B(boolean silent) {
            super(silent);
    }
}

    class C extends B {
        public C() {
            System.out.println("Działa konstruktor C()");
        }

        public C(boolean silent) {
            super(silent);
        }
    }
*/
public class ConstructTester {
    public static void main(String[] args) {
        new A(false);
    }
}

class A {
    public A() {
        System.out.println("Działa konstruktor A()");
    }

    public A(boolean silent) {
        super();
        if (!silent) {
            System.out.println("Działa konstruktor A(" + silent + ")");
        }
    }

}

class B extends A {
    public B() {
        System.out.println("Działa konstruktor B()");
    }

    public B(boolean silent) {
        super(true);
        if (!silent) {
            System.out.println("Działa konstruktor B(" + silent + ")");
        }
    }
}

class C extends B {
    public C() {
        System.out.println("Działa konstruktor C()");
    }

    public C(boolean silent) {
        super(true);
        if (!silent) {
            System.out.println("Działa konstruktor C(" + silent + ")");
        }
    }
}


