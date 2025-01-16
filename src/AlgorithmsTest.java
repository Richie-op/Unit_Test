import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class AlgorithmsTest {
    @Test
    public void testReversedArray1(){
        Algorithms algo = new Algorithms();
        char[] input = {'c', 'h', 'e', 'v', 'y'};
        char[] expected = {'y', 'v', 'e', 'h', 'c'};
        assertArrayEquals(expected, algo.reverseArray(input));
    }

    @Test
    public void testReversedArray2(){
        Algorithms algo = new Algorithms();
        char[] input = {'d', 'o', 'd', 'g', 'e'};
        char[] expected = {'e', 'g', 'd', 'o', 'd'};
        assertArrayEquals(expected, algo.reverseArray(input));
    }
}