package arraytest.duplication.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple Application.
 */
public class DeDupTest 
    extends TestCase {

  final int[] randomIntegers = {1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,
    9,3,20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,6,19,
    13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};

  final int[] emptyArray = {};

  final int[] arrayOfOne = {1};

  final int[] result = {1,2,34,25,45,3,26,85,4,86,43,10000,11,16,19,18,9,20,17,8,15,6,5,10,14,12,
    13,7};

  final int[] resultSorted = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,25,26,34,43,45,
    85,86,10000};

  /**
     * Create the test case.
     *
     * @param testName name of the test case.
     */
  public DeDupTest( String testName ) {
      super( testName );
  }

  /**
   * Create the test suite.
   */
  public static Test suite() {
    return new TestSuite( DeDupTest.class );
  }

  /**
     * Rigourous Test.
     */
  public void testApp() {
    assertTrue( true );
  }

  /**
   * Test for removing duplicates.
   */
  public void testRemoveDuplicates() {
    DeDup dd1 = new DeDup();
    int[] ri = randomIntegers;
    int[] answer1 = dd1.removeDuplicates(ri);
    assertEquals(result.length,answer1.length);
    for (int i = 0; i < answer1.length; i++) {
      assertEquals(result[i],answer1[i]);
    }
  }

  /**
   * Test for Removing Dupicates with an Empty Array.
   */
  public void testRemoveDuplicatesEmptyArray() {
    DeDup dd2 = new DeDup();
    int[] empty = emptyArray;
    int[] answer = dd2.removeDuplicates(empty);
    assertEquals(emptyArray.length,answer.length);
  }

  /**
   * Test for Removing Duplicates with an Array of 1.
   */
  public void testRemoveDuplicatesArrayOfOne() {
    DeDup dd3 = new DeDup();
    int[] one = arrayOfOne;
    int[] answer = dd3.removeDuplicates(one);
    assertEquals(one.length,answer.length);
  }
  
  /**
   * Test for Removing Duplicates using a sort.
   */
  public void testRemoveDuplicatesSort() {
    DeDup dd4 = new DeDup();
    int[] ri = randomIntegers;
    int[] answer = dd4.removeDuplicatesSort(ri);
    assertEquals(resultSorted.length,answer.length);
    for (int i = 0; i < answer.length; i++) {
      assertEquals(resultSorted[i],answer[i]);
    }
  }

  /**
   * Test for Removing Duplicates using a sort with an Empty Array.
   */
  public void testRemoveDuplicatesSortEmptyArray() {
    DeDup dd5 = new DeDup();
    int[] empty = emptyArray;
    int[] answer = dd5.removeDuplicatesSort(empty);
    assertEquals(emptyArray.length,answer.length);
  }

  /**
   * Test for Removing Duplicates using a sort with an Array of 1.
   */
  public void testRemoveDuplicatesSortArrayOfOne() {
    DeDup dd6 = new DeDup();
    int[] one = arrayOfOne;
    int[] answer = dd6.removeDuplicatesSort(one);
    assertEquals(arrayOfOne.length,answer.length);
  }

  /**
   * Test for Removing Duplicates using a HashSet.
   */
  public void testRemoveDuplicatesHashSet() {
    DeDup dd7 = new DeDup();
    int[] ri = randomIntegers;
    int[] answer = dd7.removeDuplicatesHashSet(ri);
    assertEquals(result.length,answer.length);  
  }

  /**
   * Test for Removing Duplicates using a HashSet with an Empty Array.
   */
  public void testRemoveDuplicatesHashSetEmptyArray() {
    DeDup dd8 = new DeDup();
    int[] empty = emptyArray;
    int[] answer = dd8.removeDuplicatesHashSet(empty);
    assertEquals(emptyArray.length,answer.length);  
  }

  /**
   * Test for Removing Duplicates using a HashSet with an Array of 1.
   */
  public void testRemoveDuplicatesHashSetArrayOfOne() {
    DeDup dd9 = new DeDup();
    int[] one = arrayOfOne;
    int[] answer = dd9.removeDuplicatesHashSet(one);
    assertEquals(arrayOfOne.length,answer.length);  
  }

  /**
   * Create the test case for Main method.
   * There are no mocks to test behavior.
   */
  public void testMain() {
    DeDup dd10 = new DeDup();
    dd10.main(null);
  }
}
