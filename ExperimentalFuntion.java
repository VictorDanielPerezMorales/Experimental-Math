import java.util.Scanner;

public class ExperimentalFuntion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the value of X to begin:");
        double X = input.nextDouble();

        double resultado = calculateExpression(X);
        double result = calculateFractionPower(X);

        System.out.println("Function's result is: " + resultado);
        System.out.println("The result of (" + X + "/4)^(1/2) is: " + result);
        input.close();
    }

    // Function to calculate the fourth root of the sixth power of a product of two
    // terms plus Euler's constant
    public static double calculateExpression(double X) {
        double euler = Math.E; // Euler's constant (approximately 2.71828)

        // Calculate the expression
        double result = Math.pow(Math.pow(X * X * 4, 6), 1.0 / 4) + euler;

        return result;
    }

    public static double calculateFractionPower(double x) {
        // Divide x by 4
        double fraction = x / 4.0;

        // Calculate the square root of the resulting fraction
        double result = Math.sqrt(fraction);

        return result;
    }
}