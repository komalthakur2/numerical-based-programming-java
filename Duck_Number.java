import java.util.Scanner;
public class Duck_Number {
    public static void main(String[] args) {
        Scanner duck = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = duck.nextLine();
        if (number.charAt(0) == '0') {
            System.out.println(number + " is not a Duck Number.");
        } else {
            boolean isDuck = false;
            for (int i = 1; i < number.length(); i++) {
                if (number.charAt(i) == '0') {
                    isDuck = true;
                    break;
                }
            }
            if (isDuck) {
                System.out.println(number + " is a Duck Number.");
            } else {
                System.out.println(number + " is not a Duck Number.");
            }
        }
    }
}

