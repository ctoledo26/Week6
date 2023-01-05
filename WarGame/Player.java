package WarGame;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<Card> hand;
    private int score;
    private String name;

    public Player(String name) {
        hand = new ArrayList<>();
        score = 0;
        this.name = name;
    }

    public void describe() {
        System.out.println(name + " has score " + score + " and the following cards in their hand:");
        for (Card card : hand) {
            card.describe();
        }
    }

    public Card flip() {
        return hand.remove(0);
    }

    public void draw(Deck deck) {
        Card drawnCard = deck.draw();
        hand.add(drawnCard);
    }

    public void incrementScore() {
        score++;
    }
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

	}

