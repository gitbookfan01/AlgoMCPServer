package Array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumHashMapTest {
    @Test
    void testBasicCase() {
        TwoSum ts = new TwoSum();
        int[] result = ts.twoSumHashMap(new int[]{2, 7, 11, 15}, 9);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void testNoSolution() {
        TwoSum ts = new TwoSum();
        int[] result = ts.twoSumHashMap(new int[]{1, 2, 3}, 7);
        assertArrayEquals(new int[]{-1, -1}, result);
    }

    @Test
    void testNegativeNumbers() {
        TwoSum ts = new TwoSum();
        int[] result = ts.twoSumHashMap(new int[]{-3, 4, 3, 90}, 0);
        assertArrayEquals(new int[]{0, 2}, result);
    }

    @Test
    void testDuplicates() {
        TwoSum ts = new TwoSum();
        int[] result = ts.twoSumHashMap(new int[]{3, 3}, 6);
        assertArrayEquals(new int[]{0, 1}, result);
    }


    @Test
    void testEmptyArray() {
        TwoSum ts = new TwoSum();
        int[] result = ts.twoSumHashMap(new int[]{}, 1);
        assertArrayEquals(new int[]{-1, -1}, result);
    }

    @Test
    void testSingleElement() {
        TwoSum ts = new TwoSum();
        int[] result = ts.twoSumHashMap(new int[]{5}, 5);
        assertArrayEquals(new int[]{-1, -1}, result);
    }

    @Test
    void testTargetZero() {
        TwoSum ts = new TwoSum();
        int[] result = ts.twoSumHashMap(new int[]{0, 4, 0}, 0);
        assertArrayEquals(new int[]{0, 2}, result);
    }
}