import java.util.Scanner;

public class RPS_Notes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            System.out.println("Player A, enter your move (R/P/S): ");
            String playerAChoice = scanner.nextLine().toUpperCase();

            while (!isValidMove(playerAChoice)) {
                System.out.println("Invalid choice. Please enter R, P, or S: ");
                playerAChoice = scanner.nextLine().toUpperCase();
            }

            System.out.println("Player B, enter your move (R/P/S): ");
            String playerBChoice = scanner.nextLine().toUpperCase();

            while (!isValidMove(playerBChoice)) {
                System.out.println("Invalid choice. Please enter R, P, or S: ");
                playerBChoice = scanner.nextLine().toUpperCase();
            }

            determineWinner(playerAChoice, playerBChoice);

            System.out.println("Do you want to play again? (Y/N): ");
            String playAgainChoice = scanner.nextLine().toUpperCase();
            playAgain = playAgainChoice.equals("Y");
        }
        System.out.println("Thanks for playing!");
    }

    private static boolean isValidMove(String choice) {
        return choice.equals("R") || choice.equals("P") || choice.equals("S");
    }

    private static void determineWinner(String playerAChoice, String playerBChoice) {
        if (playerAChoice.equals(playerBChoice)) {
            System.out.println("It's a Tie!");
        } else if ((playerAChoice.equals("R") && playerBChoice.equals("S")) ||
                (playerAChoice.equals("S") && playerBChoice.equals("P")) ||
                (playerAChoice.equals("P") && playerBChoice.equals("R"))) {
            System.out.println("Player A wins!");
        } else {
            System.out.println("Player B wins!");
        }
    }
}
