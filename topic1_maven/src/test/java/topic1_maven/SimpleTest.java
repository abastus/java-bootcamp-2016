package topic1_maven;

import org.junit.Assert;
import org.junit.Test;

/* This test creates an instance of the IntegerExample class, 
	adds two integers to its list and verifies that its returned size equals to 2. */

public class SimpleTest {

   @Test
   public void test() {
      IntegerExample example = new IntegerExample();
      example.addInteger(10);
      example.addInteger(100);
      Assert.assertEquals(example.getSize(), 2); 
   }
}