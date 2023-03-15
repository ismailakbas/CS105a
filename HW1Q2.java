import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine().toLowerCase(); // convert to lowercase for easier comparison

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < inputString.length(); i++) {
            String currentChar = inputString.substring(i, i + 1); // get the current character as a substring

            if (currentChar.matches("[a-z]")) { // check if the character is a letter
                if (currentChar.matches("[aeiou]")) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("The number of vowels is " + vowelCount);
        System.out.println("The number of consonants is " + consonantCount);
    }
}
