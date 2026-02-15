import java.util.Scanner;

public class SimpleCardDeck {
    public static void main() {
        // Initialize an empty deck with a fixed size
        String[] deck = new String[52]; // Adjust size as needed
        int deckSize = 0; // To keep track of the number of cards in the deck
        String command = "";
        Scanner scanner = new Scanner(System.in);

        // Display options
        System.out.println("\nOptions:");
        System.out.println("p - Put a card on the deck");
        System.out.println("t - Take a card from the deck");
        System.out.println("r - Print the deck");
        System.out.println("q - Quit the program");

        // Get user input
        command = scanner.nextLine();

        // While command is not "q"
        while (!command.equals("q")) {
            // Print the deck
            for (int i = 0; i < deckSize; i = i + 1) {
                System.out.print(deck[i]);
                if (i < deckSize - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();

            // If command is 'r', print the current state of the deck
            if (command.equals("r")) {
                for (int i = 0; i < deckSize; i = i + 1) {
                    System.out.print(deck[i]);
                    if (i < deckSize - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }

            // If command is 'p', prompt the user for a card value and add it to the deck
            if (command.equals("p")) {
                if (deckSize < deck.length) {
                    System.out.print("Enter card value to add: ");
                    String card = scanner.nextLine();
                    deck[deckSize] = card;
                    deckSize = deckSize + 1;
                }
            }

            // If command is 't', remove and print the last card from the deck
            if (command.equals("t")) {
                if (deckSize > 0) {
                    String card = deck[deckSize - 1];
                    deckSize = deckSize - 1;
                    System.out.println("Removed card: " + card);
                } else {
                    System.out.println("The deck is empty.");
                }
            }

            // Get user input again for the next command
            command = scanner.nextLine();
        }
    }
}
