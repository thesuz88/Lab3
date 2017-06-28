import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userNum = 0;
        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
            System.out.println("Enter an Integer: ");
            while (!scan.hasNextInt()) {
                String input = scan.nextLine();
                System.out.println("Invalid Entry. Enter an Integer: ");
            }
            userNum = scan.nextInt();

            System.out.println("Number" + "\t" + "\t" + "Squared" + "\t" + "\t" + "Cubed");
            System.out.println("======" + "\t\t" + "=======" + "\t\t" + "======");

            for (int i = 1; i <= userNum; i++) {
                int squared = (int) Math.pow(i, 2);
                int cubed = (int) Math.pow(i, 3);
                System.out.println(i + "\t\t\t"+ squared + "\t\t\t" + cubed);

            }

            choice = scan.nextLine();

            System.out.println("Continue? (y/n): ");
            choice = scan.nextLine();
        }

        System.out.println("Goodbye!");
    }
}
