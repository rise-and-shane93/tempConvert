import java.util.Scanner;

public class TemperatureConversion {
  public static void main( String [] args ) {
    int userChoice = 0;                           // User selection: 1, 2, 3
    float temperatureFahrenheit = 0;              // Fahrenheit temperature
    float temperatureCelsius = 0;                 // Celsius temperature
    Scanner input = new Scanner( System.in );     // Create a Scanner to obtain user input

    while( userChoice != 3 ) {
      System.out.print( "Enter 1 to convert F->C, 2 to convert C->F, 3 to quit: " );
      userChoice = input.nextInt();              // Read user input
      switch( userChoice ) {
        case 1:     // Convert Fahrenheit to Celsius
                    System.out.print( "Enter a Fahrenheit temperature: " );
                    temperatureFahrenheit = input.nextFloat();

                    // Call the tempConvert method passing the string "F" and the temperature in Farenheit as arguments
                    tempConvert("F", temperatureFahrenheit);
                    break;
        case 2:     // Convert Celsius to Fahrenheit
                    System.out.print( "Enter a Celsius temperature: " );
                    temperatureCelsius = input.nextFloat();

                    // Call the tempConvert method passing the string "C" and the temperature in Celsius as arguments
                    tempConvert("C", temperatureCelsius);
                    break;
        case 3:     // End Program
                    System.out.println( "Bye Bye" );
                    break;
        default:    // Invalid Data Entered
                    System.out.println( "Invalid Data: You must enter 1, 2, or 3" );           
      }
    }
  }

  /* tempConvert method that returns a float
  It accepts two parameters, a String and a float */
  public static void tempConvert(String type, float temp) {

    // initialize this variable to 0F. Will be reassigned to the converted temperature.
    float convertedTemp = 0F;

    /* Check if the first parameter is the string "F"
    and if it is true, convert to Farenheit using the temp parameter
    Otherwise, perform the Celsius to Farenheit calculation */
    if (type == "F") {
      // F to C
      convertedTemp = 5F/9F * (temp - 32F);
      System.out.println( temp + " degrees Fahrenheit is " + convertedTemp + " degrees Celsius" );
    } else {
      // C to F
      convertedTemp = 9F/5F * temp + 32F;
      System.out.println( temp + " degrees Celsius is " + convertedTemp + " degrees Fahrenheit" );
    }
  }
}