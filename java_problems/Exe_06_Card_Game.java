package lists_Week5_2_22_23.Exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Exe_06_Card_Game {

    /**
     * You will be given two hands of cards, which will be integer numbers. Assume that you have two players.
     * You must find the winning deck and, respectively, the winner.
     * You start from the beginning of both hands. Compare the cards from the first deck to those from the second.
     * The player, who has a bigger card, takes both cards and puts them on the back of his hand
     * - the second player's card is last, and the first person's card (the winning one) is before it (second to last), and the player with the smaller card must remove the card from his deck.
     * If both players' cards have the same values - no one wins, and the two cards must be removed from the decks.
     * The game is over when one of the decks is left without any cards.
     * You have to print the winner on the console and the sum of the left cards:
     * "{First/Second} player wins! Sum: {sum}".
     */

    public static void fillList(ArrayList<Integer> numList, String input) {

        String[] arr = input.split(" ");
        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            numList.add(num);

        }
    }

    public static int sumOfCards(ArrayList<Integer> listCard) {

        int sum = 0;
        for (int i = 0; i < listCard.size(); i++) sum += listCard.get(i);

        return sum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String firstPlayer = scanner.nextLine();
        String secondPlayer = scanner.nextLine();

        ArrayList<Integer> deckOne = new ArrayList<>();
        fillList(deckOne, firstPlayer);

        ArrayList<Integer> deckTwo = new ArrayList<>();
        fillList(deckTwo, secondPlayer);

        while (true) {

            if (deckOne.isEmpty() || deckTwo.isEmpty()) {

                if (deckOne.size() > deckTwo.size()) {
                    System.out.printf("First player wins! Sum: %d", sumOfCards(deckOne));
                } else {
                    System.out.printf("Second player wins! Sum: %d", sumOfCards(deckTwo));
                }
                break;
            }

            int cardIndex = 0;
            int cardDeckOne = deckOne.get(cardIndex);
            int cardDeckTwo = deckTwo.get(cardIndex);

            if (cardDeckOne == cardDeckTwo) {
                deckOne.remove(cardIndex);
                deckTwo.remove(cardIndex);

            } else if (cardDeckOne > cardDeckTwo) {

                deckOne.add(cardDeckOne);
                deckOne.remove(cardIndex);
                deckOne.add(cardDeckTwo);
                deckTwo.remove(cardIndex);

            } else if (cardDeckTwo > cardDeckOne) {

                deckTwo.add(cardDeckTwo);
                deckTwo.remove(cardIndex);
                deckTwo.add(cardDeckOne);
                deckOne.remove(cardIndex);

            }
        }
    }
}
