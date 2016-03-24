package arraytest.duplication.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class DeDup {

  public int[] randomIntegers = {1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,
    11,16,19,1,18,4,9,3,20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,
    14,20,17,16,3,6,19,13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,
    13,2,11};   

  /**
   * Main method.
   * @param Arguments.
   */
  public static void main(String [] args) {
    
    final DeDup ddOne = new DeDup();
    final int[] ri = ddOne.randomIntegers;
    final int[] answer1 = ddOne.removeDuplicates(ri);
    
    final DeDup ddTwo = new DeDup();
    final int[] ri2 = ddTwo.randomIntegers;
    final int[] answer2 = ddTwo.removeDuplicatesHashSet(ri2);
    
    final DeDup ddThree = new DeDup();
    final int[] ri3 = ddThree.randomIntegers;
    final int[] answer3 = ddThree.removeDuplicatesSort(ri3);
     
  }

  /**
   * This method removes Duplicate integers using brute force method.
   * @param randomInts.
   */
  public int[] removeDuplicates(int[] randomInts) {

    int ending = randomInts.length;
    for (int i = 0; i < ending; i++) {
      for (int y = i + 1; y < ending; y++) {
        if (randomInts[i] == randomInts[y]) {    
          int downOne = y;
          for (int z = y + 1; z < ending; z++, downOne++) {
            randomInts[downOne] = randomInts[z];
          }
          ending--;  
          y--; 
        }
      }
    }
    final int[] goodArray = new int[ending];
    System.arraycopy(randomInts, 0, goodArray, 0, ending);
    return goodArray;
  }

  /**
   * This method removes Duplicate integers using a HashSet.
   * @param randomInts.
   */
  public int[] removeDuplicatesHashSet(int[] randomInts) {

    final int ending = randomInts.length;
    HashSet<Integer> hashSet = new HashSet<Integer>();
    for (int y = 0; y < ending; y++) {
      hashSet.add(randomInts[y]);
    }
    int[] returnArray = new int[hashSet.size()];
    int x1 = 0;
    for (Iterator<Integer> iterator = hashSet.iterator(); iterator.hasNext();) {
      returnArray[x1++] = iterator.next();
    }
    return returnArray;
  }

  /**
     * This method removes Duplicate integers using a sort.
     * @param randomInts.
     */
  public int[] removeDuplicatesSort(int[] randomInts) {

    Arrays.sort(randomInts);
    int ending = randomInts.length;   
    int j1 = 0;
    int i1 = 1;

    while (i1 < randomInts.length) {
      if (randomInts[i1] == randomInts[j1]) {
        i1++;
      } else {
        j1++;
        randomInts[j1] = randomInts[i1];
        i1++;
      }    
    }
    if (randomInts.length != 0) {
      ending = j1 + 1;
    }
    final int[] goodArray = new int[ending];
    System.arraycopy(randomInts, 0, goodArray, 0, ending);
    return goodArray;
  }
   
}
