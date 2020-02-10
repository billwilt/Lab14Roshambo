import java.util.Random;
import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		String playerName = "";
		char chooseOpponent;
		char playerChoice;
		String yesNoContinue = "";
		boolean continueMore = false;

		System.out.println("Welcome to Rock Paper Scissors!\n");
		System.out.print("Please enter your name: ");
		playerName = scnr.nextLine();
		System.out.print("\n" + playerName + ", would you like to play against the Intimidator or Bubba? (i/b) ");
		chooseOpponent = scnr.next().charAt(0);
		scnr.nextLine(); // Clear Scanner
		boolean chooseAgain = false;
		do {
			do {
				System.out.print("Enter your choice rock, paper or scissors (r/p/s): ");
				playerChoice = scnr.next().charAt(0);

				if (playerChoice == 'r') {
					System.out.println(playerName + ": Rock");

					break;
				} else if (playerChoice == 'p') {
					System.out.println(playerName + ": Paper");

					break;
				} else if (playerChoice == 's') {
					System.out.println(playerName + ": Scissors");

					break;
				}
				chooseAgain = true;
			} while (chooseAgain == true);

			scnr.nextLine(); // Clear Scanner
			char compChoice = 'a';
			if (chooseOpponent == 'i' || chooseOpponent == 'I') {

				int randomNum = generateRandomNum(3);

				if (randomNum == 1) {
					System.out.println("the Intimidator: Rock");
					compChoice = 'r';
				} else if (randomNum == 2) {
					System.out.println("the Intimidator: Paper");
					compChoice = 'p';
				} else if (randomNum == 3) {
					System.out.println("the Intimidator: Scissors");
					compChoice = 's';
				}

			} else if (chooseOpponent == 'b' || chooseOpponent == 'B') {
				System.out.println("Bubba: Rock");
				compChoice = 'r';
			}
			//scnr.nextLine(); // Clear Scanner

			if (playerChoice == compChoice) {
				System.out.println("That was a TIE!\n");
			} else if (playerChoice == 'r' && compChoice == 'p') {
				System.out.println("Paper covers rock, you lose!\n");
			} else if (playerChoice == 'r' && compChoice == 's') {
				System.out.println("Rock smashes scissors, you win!\n");
			} else if (playerChoice == 'p' && compChoice == 'r') {
				System.out.println("Paper covers rock, you win!\n");
			} else if (playerChoice == 'p' && compChoice == 's') {
				System.out.println("Scissors cut paper, you lose!\n");
			} else if (playerChoice == 's' && compChoice == 'r') {
				System.out.println("Rock smashes scissors, you lose!\n");
			} else if (playerChoice == 's' && compChoice == 'p') {
				System.out.println("Scissors cuts paper, you win!\n");
			}
			System.out.print("Would you like to play again? (yes/no) ");
			yesNoContinue = scnr.nextLine();
			yesNoContinue(yesNoContinue);
			// boolean continuePlaying = Validator.yesOrNo(scnr, "(y/n) ");

		} while (yesNoContinue(yesNoContinue) == true);
		System.out.println("Goodbye");
	}

	public static int generateRandomNum(int s) {
		Random rand = new Random();
		int roll = (rand.nextInt(s)) + 1;
		return roll;
	}

	public static boolean yesNoContinue(String yesNoContinue) {
		boolean continueMore;
		if (yesNoContinue.toLowerCase().equals("yes")) {
			continueMore = true;
			return continueMore;
		} else {
			continueMore = false;
			return continueMore;
		}
	}
}
