package bitManipulation.numOfValidWords;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class NumOfValidWordsTest {

    @Test
    public void findNumOfValidWords() {
        String[] words = new String[]{"aaaa","asas","able","ability","actt","actor","access" };
        String[] puzzles = new String[]{"aboveyz","abrodyz","abslute","absoryz","actresz","gaswxyz"};
        NumOfValidWords test = new NumOfValidWords();
        List<Integer> numOfValidWords = test.findNumOfValidWords(words, puzzles);
        System.out.println(numOfValidWords);
    }
}