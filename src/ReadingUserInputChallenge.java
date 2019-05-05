import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;


        while(count <= 10) {
            System.out.println("Enter a number: ");
            count++;

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
            }

        }

        System.out.println("The sum is: " + sum);
    }

}
