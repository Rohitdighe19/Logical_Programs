import java.util.*;

public class CouponNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many digits you want in coupon : ");
        int number = input.nextInt();
        CouponNumbers(number);
    }

    private static void CouponNumbers(int number) {
        Set<Integer> couponNumber = new LinkedHashSet<Integer>();
        int range = 10;
        if (number != 0 && number <= 10)
            range = 10;
        else
            range *= number;
        while (couponNumber.size() < number) {
            couponNumber.add((int) Math.floor(Math.random() * range) + 1);
        }
        System.out.println("Coupon numbers are: " + couponNumber);
    }
}