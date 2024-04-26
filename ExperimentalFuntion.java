import java.util.Scanner;

public class ExperimentalFuntion {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please, enter the value of x to begin");
        int xValue = input.nextInt();
        double secondNumerator = restFactorial(xValue);
        double firstNumerator = calculateExpresion(xValue);
        double secondDenominator = logarithmBase10(xValue);
        double firstDenominator = raizcuadrada(xValue);
        double result = ( firstNumerator / firstDenominator * secondNumerator / secondDenominator )^3;
        System.out.println("Funtion's result is"+ result);
        
public static int restFactorial(int x) {
    // Calculate the x's factorial
    int factorialX = 1;
    for (int i = 1; i <= x; i++) {
        factorialX *= i;
    }

    // Calculate the factorial of 10
    int factorial10 = 1;
    for (int i = 1; i <= 10; i++) {
        factorial10 *= i;
    }

    // Rest the factorials 
    return factorialX - factorial10;
}

    }

    // Function to calculate the fourth root of the sixth power of a product of two
    // terms plus Euler's constant
    public static double calculateExpression(double X) {
        double euler = Math.E; // Euler's constant (approximately 2.71828)

        // Calculate the expression


        double result = Math.pow(Math.pow(X * X * 4, 6), 1.0 / 4) + euler;

        return result;
}
    public static double raizCuarta(double x) {
       return Math.pow(x, 1.0 / 4.0);
}
    public static double logarithmBase10(double x) {
    return Math.log10(0.16);
}
}
