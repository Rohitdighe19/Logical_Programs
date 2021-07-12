import java.lang.*;
import java.util.Scanner; //user input

public class DecimalToBinary {

    public static void main(String[] args) {
        System.out.println("Decimal to binary Converter!"); //Prints out a message

        System.out.print("Enter number here: "); //Prints out a message

        Scanner scan = new Scanner(System.in); //Reads user input
        int number = scan.nextInt(); // = some int

        int[] intArray = new int[10]; // Array to store integers
        int i = 0; //Initialize 0

        while (number > 0) { //While loop to figure out the binary code
            int y = number%2; //Finds the remainder
            number = number/2; //Divides to find the next number
            intArray[i] = y; //Store a remainder into an Array slot
            i++; //Increment the Array slot
        }

        System.out.print("Binary value: "); //Prints out the message
        for(int j = intArray.length-1; j >=0; j--) { //Loop to print numbers in reverse order
            System.out.print(intArray[j]);
        }
    }
}