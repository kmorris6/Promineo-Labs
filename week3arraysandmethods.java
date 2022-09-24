package week3ArraysandMethods;

public class week3arraysandmethods {

  public static void main(String[] args) {

    // create an array with the following values: 1, 5, 2, 8, 11, 6
    int[] array = {1, 5, 2, 8, 11, 6};
    
    // print out the first element in the array 
    System.out.println(array[0]);
    
    // print out the last element without using the number 5
    System.out.println(array[array.length -1]);
    
    // print out the element in the array at position 6. what happens? 
    // System.out.println(array[6]); // error: out of bounds since arrays start at 0
    
    // print out the element in the array at position -1. what happens?
    // System.out.println(array[-1]); // error: out of bounds 
    
    // write a traditional for loop that prints out each element in the array 
     for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
     }
    
    // write an enhanced for loop that prints out each element in the array 
    for (int num : array) {
      System.out.println(num);
    }
     
    // create a new variable called sum, write a loop that adds each element in the array to the sum 
    int sum = 0;
    for (int num : array) {
      sum += num;
    }
    System.out.println(sum);
   
    // create a new variable called average and assign the average value of the array to it. 
    int average = sum / array.length;
    System.out.println(average);
    
    // write an enhanced for loop that prints out each number in the array only if the number is odd
    for (int num : array) {
      if (num % 2 !=0) {
        System.out.println(num);
      }
    }
    
    // create an array that contains the values "Sam", "Sally, "Thomas", and "Robert"
    String[] N = {"Sam", "Sally", "Thomas", "Robert"};
    
    // calculate the sum of all the letters in the new array 
    int sumOfLetters = 0;
    for (String name : N) {
      sumOfLetters += name.length(); // String name is introducing the new variable name so it can evaluate each name in the N array.
    }
    System.out.println(sumOfLetters);
    
    
    // write and test a method that takes a string and prints out a greeting, this method returns nothing.
      //  public static void greet(String name) {   
      //    System.out.println("Hello, " + name + "!");}
      // Have to write the above code outside of the method being currently used so it can be called upon when testing the method
    greet("Tom");
    
    // write and test a method that takes a String name and returns a greeting, do not print in the method 
      // public static String greet2(String name) {
      //   return "Hi, " + name + "!";}
    greet2("Sally"); // this won't print anything because we told the method to return, not to print
    System.out.println(greet2("Sally")); // this can print it 
    
    // analyze the difference between these two methods - what do you find? How are they different? 
    // can't store the value in the print because you can't mismatch void and String
    // returning something can return something outside the method itself.
    
    // write and test a method that takes a string and an int and returns true if the number of letters in the string is greater than the int
    // public static boolean isStringGreaterThanNumber(String string, int num) {
    // if (string.length() > num) {
    //  return true; // don't need else statement because with return it ends there
    // }
    // return false;
    System.out.println(isStringGreaterThanNumber("Nick",2));
    
    // write and test a method that takes an array of string and a string and returns true if the string passed in exists in the array
    // public static boolean stringInArray(String[] array, String string) {
    // for (String str : array) {
    //   if (str.equals(string)) {
    //     return true;
    //   }
    // }
    // return false; 
    System.out.println(stringInArray(N, "Robert"));

    // write and test a method that takes an array of int and returns the smallest number in the array
    // public static int findSmallestNumber(int[] numbers) {
    // int smallest = numbers[0];
    // for (int numb : numbers) {
    //   if (numb < smallest) {
    //     smallest = numb;
    //   }
    // }
    // return smallest;
    System.out.println(findSmallestNumber(array));
    
    // write and test a method that takes an array of double and returns the average
    // public static double findAverage(double[] arr) {
    // double sum = 0;
    // for (double number : arr) {
    //  sum += number;
    // }
    // return sum / arr.length;
    // }
    double[] doubles = {45.7, 36.2, 76.5};
    System.out.println(findAverage(doubles));
    
    // write and test a method that takes an array of strings and returns an array of int where each element
    // matches the length of the string at that position
    // public static int[] findArrayOfIntegers(String[] strings) {
    // int[] results = new int[strings.length];
    // for (int i = 0; i < strings.length; i++) {
    //  results[i] = strings[i].length();
    // }
    // return results;
    int[] nameLengths = findArrayOfIntegers(N);
    for (int number : nameLengths) {
      System.out.println(number);
    }
    
    // write and test a method that takes an array of strings and returns true if the sum of letters for all strings with an 
    // even amount of letters is greater than the sum of these with an odd amount of letters.
    // public static boolean isEvenOrOdd(String[] arrayOfStr) {
    // int evenLetters = 0;
    // int oddLetters = 0;
    
    // for (String string : arrayOfStr) {
    //  if (string.length() % 2 == 0) {
    //    evenLetters += string.length();
    //  } else {
    //    oddLetters += string.length();
    //  }
    //}
    // return evenLetters > oddLetters;
    System.out.println(isEvenOrOdd(N));
    
    // write and test a method that takes a string and returns true if the strings is a palindrome. 
    System.out.println(isPalindrome("racecar"));
    
  }
public static boolean isPalindrome(String string) {
  for (int i = 0; i < string.length() / 2; i++) {
    if (string.charAt(i) != string.charAt(string.length() -i -1)) {
      return false;
    }
  }
 return true; 
}
  
public static boolean isEvenOrOdd(String[] arrayOfStr) {
  int evenLetters = 0;
  int oddLetters = 0;
  
  for (String string : arrayOfStr) {
    if (string.length() % 2 == 0) {
      evenLetters += string.length();
    } else {
      oddLetters += string.length();
    }
  }
  return evenLetters > oddLetters;
}
  
public static void greet(String name) {
  System.out.println("Hello, " + name + "!");
}
public static String greet2(String name) {
  return "Hi, " + name + "!";
}
public static boolean isStringGreaterThanNumber(String string, int num) {
  return string.length() > num;
    //return true; if you add these lines; don't need else statement because with return it ends there
  }
    //return false;
public static boolean stringInArray(String[] array, String string) {
  for (String str : array) {
    if (str.equals(string)) {
      return true;
    }
  }
  return false;
}
public static int findSmallestNumber(int[] numbers) {
  int smallest = numbers[0];
  for (int numb : numbers) {
    if (numb < smallest) {
      smallest = numb;
    }
  }
  return smallest;
}
public static double findAverage(double[] arr) {
  double sum = 0;
  for (double number : arr) {
    sum += number;
  }
return sum / arr.length;
}
public static int[] findArrayOfIntegers(String[] strings) {
  int[] results = new int[strings.length];
  for (int i = 0; i < strings.length; i++) {
    results[i] = strings[i].length();
  }
  return results;
}
}

