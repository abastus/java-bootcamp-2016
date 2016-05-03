package topic1_maven;

import java.util.List;
import java.util.ArrayList;

/* The IntegerExample class instantiates and maintains a list of integers. 
 * The addInteger method adds a new integer to the list and the getSize method returns the size of the list.
 */

public class IntegerExample {

   private List<Integer> integers = null;

   public IntegerExample() {
      integers = new ArrayList<Integer> ();
   }

   public void addInteger(int num) {
      integers.add(num);
   }

   public int getSize() {
      return integers.size();
   }
}