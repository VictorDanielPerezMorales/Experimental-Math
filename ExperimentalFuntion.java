import java.util.Scanner;

public class ExperimentalFuntion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the value of X to begin:");
        double X = input.nextDouble();

        double resultado = calculateExpression(X);

        System.out.println("Function's result is: " + resultado);

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
}