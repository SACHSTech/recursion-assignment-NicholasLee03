package recursionAssignment;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import recursionAssignment.Recursion;

public class RecursionTest{

  // Tests for Problem Set 1

  @Test
  // Test for "hi" in the middle of the string
  public void Test1(){
    assertEquals(1, Recursion.countHi("xxhixx"));
  }

  @Test
  // Test for two "hi"s in the string
  public void Test2(){
    assertEquals(2, Recursion.countHi("xhixhix"));
  }

  @Test
  // Test for a string with just "hi"
  public void Test3(){
    assertEquals(1, Recursion.countHi("hi"));
  }

  @Test
  // Test for no "hi" in the string
  public void Test4(){
    assertEquals(0, Recursion.countHi("hhhh"));
  }
  

  // Tests for Problem Set 2

  @Test
  // Test for "pi" in the middle of the string
  public void Test5(){
    assertEquals("x3.14x", Recursion.changePi("xpix"));
  }

  @Test
  // Test for two consecutive "pi"s in the string 
  public void Test6(){
    assertEquals("3.143.14", Recursion.changePi("pipi"));
  }

  @Test
  // Test for "pi" as the first two characters of the string
  public void Test7(){
    assertEquals("3.14p", Recursion.changePi("pip"));
  }

  @Test
  // Test for no "pi" in the string
  public void Test8(){
    assertEquals("pppp", Recursion.changePi("pppp"));
  }
  

  // Tests for Problem Set 3

  @Test
  // Test for a "true" value when found in the last index of the array
  public void Test9(){
    assertEquals(true, Recursion.array220(new int[] {1, 2, 20}, 0));
  }

  @Test
  // Test for a "true" value with just two numbers in the array
  public void Test10(){
    assertEquals(true, Recursion.array220(new int[] {3, 30}, 0));
  }

  @Test
  // Test for a "false" value with just one number in the array
  public void Test11(){
    assertEquals(false, Recursion.array220(new int[] {3}, 0));
  }

  @Test
  // Test for a "false" value with three numbers in the array
  public void Test12(){
    assertEquals(false, Recursion.array220(new int[] {1, 2, 3}, 0));
  }

}
