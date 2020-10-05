package cse360assignment01;

/**
 * This is the main class of AddingMachine.java
 * @author Albert Frederick
 * 
 */

public class tester {
	public static void main(String[] args) {
		 AddingMachine myCalculator=new AddingMachine();
	       myCalculator.add(4); // call add() method
	       myCalculator.subtract(2); // call subtract() method	     
	       myCalculator.add(5);
	       System.out.println(myCalculator.toString());
	       myCalculator.clear();
	       myCalculator.add(7); 
	       myCalculator.subtract(8);      
	       myCalculator.add(9);
	       System.out.println(myCalculator.toString());
	       System.out.println(myCalculator.getTotal());
	       myCalculator.clear();
	       myCalculator.subtract(9); 
	       myCalculator.subtract(10);      
	       myCalculator.add(29);
	       System.out.println(myCalculator.toString());
	       System.out.println(myCalculator.getTotal());
	       
	  }
}

