// Test for twoSumSorted
package Array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumSortedTest {
    @Test
    void testBasicCase() {
        TwoSum ts = new TwoSum();
        int[] result = ts.twoSumSorted(new int[]{2, 7, 11, 15}, 9);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void testNoSolution() {
        TwoSum ts = new TwoSum();
        int[] result = ts.twoSumSorted(new int[]{1, 2, 3}, 7);
        assertArrayEquals(new int[]{-1, -1}, result);
    }

    @Test
    void testNegativeNumbers() {
        TwoSum ts = new TwoSum();
        int[] result = ts.twoSumSorted(new int[]{-3, 4, 3, 90}, 0);
        assertArrayEquals(new int[]{0, 2}, result);
    }

    @Test
    void testDuplicates() {
        TwoSum ts = new TwoSum();
        int[] result = ts.twoSumSorted(new int[]{3, 3}, 6);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void testMultipleSolutions() {
        TwoSum ts = new TwoSum();
        int[] result = ts.twoSumSorted(new int[]{1, 2, 3, 4, 5}, 5);
        // Should return the first valid pair
        assertArrayEquals(new int[]{0, 3}, result);
    }

    @Test
    void testEmptyArray() {
        TwoSum ts = new TwoSum();
        int[] result = ts.twoSumSorted(new int[]{}, 1);
        assertArrayEquals(new int[]{-1, -1}, result);
    }

    @Test
    void testSingleElement() {
        TwoSum ts = new TwoSum();
        int[] result = ts.twoSumSorted(new int[]{5}, 5);
        assertArrayEquals(new int[]{-1, -1}, result);
    }

    @Test
    void testTargetZero() {
        TwoSum ts = new TwoSum();
        int[] result = ts.twoSumSorted(new int[]{0, 4, 0}, 0);
        assertArrayEquals(new int[]{0, 2}, result);
    }
}