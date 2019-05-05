import java.util.Scanner;

public class MinMaxChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int min = 2147483647;
        int max = -2147483647;
        int count = 1;

        while (count <= 10) {
            System.out.println("Enter a number: ");
            count++;

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();

                if (number < min) {
                    min = number;
                } else if (number > max) {
                    max = number;
                }

            }

        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        scanner.close();

    }
}