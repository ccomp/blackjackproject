import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import java.applet.*;

public class Blackjack extends Applet{

	// creates an array of cards, then the deck
	public static Card[] c = new Card[52];
	public static Deck deck = new Deck(c);


	// creates the player and dealer hands, declaring who has the deck
	public static Hand playerHand = new Hand(deck, false);
	public static Hand dealerHand = new Hand(deck, true);

	// creates the player and dealer objects
	public static Player player = new Player(playerHand);
	public static Player dealer = new Player(dealerHand);

	private boolean playerTurn;
	private int outcome;
	private ButtonPanel panel;

	// public void init() {    
	// }

	// public int getValue(){
	// }

	// public void reset(){
	// }  

	// public void play(){
	// }


	// creates the background
	public void paint(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, 1000, 1000);
		} 
	}
}
