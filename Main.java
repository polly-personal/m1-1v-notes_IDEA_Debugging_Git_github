import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("это калькулятор1. выбурите действие (+, -, *, /)");
        String action = scanner.nextLine();

        System.out.println("введите 1 число:");
        String firstArg = scanner.nextLine();

        System.out.println("введите второе число:");
        String secondArg = scanner.nextLine();

        Double result = calculator.calculate((Double.parseDouble(firstArg)), (Integer.parseInt(secondArg)), action);
        System.out.println(result);
    }
}
