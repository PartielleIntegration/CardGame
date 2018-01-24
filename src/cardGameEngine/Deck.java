package cardGameEngine;

import java.util.ArrayList;
import java.util.Collections;
public class Deck {
	protected ArrayList<Card> cardDeck;
	protected final int startingDecksize;
	

	public Deck(ArrayList<Card> cardDeck) {
		this.cardDeck = cardDeck;
		startingDecksize=cardDeck.size();
		shuffle();
		
	}

	public Deck(Deck deck) {
		cardDeck = new ArrayList<Card>();
		startingDecksize=cardDeck.size();
		for(Card c: deck.cardDeck) {
			cardDeck.add(c);
		}
		shuffle();
	}
	
	public void shuffle() {
		Collections.shuffle(cardDeck);
	}
	
	public Card drawOne() {
		Card draw = cardDeck.get(cardDeck.size()-1);
		cardDeck.remove(cardDeck.size()-1);
		return draw;
	}
	
	public Card[] drawMany(int amount) {
		Card[] drawn = new Card[amount];
		for(int i=0;i<amount;i++) {
			drawn[i]=drawOne();
		}
		return drawn;
	}
	
	public void addMany(Card[] cards) {
		for (int i = 0; i < cards.length; i++) {
			addOne(cards[i]);
		}
	}
	
	public void addOne(Card c) {
		cardDeck.add(c);
	}
}
