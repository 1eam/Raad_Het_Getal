import java.util.Scanner;

public class RaadHetGetal {

	public static void main(String[] args) {
		Scanner textInput = new Scanner(System.in);

		System.out.print("raad het getal ");
		int playerInput = textInput.nextInt();
		int randomNumber = (int)(Math.random()*100);
		boolean gameWon = false;

		//TODO loopen als condition false blijft
		if (playerInput == randomNumber) gameWon = true; {
			System.out.println("Men You guessed it! Whoo...");
		}

		if (playerInput < randomNumber) {
			System.out.print("Het getal is hoger");
		}

		else if (playerInput > randomNumber) {
			System.out.print("Het getal is lager");
		}
		
		if (gameWon = false) {
			// execute lijn 8. loop of break
		}


		/*if "playerInput" > "randomNumber"{
		 System.out.print("Het getal is lager");
		 }
		else if "playerInput" < "randomNumber"{
		System.out.print("Het getal is hoger");
		 }
		else
		System.out.print("Het getal Juist. U heeft " + numberOfTrys + ("keer geraden");

		 */
	}

}
