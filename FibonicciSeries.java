import java.util.Scanner;

public class FibonicciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the count value to print the fibonacci series: ");
        int count = input.nextInt();

        fibonacciSeries(count);
    }
    private static void fibonacciSeries(int count) {
        int number1=0,number2=1,number3;
        //printing 0 and 1
        System.out.print(number1+" "+number2);
        //loop starts from 2 because 0 and 1 are already printed
        for(int i=2; i<count; i++)
        {
            number3=number1+number2;
            System.out.print(" "+number3);
            number1=number2;
            number2=number3;
        }
    }
}