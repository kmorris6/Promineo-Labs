
public class VariablesAndOperations {

	public static void main(String[] args) {
		//Create a variable to hold the quantity of available plane seats left on a flight
		int availablePlaneSeats = 7;
		//Create a variable to hold the cost of groceries at checkout
		double costOfGroceries = 23.54;
		//Create a variable to hold a person's middle initial 
		char middleInitial = 'K';
		//Create a variable to hold true if it's hot outside and false if it's cold outside
		boolean itsHotOutside = true;
		//Create a variable to hold a customer's first name
		String customersFirstName = "Sara";
		//Create a variable to hold a street address
		String customersStreetAddress = "1234 N. Polk Street";
		//print all variables to the console
		System.out.println("The available number of seats is"+ " " +availablePlaneSeats);
		System.out.println("The cost of groceries is"+ " " +costOfGroceries);
		System.out.println("The cusomter's middle initial is"+ " " +middleInitial);
		System.out.println("It is"+ " " + itsHotOutside + " "+ "that it is hot outside");
		System.out.println("The customer's first name is"+ " " +customersFirstName);
		System.out.println("The customer's street address is"+ " " +customersStreetAddress);
		
		
		//a customer booked 2 plane seats, remove 2 seats from the available seats variable
		availablePlaneSeats = availablePlaneSeats - 2;
		// short hand: availablePlaneSeats -= 2;
		
		//impulse candy bar purchase, add 2.15 to the grocery total 
		costOfGroceries = costOfGroceries + 2.15;
		//short hand: costOfGroceries += 2.15;
		
		//birth certificate was printed incorrectly, change the middle initial to something else
		middleInitial = 'C';
		
		//the season has changed, update the hot outside variable to be opposite of what it was
		itsHotOutside = false;
		
		//create a new variable called full name using the customer's first name, middle initial, and a last name of your choice
		String fullName = customersFirstName + " " +middleInitial+ " Smith";
		
		//print a line to the console that introduces the customer and says they live at the address variable 
		System.out.println("The customer's name is"+ " " +fullName +" " + "and they live at" + " " + customersStreetAddress);

	}

}
