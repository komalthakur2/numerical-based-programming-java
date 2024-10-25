import java.util.Scanner;

public class Tech_Number {
    public static void main(String[] args) {
        Scanner tech = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = tech.nextInt();
        String numStr = String.valueOf(number);
         if (numStr.length() % 2 != 0) {
            System.out.println(number + " is not a Tech Number.");
        } else {
            int firstPart = Integer.parseInt(numStr.substring(0, numStr.length() / 2));
            int secondPart = Integer.parseInt(numStr.substring(numStr.length() / 2));
            int sum = firstPart + secondPart;
           if ((sum * sum) == number) {
                System.out.println(number + " is a Tech Number.");
            } else {
                System.out.println(number + " is not a Tech Number.");
            }
        }
    }
}
