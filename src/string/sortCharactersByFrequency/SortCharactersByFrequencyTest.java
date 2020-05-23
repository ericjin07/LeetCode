package string.sortCharactersByFrequency;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 05/23/2020 9:52 PM
 */
public class SortCharactersByFrequencyTest {

    @Test
    public void frequencySort() {
        SortCharactersByFrequency test = new SortCharactersByFrequency();
        String s = "tree";
        System.out.println(test.frequencySort(s));

    }
}