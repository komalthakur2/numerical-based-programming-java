import java.util.Scanner;
public class Tribonacci_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        if (n == 0) {
            System.out.println("Sequence: 0");
        } else if (n == 1) {
            System.out.println("Sequence: 0, 1");
        } else if (n == 2) {
            System.out.println("Sequence: 0, 1, 1");
        } else {
            System.out.print("Sequence: 0, 1, 1");
            int a = 0, b = 1, c = 1;
            int tribNum;
            for (int i = 3; i <= n; i++) {
                tribNum = a + b + c;
                System.out.print(", " + tribNum); 
                a = b;
                b = c;
                c = tribNum;
            }
            System.out.println();
        }

        scanner.close();
    }
}
