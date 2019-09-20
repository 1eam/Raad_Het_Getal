import java.util.Scanner;

public class RaadHetGetal {

	public static void main(String[] args) {
		Scanner textInput = new Scanner(System.in);

		boolean gameWon = false;
		int randomNumber = (int)(Math.random()*100);


		//TODO loopen als condition false blijft

		if (gameWon == false) for (int i = 0; i < 200; i++){
			System.out.print("raad het getal ");
			int playerInput = textInput.nextInt();

			if (playerInput == randomNumber) {
				gameWon = true;
			}

			else if (playerInput < randomNumber)
				System.out.println("Het getal is hoger");


			else if (playerInput > randomNumber)
				System.out.println("Het getal is lager");


			if (gameWon == true) {
				System.out.println("Men You guessed it! Whoo...");
			}
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
