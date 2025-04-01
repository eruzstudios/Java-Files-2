/**
 * Author: [Joseph Eruobaga]
 * Date: [3/24/2025]
 * Project: Programming Project 1 - Player Class
 * Description: This class defines a Player object with a name, height (Height object), and age. 
 * It includes methods to get player details and display the player's information in a readable format.
 */
public class Player {
    private final String name;
    private final Height height;
    private final int age;

    // Constructor
    public Player(String name, Height height, int age) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        if (height == null) {
            throw new IllegalArgumentException("Height cannot be null.");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        this.name = name;
        this.height = height;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Height getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    // toString method to display the player details
    @Override
    public String toString() {
        return "Name: " + name + ", Height: " + height.toString() + ", Age: " + age;
    }
}
    

