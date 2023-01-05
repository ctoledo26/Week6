package WarGame;

public class App {


	    public static void main(String[] args) {
	        Deck deck = new Deck();
	        Player player1 = new Player("Player 1");
	        Player player2 = new Player("Player 2");
	        deck.shuffle();

	        for (int i = 0; i < 52; i++) {
	            if (i % 2 == 0) {
	                player1.draw(deck);
	            } else {
	                player2.draw(deck);
	            }
	        }

	        for (int i = 0; i < 26; i++) {
	            System.out.println("Player 1's turn:");
	            Card card1 = player1.flip();
	            card1.describe();
	            System.out.println("Player 2's turn:");
	            Card card2 = player2.flip();
	            card2.describe();
	            if (card1.getValue() > card2.getValue()) {
	                player1.incrementScore();
	            } else if (card1.getValue() < card2.getValue()) {
	                player2.incrementScore();
	            }
	        }

	        if (player1.getScore() > player2.getScore()) {
	            System.out.println("Player 1 wins with final score " + player1.getScore() + "!");
	        } else if (player1.getScore() < player2.getScore()) {
	            System.out.println("Player 2 wins with final score " + player2.getScore() + "!");
	        } else {
	            System.out.println("It's a draw with final score " + player1.getScore() + "!");
	        }
	    }
	}

	


