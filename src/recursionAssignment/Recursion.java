package recursionAssignment;

import java.io.*;

public class Recursion{
  public static int countHi(String str){
    if (str.length() == 0 || str.length() == 1) {
      return 0;
    } else if(str.charAt(0) == 'h' && str.charAt(1) == 'i'){
      return 1 + Recursion.countHi(str.substring(1));
    } else {
      return 0 + Recursion.countHi(str.substring(1));
    }
  }
}
