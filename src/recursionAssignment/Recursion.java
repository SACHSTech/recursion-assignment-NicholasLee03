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
    // If there is only one or zero characters left, the program returns 0
    if (str.length() == 0 || str.length() == 1) {
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


}
