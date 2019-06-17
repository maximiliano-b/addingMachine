package cse360assign2;

/**
 *  This class will have basic functions of a add and subtracting 
 *  
 *  @author Maximiliano Bojorquez
 *  		1207238145
 *  		Assignment 2
 *  @version 1.0 June 18, 2019
 **/
public class AddingMachine {
	private int total;
	private String transaction = "";


	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * a getTotal method that returns the value that 'total' holds
	 * 
	 * @return total value
	 **/
	public int getTotal () {
		return total;
	}
	
	/**
	 * a add method that adds in a value to the 'total' value
	 * 
	 * @param value it will pass in a value to add to the total
	 **/
	public void add (int value) {
		transaction += " + " + value;
		total+=value;
	}
	
	/**
	 * a subtract method that subtracts in a value to the 'total' value
	 * 
	 * @param value it will pass in a value to subtract to the total
	 **/
	public void subtract (int value) {
		transaction += " - " +  value;
		total-=value;
	}

	/**
	 * a toString method that prints out the transactions that have been
	 * entered
	 * 
	 * @return a string with all the transactions that have been entered
	 **/
	public String toString () {
		return 0 + transaction;
	}
	
	/**
	 * a clear method that sets every parameter, total and transaction to 
	 * zero and single string, respectively s 
	 **/
	public void clear() {
		total = 0;
		transaction = "";
	}
	
	public static void main(String args[]) {
		AddingMachine calc = new AddingMachine();
		
		calc.add(4);
		calc.subtract(2);
		calc.add(5);
		System.out.println(calc);

	}
}



