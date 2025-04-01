/**
 * Author: [Joseph Eruobaga]
 * Date: [3/24/2025]
 * Project: Programming Project 1 - Height Class
 * Description: This class defines a Height object with feet and inches as instance variables. 
 * The height is immutable, and it includes methods to convert height to total inches and display the height in a readable format.
 */
public class Height {
    private final int feet;
    private final int inches;

    // Constructor that normalizes the inches
    public Height(int feet, int inches) {
        int totalInches = feet * 12 + inches;
        this.feet = totalInches / 12;
        this.inches = totalInches % 12;
    }

    // Method to return height in total inches
    public int toInches() {
        return feet * 12 + inches;
    }

    // Method to return height as a string with feet' inches"
    @Override
    public String toString() {
        return feet + "' " + inches + "\"";
    }
}

