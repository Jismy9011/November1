package oops;

public class AverageNumber {
    public static double computeAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    public static void main(String[] args) {
        double number1 = 10.0;
        double number2 = 20.0;
        double number3 = 30.0;

        double average = computeAverage(number1, number2, number3);
        System.out.println("The average of " + number1 + ", " + number2 + ", and " + number3 + " is: " + average);
    }
}

