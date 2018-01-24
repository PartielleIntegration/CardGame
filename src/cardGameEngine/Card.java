package cardGameEngine;

public abstract class Card {
	String name;
	String type;
	CardEffect cardEffect;
	abstract CardEffect getCardEffect();
	
	
	
}
