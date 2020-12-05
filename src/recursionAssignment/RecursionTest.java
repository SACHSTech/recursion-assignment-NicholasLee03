package recursionAssignment;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


import recursionAssignment.Recursion;

public class RecursionTest{

  @Test
  public void Test1(){
    assertEquals(1, Recursion.countHi("xxhixx"));
  }

  @Test
  public void Test2(){
    assertEquals(2, Recursion.countHi("xhixhix"));
  }

  @Test
  public void Test3(){
    assertEquals(0, Recursion.countHi("xuuuu"));
  }
  

    

    
    
}
