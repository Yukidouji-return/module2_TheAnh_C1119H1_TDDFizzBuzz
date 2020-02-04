
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int number = scanner.nextInt();
        FizzBuzzTranslate fizzBuzzTranslate = new FizzBuzzTranslate(number);
        fizzBuzzTranslate.displayFizzBuzz();
        fizzBuzzTranslate.Translate();
    }

}