import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userNum = 0;
        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
            System.out.println("Enter an Integer: ");
            userNum = scan.nextInt();

            System.out.println("Number" + " " + "Squared" + " " + "Cubed");

            for (int i = 0; i <= userNum; i++) {
                int squared = (int) Math.pow(i, 2);
                int cubed = (int) Math.pow(i, 3);
                System.out.println(i + "      " + squared + "       " + cubed);
            }

            choice = scan.nextLine();

            System.out.println("Continue? (y/n): ");
            choice = scan.nextLine();
        }

        System.out.println("Goodbye!");
    }
}
