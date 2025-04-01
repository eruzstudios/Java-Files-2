import java.util.ArrayList;
import java.util.Scanner;

/**
 * Author: [Joseph Eruobaga
 * Date: [3/24/2025
 * Project: Programming Project 1 - Main Class
 * Description: This class handles the user input for player data, calculates the average age, 
 * and finds the tallest player whose age is less than or equal to the average age.
 */
public class Project1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Player> players = new ArrayList<>();
        int totalAge = 0;
        int playerCount = 0;

        // Repeatedly ask for player data until an empty string is entered
        while (true) {
            System.out.print("Enter player name (or press Enter to stop): ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.print("Enter height in feet: ");
            int feet = scanner.nextInt();

            System.out.print("Enter height in inches: ");
            int inches = scanner.nextInt();

            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            // Validate inputs
            if (feet < 0 || inches < 0 || age < 0) {
                System.out.println("Invalid input. Height and age must be non-negative.");
                continue; // Skip this iteration and ask for input again
            }

            // Create Height and Player objects
            Height height = new Height(feet, inches);
            Player player = new Player(name, height, age);
            players.add(player);
            totalAge += age;
            playerCount++;
        }

        // If no players were entered, print a message
        if (playerCount == 0) {
            System.out.println("No player data entered.");
            scanner.close();
            return;
        }

        // Calculate the average age
        double averageAge = totalAge / (double) playerCount;
        System.out.println("Average age of players: " + averageAge);

        // Find the tallest player whose age is <= average age
        Player tallestPlayer = null;
        for (Player player : players) {
            if (player.getAge() <= averageAge) {
                if (tallestPlayer == null || player.getHeight().toInches() > tallestPlayer.getHeight().toInches()) {
                    tallestPlayer = player;
                }
            }
        }

        if (tallestPlayer != null) {
            System.out.println("Tallest player with age <= average: " + tallestPlayer);
        } else {
            System.out.println("No player found with age <= average.");
        }

        // Close the scanner
        scanner.close();
    }
}