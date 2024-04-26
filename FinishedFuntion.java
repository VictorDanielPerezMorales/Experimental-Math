import java.util.Scanner;

public class FinishedFuntion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the value of x:");
        int xValue = input.nextInt();

        double secondNumerator = restFactorial(xValue);
        double firstNumerator = calculateExpression(xValue);
        double secondDenominator = logarithmBase10(xValue);
        double firstDenominator = raizCuadrada(xValue);

        // Corrected calculation of the result
        double result = Math.pow((firstNumerator / firstDenominator) * (secondNumerator / secondDenominator), 3);

        System.out.println("Function's result is " + result);
        input.close();
    }

    public static int restFactorial(int x) {
        // Calculate x's factorial
        int factorialX = 1;
        for (int i = 1; i <= x; i++) {
            factorialX *= i;
        }

        // Calculate factorial of 10
        int factorial10 = 1;
        for (int i = 1; i <= 10; i++) {
            factorial10 *= i;
        }

        // Return the difference
        return factorialX - factorial10;
    }

    public static double calculateExpression(int x) {
        double euler = Math.E; // Euler's constant (approximately 2.71828)

        // Calculate the expression (x^2 * 4)^6)^(1/4) + euler
        double intermediate = Math.pow(x * x * 4, 6);
        double result = Math.pow(intermediate, 1.0 / 4) + euler;

        return result;
    }

    public static double raizCuadrada(int x) {
        return Math.sqrt(x); // Square root of x
    }

    public static double logarithmBase10(int x) {
        return Math.log10(x); // Log base 10 of x
    }

}
