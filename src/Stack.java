/**
 * Susan Santos
 * N01447556
 *  Project 5
 *This Stack class contains the push, pop, and isEmpty functions. These are used to add and remove the cards and to check if any cards remain.
 */

public class Stack {
	/**
	 * create private array of strings
	 */
	private String stringArray[];
	private int top = 0; 
	public Stack(int size) { 
		stringArray = new String[size];
	}//constructor, needed for Stack stringArray to function
  
	/**
	 * Push() function; returns nothing, adds a string to the array
	 */
	public void push(String cards) {
		stringArray[top++] = cards;
	}//push, adds top element to array
  

	/**
	 * Pop() function; removes and returns top-most element
	 */
	public String pop(){
		top--;
		return stringArray[top];
	}//pop, returns array without top element
  

	/**
	 * IsEmpty() function; returns a bool for if empty
	 */
	public boolean isEmpty(){
		return top == 0;
	}//isEmpty, returns whether "top" is equal to 0 or not
  
}//class


