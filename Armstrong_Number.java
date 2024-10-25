import java.util.Scanner;

public class Armstrong_Number {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;
        int temp = number;
        int numDigits = Integer.toString(number).length(); 
        while (temp > 0) {
            int digit = temp % 10; 
            sum += Math.pow(digit, numDigits); 
            temp /= 10; 
        }
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is not an Armstrong Number.");
        }
        
        scanner.close();
    }
}
