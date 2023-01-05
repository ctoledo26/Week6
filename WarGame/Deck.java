package WarGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	 private List<Card> cards;

	    public Deck() {
	        cards = new ArrayList<>();
	        String[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
	        for (String suit : suits) {
	            for (int i = 2; i <= 14; i++) {
	                Card card = new Card(i, i + " of " + suit);
	                cards.add(card);
	            }
	        }
	    }
	    public void shuffle() {
	        Collections.shuffle(cards);
	    }

	    public Card draw() {
	        return cards.remove(0);
	    }
	}
