public class MonthlyPayment {
    static double P, Y, R;

    public static void main(String[] args) {

        MonthlyPayment monthlyPayment = new MonthlyPayment();

        P = Double.parseDouble(args[0]);
        Y = Double.parseDouble(args[1]);
        R = Double.parseDouble(args[2]);

        monthlyPayment.Util();
    }

    public void Util() {

        double n = 12 * Y;
        double r = R / (12 * 100);
        double payment = (P * r) / (1 - Math.pow((1 + r), (-n)));
        System.out.println("The monthly payment is: Rs. " + payment);
    }
}
