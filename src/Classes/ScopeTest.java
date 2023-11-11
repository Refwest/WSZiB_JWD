package Classes;

public class ScopeTest {

        int test = 10;
        void printTest(){
            int test = 20; // zostało nadpisane przez 20, gdyby to wyłączyć wyświetlane byłoby 10
            System.out.println("Test: " + test);
        }
        public static void main(String[] args) {
            ScopeTest scopeTest = new ScopeTest();
            scopeTest.printTest();
        }
}
