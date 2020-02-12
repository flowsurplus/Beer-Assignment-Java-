
// Michael Jay Marajas Basic IO Program

// COP 2800C 

// 2/04/2020

// Purpose: To further show the ability to concatenate strings as well a perform mathematical functions
import java.util.Scanner;

class Beer_Class {
  public static void main(String[] args) {
	  // First input variable to determine base beer usage
    Scanner myObj = new Scanner(System.in);
    System.out.println("How many 12 oz. cans of beer will you consume on a daily basis?");
    double numberBeer = myObj.nextDouble();
    
      // Second input variable to determine cost of each beer
    Scanner myPay = new Scanner(System.in);
    System.out.println("How much do you usually pay for each beer?");
    double priceBeer = myPay.nextDouble();
    
    //These are the equations used to formulate the result
    double totalBeer = numberBeer * 365;
    double payBeer = priceBeer * 365;
    double totalCalories = totalBeer * 150;
    double weightGain = (totalBeer * 15) / 365;
    
    // I learned String Concatenation using the + operator! I included it in the result.
    // I also learned how to format the double variable in two decimal places precisely
    System.out.println("You are expected to consume "+ String.format("%.2f", totalBeer) + " beers in one year");
    System.out.println("That is "+ String.format("%.2f", payBeer) + " dollars in one year that you could have saved for something else.");
    System.out.println("This is how many calories you are expected to consume in a year based off on beer consumption alone: " +  String.format("%.2f", totalCalories));
    System.out.println("If you don't workout or diet, you are expected to gain "+  String.format("%.2f", weightGain) + " pounds off of just beer consumption alone! So be careful!");
  }
}