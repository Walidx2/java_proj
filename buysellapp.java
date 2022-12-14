import java.util.Scanner;

import java.util.ArrayList;

 
public class BuySellApp
{
  
public static void main (String[]args)
  {
    
      // Create a new Scanner object to read input from the console
      Scanner scanner = new Scanner (System.in);
    
 
      // Print a welcome message
      System.out.println ("Welcome to the Buy and Sell App!");
    
 
      // Create a boolean variable to track whether the user wants to continue using the app
      boolean continueUsingApp = true;
    
 
      // Create a string to store the user's input
      String input;
    
 
      // Create a variable to store the user's current balance
    double balance = 1000;
    
 
      // Create a variable to store the price of the item being bought or sold
    double price;
    
 
      // Create a variable to store the quantity of the item being bought or sold
    int quantity;
    
 
      // Create a variable to store the total cost of a transaction
    double totalCost;
    
 
      // Create a list to store the available products
      
 
     // Add some initial products to the lis
 
      // Create a variable to track whether the user is logged in
      boolean loggedIn = false;
    
 
      // Keep running the app until the user decides to quit
      while (continueUsingApp)
      {
	
	  // Check if the user is logged in
	  if (!loggedIn)
	  {
	    
	      // Ask the user to enter their username and password
	      System.out.print ("Please enter your username: ");
	    
String username = scanner.nextLine ();
	    
System.out.print ("Please enter your password: ");
	    
String password = scanner.nextLine ();
	    
 
	      // TODO: Check the username and password against a database or other data store to verify the user's identity
	      
	      // For now, just assume that any username and password combination is valid
	      loggedIn = true;
	    
System.out.println ("Login successful!");
	  
}
	else
	  {
	    
	      // Print a menu of options
	      System.out.println ("Please choose an option:");
	    
System.out.println ("1. Check balance");
	    
System.out.println ("2. Buy");
	    
System.out.println ("3. Sell");
	    
System.out.println ("4. List products");
	    
System.out.println ("5. Quit");
	    
 
	      // Read the user's input
	      input = scanner.nextLine ();
	    
 
	      // Handle the user's selection
	      switch (input)
	      {
	      
case "1":	// The user wants to check their balance
		System.out.println ("Your current balance is: $" + balance);
		
break;
	      
case "2":	// The user wants to buy something
		// Ask the user for the name of the product they want to buy
		System.out.
		  print ("Enter the name of the product you want to buy: ");
		
String productName = scanner.nextLine ();
	      
 
}
	  }
      }
  }
}
