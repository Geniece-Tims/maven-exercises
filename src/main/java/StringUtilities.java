import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringUtilities {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Something Here: ");
        String userInput = scanner.nextLine();

        if (StringUtils.isNumeric(userInput)) {
            System.out.println("Cool! You entered this number: " + userInput);
        } else {
            System.out.println("Awesome! This is what you entered: " + userInput);
        }
        System.out.println("Hey! I have two other cools things for you to check out: ");
        System.out.println("Here is what your input looks like reversed: " + StringUtils.reverse(userInput));
        System.out.println("Also, look at what it looks like when swapping cases: " + StringUtils.swapCase(userInput));

    }
}
