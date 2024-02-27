package edu.neu.mgen;
import java.util.Arrays;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // Initiate arrays x and y
        int[] x = {9, 8, 8, 18, 3};
        int[] y = {8, 1, 0, 12, 15};


        //Create another array z of length 5, the elements of which are the max
        // of the respective numbers of the two arrays x and y.
        int[] z = new int[5];
        for (int i = 0; i < 5; i++) {
            z[i] = Math.max(x[i], y[i]);
        }

        //Print the contents of the array
        String outputX = Arrays.toString(x).replace("[", "").replace("]", "");
        String outputY = Arrays.toString(y).replace("[", "").replace("]", "");
        String outputZ = Arrays.toString(z).replace("[", "").replace("]", "");

        // Print formatted output
        System.out.println("Array x = { " + outputX + " }");
        System.out.println("Array y = { " + outputY + " }");
        System.out.println("Array z = x + y = { " + outputZ + " }");

        // Part 2 - ArrayList of Names
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "David", "Emily"));
        ArrayList<String> switchedNames = new ArrayList<>();

        for (String name : names) {
            switchedNames.add(switchFirstAndLastLetter(name));
        }

        // Output for Part 2
        System.out.print("\nNames = { ");
        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i));
            if (i < names.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");

        System.out.print("Names (switched) = { ");
        for (int i = 0; i < switchedNames.size(); i++) {
            System.out.print(switchedNames.get(i));
            if (i < switchedNames.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
    }


    // Utility method to switch the first and last letter of a name
    private static String switchFirstAndLastLetter(String name) {
        char first = Character.toUpperCase(name.charAt(name.length() - 1));
        char last = Character.toLowerCase(name.charAt(0));
        return first + name.substring(1, name.length() - 1) + last;
    }


}
