import java.util.Scanner;
public class ExperimentalFuntion {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please, enter the value of x to begin");
        int xValue = input.nextInt();
        int result = restFactorial(xValue)
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
    
}
