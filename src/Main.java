/**
 * Susan Santos
 * N01447556
 * Project 5
 *This Main class creates a string of cards and executes the functions in the Stack class. 
 *This process uses an arraylist to randomly add the cards to a stack. 
 *It also prints out the results before and after randomization. 
 */

import java.util.ArrayList;
import java.util.Random;

public class Main {
/**
 * In Main.java, your goal is to create a stringArray of String objects and print them out. 
 */
	public static void main(String[] args) {
	/**
	 * Create an array of Strings such that each element in the array is the name of a card. 
	 */
	String cardNames[] = new String[] {
			"Ace of Clubs","Ace of Diamonds","Ace of Hearts","Ace of Spades",
			"2 Clubs","2 Diamonds","2 Hearts","2 Spades",
			"3 Clubs","3 Diamonds","3 Hearts","3 Spades",
			"4 Clubs","4 Diamonds","4 Hearts","4 Spades",
			"5 Clubs","5 Diamonds","5 Hearts","5 Spades",
			"6 Clubs","6 Diamonds","6 Hearts","6 Spades",
			"7 Clubs","7 Diamonds","7 Hearts","7 Spades",
			"8 Clubs","8 Diamonds","8 Hearts","8 Spades",
			"9 Clubs","9 Diamonds","9 Hearts","9 Spades",
			"10 Clubs","10 Diamonds","10 Hearts","10 Spades",
			"Jack of Clubs","Jack of Diamonds","Jack of Hearts","Jack of Spades",
			"Queen of Clubs","Queen of Diamonds","Queen of Hearts","Queen of Spades",
			"King of Clubs","King of Diamonds","King of Hearts","King of Spades"};
	
	
	/**
	 * Create an ordered ArrayList using this array
	 */
	ArrayList<String> cardList = new ArrayList<>();

	for (String elem : cardNames) {
	    cardList.add(elem);
	}//for, adds cardNames to cardList
	
	
	/**
	 * print array
	 */
	for(int i = 0; i < cardList.size(); i++) {
	System.out.println(cardList.get(i));
	}//print loop
	
	
	/**
	 * Create an empty Stack that can hold 52 elements.
	 */
	Stack stringArray = new Stack(52);
	
		  
	/**Using the java.util.Random package, use the Random function to randomly add elements from the ArrayList to the stack. 
	 * 
	 */
	Random shuffle = new Random();
	for(int i = 0; i < 52; i++) {
		int index = shuffle.nextInt(cardList.size());
		stringArray.push(cardList.get(index));
		/**
		 * As you add an element to the stack, remove it from the ArrayList. This way when the Stack is full, the ArrayList will be empty.
		 */
		cardList.remove(index);
	}//for, shuffles, gets, and removes cards.
	
	
	/**
	 * From here, Loop through and print all values from the stack. 
	 *  Use IsEmpty to check whether the Stack is empty. 
	 *  Use the return value from Pop() to get the top most value in order to print each value.
	 */
	System.out.println("");
	System.out.println("");
	System.out.println("Cards in Stack: ");
	
	while(!stringArray.isEmpty()) {
		System.out.println(stringArray.pop());
	}//while, prints until empty
	

	}//main fx
}//class







 








//Include a Javadoc comment for your class. Include your name, n-number, and project name and description of what the class/project does in this comment.
//Include comments in your functions that explains complected pieces of code. If the code seems easy to understand, then there's no need. But for hard to follow spots (i.e. multiple if's within if's), put in comments to explain what 's going on.
