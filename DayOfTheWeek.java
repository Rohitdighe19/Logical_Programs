public class DayOfTheWeek {
    static int M, D, Y;

    public static void main(String[] args) {
        DayOfTheWeek day = new DayOfTheWeek();

        M = Integer.parseInt(args[0]);
        D = Integer.parseInt(args[1]); // given command line argument
        Y = Integer.parseInt(args[2]);
        day.dayOfWeek();

    }

    public void dayOfWeek() {
        int y0 = Y - (14 - M) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = M + 12 * ((14 - M) / 12) - 2;
        int d0 = (D + x + 31 * m0 / 12) % 7;

        switch (d0) {
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
        }
    }
}
