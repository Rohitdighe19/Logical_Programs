import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {

        //integer N and a tolerance level L
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.print("Enter the tolerance level: ");
        double toleranceLevel = sc.nextDouble();

        sqrt(number, toleranceLevel);
    }
    private static void sqrt(double num, double lev) {
        double x = num;
        double root;
        int count = 0;
        while (true)
        {
            count++;
            // Calculate more closed x
            root = 0.5 * (x + (num / x));
            // Check for closeness
            if (Math.abs(root - x) < lev)
                break;
            // Update root
            x = root;
        }
        System.out.println("Output of the number using Newton's Method is: " +root);
    }
}