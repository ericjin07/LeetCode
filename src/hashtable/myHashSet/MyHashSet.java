package hashtable.myHashSet;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

public class MyHashSet {

    LinkedList<Integer>[] tab;
    int len = 769;

    /** Initialize your data structure here. */
    public MyHashSet() {
        tab = new LinkedList[len];
        for (int i = 0; i < len; i++) {
            tab[i] = new LinkedList<>();
        }
    }

    public void add(int key) {
        if (!contains(key)) {
            int hash = hash(key);
            tab[hash].offerFirst(key);
        }
    }
    private int hash(int key) {
        return Objects.hash(key) % len;
    }

    public void remove(int key) {
        int hash = hash(key);
        Iterator<Integer> iterator = tab[hash].iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next == key) {
                iterator.remove();
                return;
            }
        }
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int hash = hash(key);
        for (Integer integer : tab[hash]) {
            if (integer == key) return true;
        }
        return false;
    }
}
