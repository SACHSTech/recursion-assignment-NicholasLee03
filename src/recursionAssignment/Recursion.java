package recursionAssignment;

import java.io.*;

public class Recursion{

  /**
  * Given a string, recursively counts the number of times "hi" appears in the string
  * 
  * @param str The string that is being read 
  * @return The number of times "hi" appears in the string
  */
  public static int countHi(String str){

    // Base Case
    // If there is only one character left, the program returns 0
    if (str.length() == 1) {
      return 0;
    } 
    
    // Recursive Call 
    // Looks for the characters "hi" in the string
    else if(str.charAt(0) == 'h' && str.charAt(1) == 'i') {
      return 1 + Recursion.countHi(str.substring(1));
    } else {
      return 0 + Recursion.countHi(str.substring(1));
    }

  }

  /**
  * Given a string, recursively replaces all "pi" found in the string to "3.14"
  * 
  * @param str The string that is being read 
  * @return The new string 
  */
  public static String changePi(String str){

    // Base Case
    // If there is only one or zero characters left, the program returns the string
    if (str.length() == 0 || str.length() == 1) {
      return str;
    }

    // Recursive Call 
    // Looks for the characters "pi" in the string and replaces with "3.14"
    else if (str.charAt(0) == 'p' && str.charAt(1) == 'i') {
      return "3.14" + Recursion.changePi(str.substring(2));
    } else {
      return str.substring(0,1) + Recursion.changePi(str.substring(1));
    }

  }

  /**
  * Given a array of ints, recursively checks for a number that is followed by a number that is ten times its value.
  * 
  * @param intNums The array of ints
  * @param index The index of the array
  * @return A boolean value  
  */
  public static boolean array220(int[] intNums, int index){
    
    // Base Case
    // Returns false when the index reaches the length of the array minus one
    if (index == intNums.length-1) {
      return false;
    } 

    // Recursive Call
    // Checks the following number if it is a value multiplied by ten of the previous number
    if (intNums[index + 1] == intNums[index] * 10 || array220(intNums, index + 1)) {
      return true;
    } else { 
      return false;
    }
    

  }

}
