package CodeWars;

public class BasicOperations {
    //    Your task is to create a function that does four basic mathematical operations.
//
//The function should take three arguments - operation(string/char), value1(number), value2(number).
//The function should return result of numbers after applying the chosen operation.
//
//Examples(Operator, value1, value2) --> output
//('+', 4, 7) --> 11
//('-', 15, 18) --> -3
//('*', 5, 5) --> 25
//('/', 49, 7) --> 7
    public static void main(String[] args) {
        System.out.println(basicMath("/", 50, 10));
        System.out.println(basicMat("*", 100, 0));
    }

    public static Integer basicMath(String op, int v1, int v2) {
        if (op == "+") {
            return (v1 + v2);
        } else if (op == "-") {
            return (v1 - v2);
        } else if (op == "*") {
            return (v1 * v2);
        } else if (op == "/") {
            return (v1 / v2);
        } else
            return 0;
    }

    public static Integer basicMat(String op, int v1, int v2) {
        switch (op) {
            case "+":
                return (v1 + v2);
            case "-":
                return (v1 - v2);
            case "*":
                return (v1 * v2);
            case "/":
                if(v2 == 0){
                    throw new IllegalArgumentException("You can't divide by: " + v2);
                } else {
                    return (v1 / v2);
                }
            default:
                throw new IllegalArgumentException("Unknown symbol: " + op);

        }

    }
}

