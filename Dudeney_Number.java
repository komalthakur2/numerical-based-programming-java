import java.util.Scanner;

public class Dudeney_Number {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int sumOfDigits = 0;
        int temp = number;
        while (temp > 0) {
            sumOfDigits += temp % 10; 
            temp /= 10; 
        }
        int cubeOfSum = sumOfDigits * sumOfDigits * sumOfDigits;
        if (cubeOfSum == number) {
            System.out.println(number + " is a Dudeney Number.");
        } else {
            System.out.println(number + " is not a Dudeney Number.");
        }
        
        scanner.close();
    }
}
