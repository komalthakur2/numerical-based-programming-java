import java.util.Scanner;
public class Disarium_Number {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0, temp = number;
        int numDigits = Integer.toString(number).length(); 
        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 0; i < numDigits; i++) {
                power *= digit;
            }

            sum += power;
            numDigits--; 
            temp /= 10;
        }

        if (sum == number) {
            System.out.println(number + " is a Disarium number.");
        } else {
            System.out.println(number + " is not a Disarium number.");
        }
        
        scanner.close();
    }
}
