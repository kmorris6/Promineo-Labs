package week2ConditionsandLoops;

public class part1_conditionsandloops {

  public static void main(String[] args) {
 // Create a variable called age and assign it 14.
    int age = 14;
   
    // print the boolean >= 16 to the console and note the results.
    boolean hasLicense = true; {
      System.out.println(age >= 16);
    }
    // change the value of age to 18 and run again.
      
    // using a conditional, print "You can drive" if age is >= 16
    // and "you cannot drive" otherwise
    // change the value of age and rerun to see the result.
    if (age >= 16 && hasLicense == true) {
       System.out.println("You can drive.");
    } else {
       System.out.println("You cannot drive.");
    }
    // create two variables - costOfMilk and thirstLevel
    // create a new conditional that prints "Milk Please" if costOfMilk is less than 2.50
    // or if thirstLevel is greater than 6 and prints "No thanks" otherwise
    // change the values and note the different results
    double costOfMilk = 3.15; 
    int thirstLevel = 7;
    
    if (costOfMilk < 2.50 || thirstLevel > 6) {
      System.out.println("Milk please.");
    } else {
      System.out.println("No thanks!");
    }
    
    // create two variables called numberOfCookies and numberOfChildren
    // you will evenly distribute all of the cookies to the children and as the adult
    // you get to keep the remaining cookies to yourself
    // use a conditional to print the following based on the following condition: 
    // if there are 0 cookies remaining, print "sad face"
    // if there are less than 2 cookies, print "Yes!"
    // if there are less than 5 cookies, print "Whoohooo!"
    // if there are 5 or more cookies, print "Jackpot!"
    int numberOfCookies = 20;
    int numberOfChildren = 12;
    
    if (numberOfCookies % numberOfChildren >= 5) {
      System.out.println("Jackpot");
    } else if (numberOfCookies % numberOfChildren >= 2) {
      System.out.println("Whoohoo!");
    } else if (numberOfCookies % numberOfChildren >0 ) {
      System.out.println("Yes");
    } else {
      System.out.println("sad face");
    }
    
    
    // create a variable called loyaltyMemberStatus and assign the value "SILVER"
    // create a variable called loyaltyMemberDiscount and assign it the value 0.0
    // using a switch, set the value of loyaltyMemberDiscount based on the following loyaltyMember Status scale
    // "SILVER" is 0.10, "GOLD" is 0.15, and "PLATINUM" is 0.25
    String loyaltyMemberStatus = "SILVER";
    double loyaltyMemberDiscount = 0.0;
    
    switch(loyaltyMemberStatus) {
      case "SILVER":
        loyaltyMemberDiscount = 0.1;
        break;
      case "GOLD":
        loyaltyMemberDiscount = 0.15;
        break;
      case "PLATINUM":
        loyaltyMemberDiscount = 0.25;
        break;
    }
        
    System.out.println(loyaltyMemberDiscount);

    
    // create a variable called billTotal and assign a value 
    // create a variable called adjustTotal and assign it the billTotal minus the loayltyMemberDiscount percent of the billTotal
    // if the adjustedTotal is greater than $500 upgrade the loyaltyMemberStatus from SILVER to GOLD or GOLD to PLATINUM
    double billTotal = 33.44;
    double adjustedTotal = billTotal - (loyaltyMemberDiscount*billTotal);
    
    if (adjustedTotal > 500) {
      if (loyaltyMemberStatus == "SILVER") {
        loyaltyMemberStatus = "GOLD";
      } else if (loyaltyMemberStatus == "GOLD") {
        loyaltyMemberStatus = "PLATINUM";
      }
    }
    System.out.println(loyaltyMemberStatus);
  
    // create two variables, username and password
    // create a conditional that prints "login successful" if the username is "Tommy123" and the password is "12345"
    // otherwise, print "access denied"
    String username = "Tommy123";
    String password = "12345";
    
    if (username.equals("Tommy123") && password.equals("12345")) {
      System.out.println("login successful");
    } else {
      System.out.println("access denied");
    }
    
    // write a for loop that prints each number from 0 to 9
    for (int i=0; i<10; i++) {
      System.out.println(i);
    }
    // write a for loop that prints each number from 10 to 0 backwards
    for (int i=10; i >= 0; i--) {
      System.out.println(i);
    }
    // write a for loop that prints every other number from 0 to 100
    for (int i = 0; i <=100; i+=2) {
      System.out.println(i);
    }
      //OR you could write this to ensure only even numbers print 
      // for (int i = 0; i>=100; i++) { 
      //    if (i%2==0) {
      //      System.out.println(i);
      //  }
      // }
    // write a for loop that iterates from 0 to 100 and prints "EVEN" if the number is even and "ODD" if it's odd
    for (int i = 0; i<=100; i++) {
      if (i%2==0) {
        System.out.println("EVEN");
      }
      else {
        System.out.println("ODD");
      }
     }
    // write a while loop that starts at 100 and iterates backwards by 1 until it reaches 0
    // divide each number by 3 and print the remainder to the console 
    int i = 100;
    while (i > 0) {
      System.out.println(i + " " + (i % 3));
      i--;
    }
  }
}
