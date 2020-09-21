package datastructure.randomizedSet;

import java.util.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 06/12/2020 4:29 PM
 */
public class RandomizedSet {

    List<Integer> list;
    Map<Integer, Integer> loc;
    Random random;
    
    /** Initialize your data structure here. */
    public RandomizedSet() {
        list = new ArrayList<>();
        loc = new HashMap<>();
        random = new Random();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (!loc.containsKey(val)) {
            loc.put(val, list.size());
            return list.add(val);
        }
        return false;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (loc.containsKey(val)) {
            int key = loc.get(val);
            if (key < list.size() - 1) {
                int last = list.get(list.size() - 1);
                list.set(key, last);
                loc.put(last, key);
            }
            list.remove(list.size() - 1);
            loc.remove(val);
            return true;
        }
        return false;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
    
}
