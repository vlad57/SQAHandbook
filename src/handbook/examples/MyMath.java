package handbook.examples;

public class MyMath {
    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static  int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public static int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public static int divide(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            throw new IllegalArgumentException("Can not divide by 0");
        }
        return firstNumber / secondNumber;
    }
}
