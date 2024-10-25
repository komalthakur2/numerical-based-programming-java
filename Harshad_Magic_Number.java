import java.util.Scanner;

public class Harshad_Magic_Number {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sumOfDigits = 0, originalNumber = number;
        while (number > 0) {
            sumOfDigits += number % 10; 
            number /= 10; 
        }
        if (originalNumber % sumOfDigits == 0) {
            int digitSum = originalNumber;
            while (digitSum >= 10) {
                int tempSum = 0;
                while (digitSum > 0) {
                    tempSum += digitSum % 10;
                    digitSum /= 10; 
                }
                digitSum = tempSum; 
            }
            if (digitSum == 1) {
                System.out.println(originalNumber + " is a Harshad Magic Number.");
            } else {
                System.out.println(originalNumber + " is a Harshad Number but not a Magic Number.");
            }
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }

        scanner.close();
    }
}
