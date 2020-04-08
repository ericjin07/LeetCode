package com.eric;

/**
 * Create by IntelliJ IDEA.
 * Author: Eric Jin
 * Date: 4/8/20 8:45 PM
 */

import java.util.*;

/**
 * Given an array of strings, group anagrams together.
 *
 * Example:
 *
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Output:
 * [
 *   ["ate","eat","tea"],
 *   ["nat","tan"],
 *   ["bat"]
 * ]
 * Note:
 *
 * All inputs will be in lowercase.
 * The order of your output does not matter.
 */
public class GroupAnagrams {

    public static void main(String[] args) {
        GroupAnagrams anagrams = new GroupAnagrams();
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(anagrams.groupAnagrams(strs));
        System.out.println(anagrams.groupAnagrams_Sorted(strs));
    }

    public List<List<String>> groupAnagrams_Sorted(String[] strs) {
        List<List<String>> groups = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            map.compute(sorted, (k,v) -> {
                if (v == null) {
                    List<String> arr = new ArrayList<>();
                    arr.add(s);
                    return arr;
                } else {
                    v.add(s);
                    return v;
                }
            });
        }
        return new ArrayList<>(map.values());
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groups = new ArrayList<>();
        for(String s : strs) {
            boolean hasGroup = false;
            for (List<String> group : groups) {
                String groupStr = group.get(0);
                if (groupStr.length() == s.length()) {
                    boolean matched = true;
                    int[] arr = new int[26];
                    int[] arrGroup = new int[26];
                    for (int i = 0; i < s.length(); i++) {
                        arr[s.charAt(i) - 'a']++;
                    }
                    for (int i = 0; i < groupStr.length(); i++) {
                        arrGroup[groupStr.charAt(i) - 'a']++;
                    }
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] != arrGroup[i]) matched = false;
                    }
                    if (matched) {
                        hasGroup = true;
                        group.add(s);
                    }
                }
            }
            if (!hasGroup) {
                List<String> group = new ArrayList<>();
                group.add(s);
                groups.add(group);
            }
        }
        return groups;
    }
}
