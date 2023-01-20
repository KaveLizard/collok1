import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        double num1;
        double num2;
        double answer;
        char sign;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        sign = scanner.next().charAt(0);
        switch(sign) {
            case '+': answer = num1 + num2;
                break;
            case '-': answer = num1 - num2;
                break;
            case '*': answer = num1 * num2;
                break;
            case '/': answer = num1 / num2;
                break;
            default:  System.out.printf("Error!");
                return;
        }
        System.out.print("\nAnswer: ");
        System.out.printf(answer + "\n");
    }
}