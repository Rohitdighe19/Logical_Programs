import java.util.Scanner;

public class TemperatureConversion {

    static Scanner sc = new Scanner(System.in);
    static int fah, cel, f, c;

    // Main method.
    public static void main(String[] args) {
        System.out.println("Welcome to the temperature conversion program.");
        TemperatureConversion temperatureConversion = new TemperatureConversion();
        temperatureConversion.convertTemperature();
    }
    // User choice selection.
    public void convertTemperature() {

        int choice = 0;
        while (true) {
            System.out.println("----------------------------------------------");
            System.out.println("Press 1. Celsius to Fahrenheit.");
            System.out.println("Press 2. Fahrenheit to Celsius.");
            System.out.println("Press 3. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    celsiusToFahrenheit();
                    break;
                case 2:
                    fahrenheitToCelsius();
                    break;
            }
            if (choice == 3) {
                break;
            }
        }
    }
    // Function to convert Fahrenheit to celsius.
    public void fahrenheitToCelsius() {
        System.out.println("Enter a Fahrenheit value to convert into celsius :	");
        double fahrenheit = sc.nextInt();
        double celsius = ((fahrenheit - 32) * 0.55);
        System.out.println("Fahrenheit value converted to celsius is : " +celsius);
    }
    // Function to convert Celsius to Fahrenheit.
    public void celsiusToFahrenheit() {
        System.out.println("Enter a celsius value to convert into Fahrenheit :	");
        double celsius = sc.nextInt();
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("Celsius value to converted to fahrenheit : " +fahrenheit);
    }

}