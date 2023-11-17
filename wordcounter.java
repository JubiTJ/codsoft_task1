import java.util.Scanner;

public class wordcounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence or a phrase:");
        String input = scanner.nextLine();

        int count = countwords(input);

        System.out.println("Number of words: " + count);

        scanner.close();
    }

    private static int countwords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        // Split the input based on one or more spaces
        String[] words = input.split("\\s+");

        return words.length;
    }
}
