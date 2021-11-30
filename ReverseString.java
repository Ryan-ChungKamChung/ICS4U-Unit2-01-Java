/*
* This is a program reverses a string via recursion.
*
* @author  Ryan Chung
* @version 1.0
* @since   2021-10-26
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* This is the ReverseString program.
*/
final class ReverseString {

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private ReverseString() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The reverse() function.
    *
    * @param inputString is the user-inputted string.
    * @return the substring of the inputted string with the first character
    *       placed at the back of the string
    */
    public static String reverse(final String inputString) {

        final String returnValue;

        if (inputString.length() == 0) {
            returnValue = inputString;
        } else {
            returnValue = reverse(inputString.substring(1))
                + inputString.charAt(0);
        }

        return returnValue;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        final String inputString;
        final String reversedString;

        try {

            // User prompt
            System.out.print("Enter a string: ");

            // Gathers and parses input to a String
            inputString = new BufferedReader(
                    new InputStreamReader(System.in)
            ).readLine();

            reversedString = reverse(inputString);
            System.out.println(reversedString);
        } catch (IOException exception) {
            System.out.println("Please enter a string.");
        }
    }
}

