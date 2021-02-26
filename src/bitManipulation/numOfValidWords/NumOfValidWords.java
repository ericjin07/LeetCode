package bitManipulation.numOfValidWords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumOfValidWords {

    //time exceed
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        List<Integer> bins = new ArrayList<>();
        for (String w : words) {
            bins.add(getBitMask(w));
        }
        List<Integer> res = new ArrayList<>();
        for (String p : puzzles) {
            res.add(getCount(p, bins));
        }
        return res;
    }

    private Integer getCount(String p, List<Integer> bins) {
        int pBit = getBitMask(p);
        int first = p.charAt(0) - 'a';
        int cont = 0;
        for (int bin : bins) {
            if ((bin >> first & 1) == 0) continue;
            if ((bin & pBit) == bin) cont++;
        }
        return cont;
    }

    //use bit map
    //puzzle is all 7 letter
    //enum the all bit subset
    public List<Integer> findNumOfValidWords_2(String[] words, String[] puzzles) {
        Map<Integer,Integer> bitMap = new HashMap<>();
        // just need to get the words bit maps, let puzzle compare to it
        for (String w : words) {
            int mask = getBitMask(w);
            if (Integer.bitCount(mask) <= 7) { //each puzzle doesn't contain repeated letter
                bitMap.put(getBitMask(w), bitMap.getOrDefault(mask, 0) + 1);
            }
        }
        List<Integer> res = new ArrayList<>();
        for (String p : puzzles) {
            int first = getBitMask(p.substring(0,1));
            int mask = getBitMask(p.substring(1));
            int subset = mask;
            int cnt = 0;
            do {
                int key = first | subset;
                if (bitMap.containsKey(key)) {
                    cnt += bitMap.get(key);
                }
                subset = subset - 1 & mask;
            } while (subset != mask);
            res.add(cnt);
        }
        return res;
    }

    private int getBitMask(String word) {
        int bit = 0;
        char[] chars = word.toCharArray();
        for (char c : chars) {
            int u = c - 'a';
            if (((bit >> u) & 1) == 0) {
                bit |= 1 << u;
            }
        }
        return bit;
    }

}
