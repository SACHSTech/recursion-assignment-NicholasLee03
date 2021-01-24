package recursionAssignment;

import java.io.*;

public class Recursion{

  /**
  * Given a string, recursively counts the number of times "hi" appears in the string
  * 
  * @param str The string that is being read 
  * @return The number of times "hi" appears in the string
  * @author N.Lee
  */
  public static int countHi(String str){

    // Base Case
    // If there is only one character left, the program returns 0
    if (str.length() == 1) {
      return 0;
    } 
    
    // Recursive Case 
    // Looks for the characters "h" and "i" in the first and second characters of the string
    if (str.charAt(0) == 'h' && str.charAt(1) == 'i') {
      // Returns value of 1 and the substring of the string after the first character
      return 1 + Recursion.countHi(str.substring(1));
    } else {
      // Returns 0 and the substring of the string after the first character
      return 0 + Recursion.countHi(str.substring(1));
    }

  }


  /**
  * Given a string, recursively replaces all appearances of "pi" found in the string to "3.14"
  * 
  * @param str The string that is being read 
  * @return The new string with "3.14" instead of "pi" 
  * @author N.Lee
  */
  public static String changePi(String str){

    // Base Case
    // If there is only one or zero characters left, the program returns the string
    if (str.length() == 0 || str.length() == 1) {
      return str;
    }

    // Recursive Case 
    // Looks for the characters "pi" in the string and replaces with "3.14"
    if (str.charAt(0) == 'p' && str.charAt(1) == 'i') {
      // Returns "3.14" and the rest of the string after the two characters
      return "3.14" + Recursion.changePi(str.substring(2));
    } else {
      // Returns the character and the rest of the string
      return str.substring(0, 1) + Recursion.changePi(str.substring(1));
    }

  }


  /**
  * Given an array of ints, recursively checks for a number that is followed by a number that is ten times its value.
  * 
  * @param intNums The array of ints
  * @param index The index of the array
  * @return A boolean value  
  * @author N.Lee
  */
  public static boolean array220(int[] intNums, int index){
    
    // Base Case
    // Returns false when the index reaches the length of the array minus one
    if (index == intNums.length - 1) {
      return false;
    } 

    // Recursive Case
    // Checks the following number if it is a value multiplied by ten of the previous number
    if (intNums[index + 1] == intNums[index] * 10 || array220(intNums, index + 1)) {
      return true;
    } else { 
      return false;
    }

  }

}
