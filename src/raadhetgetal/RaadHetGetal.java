package raadhetgetal;
import java.util.Scanner;

public class RaadHetGetal {

	public static void main(String[] args) {

		Scanner numberScanner = new Scanner(System.in);
		Scanner decisionScanner = new Scanner(System.in);

		boolean gameWon = false;
		int randomNumber = (int) (Math.random() * 100);
		int round = 2;
		int playerTries = 1;

		for (int gameLoop = 0; gameLoop >= 0; gameLoop++) {
			if (gameWon == false) {
				for (int i = 0; i >= 0; i++) {

					System.out.print("\nPlayer 1 raad het getal ");
					int playerInput = numberScanner.nextInt();

					if (playerInput < randomNumber) {
						playerTries++;
						System.out.println("[Het getal is hoger]");
					}
					if (playerInput > randomNumber) {
						playerTries++;
						System.out.println("[Het getal is lager]");
					}
					if (playerInput == randomNumber) {
						gameWon = true;
						break;
					}
				}
			}

			if (gameWon == true) {
				System.out.println("\n\t\t [  You guessed it!  ]");
				System.out.println("\t\t [It took you " + playerTries + " tries]");
				System.out.println("\n\t\t ~~[1] Rematch~~ \n\t\t ~~[2] Exit   ~~");
				int playerInput = numberScanner.nextInt();

				if (playerInput == 1) {
					System.out.println("\n/// round " + round++ + " \\\\\\");
					playerTries = 1;
					randomNumber = (int) (Math.random() * 100);
					gameWon = false;
				} else if (playerInput == 2) {
					System.out.println("TODO: back to Keuzemenu");
					gameWon = false;
				}
			}
		}
	}
}
//TODO: Construct Playerclass
//Cant make unit tests for this
