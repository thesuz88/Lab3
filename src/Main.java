import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userNum = 0;
        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
            System.out.println("Enter an Integer: ");
            userNum = scan.nextInt();

            System.out.printf("%-1s%10s%10s","Number", "Squared", "Cubed");
            System.out.println();

            for (int i = 1; i <= userNum; i++) {
                int squared = (int) Math.pow(i, 2);
                int cubed = (int) Math.pow(i, 3);
                System.out.printf("%-1s%10s%15s", i, squared, cubed);
                System.out.println();
            }

            choice = scan.nextLine();

            System.out.println("Continue? (y/n): ");
            choice = scan.nextLine();
        }

        System.out.println("Goodbye!");
    }
}
