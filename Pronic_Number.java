import java.util.Scanner;
public class Pronic_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        boolean isPronic = false;
        
        for (int i = 0; i * (i + 1) <= number; i++) {
            if (i * (i + 1) == number) {
                isPronic = true; 
                break;
            }
        }
        if (isPronic) {
            System.out.println(number + " is a Pronic Number.");
        } else {
            System.out.println(number + " is not a Pronic Number.");
        }
        
        scanner.close();
    }
}
