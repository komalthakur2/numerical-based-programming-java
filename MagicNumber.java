import java.util.Scanner;
public class MagicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int originalNumber = scanner.nextInt();
        int number = originalNumber; 
        while (number >= 10) {
            int sum = 0;
            while (number > 0) {
                sum += number % 10; 
                number /= 10;
            }
            number = sum; 
        }
        if (number == 1) {
            System.out.println(originalNumber + " is a Magic Number.");
        } else {
            System.out.println(originalNumber + " is not a Magic Number.");
        }
        
        scanner.close();
    }
}
