package cse360assignment01;


/**
 * The program is used to add and subtract numbers, just like a calculator, and it also shows transaction of the user.
 * 
 * @author Albert Frederick <p>
 * @version 2.0<P>
 */

public class AddingMachine {
	
	  /**
	   * The total of all integers.
	   */
	  private int total;
	  
	  /**
	   *The transactions of the adding machine.
	   */
	  private String history = "0";
	  
	  
	  /**
	   * AddingMachine() is the constructor.
	   */
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	  }
	  
	  /**
	   * This method is used to return the current total of all the integer.
	   * @return The total of current integer
	   */
	  public int getTotal () {
	    return total;
	  }
	  
	  /** 
	   * This method is used to  add the parameter to the total variable, add the operator and parameter to history.
	   * @param value This the integer that is going to add
	   */
	  public void add (int value) {
		  total = total + value;
		  history += " + " + value;
	  }
	  
	  /** 
	   * This method is used to subtract the parameter from the total variable, add the operator and parameter to history.
	   * @param value This the integer that is going to subtract
	   */
	  public void subtract (int value) {
		  total = total - value;
		  history += " - " + value;
	  }

	  /**
	   * This method is used to return the history of the transactions of both adding and subtracting.
	   * @return the transactions of the adding machine
	   */
	  public String toString () {
	    return history + " ";
	  }

	  /**
	   * This method is used to clear the total and history of the adding machine.
	   */
	  public void clear() {
		 history = "0" ;
		 total = 0;
	  }
	}





