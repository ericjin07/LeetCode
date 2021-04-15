package tree.implementTrie;

public class Trie {

    Trie[] tries ;
    boolean isLeaf;

    /** Initialize your data structure here. */
    public Trie() {
        tries = new Trie[26];
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        Trie cur = this;
        char[] chars = word.toCharArray();
        for (char c : chars) {
            int index = c - 'a';
            if (cur.tries[index] == null) {
                cur.tries[index] = new Trie();
            }
            cur = cur.tries[index];
        }
        cur.isLeaf = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Trie node = searchPrefix(word);
        return node != null && node.isLeaf;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        return searchPrefix(prefix) != null;
    }

    private Trie searchPrefix(String word) {
        Trie node = this;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (node.tries[index] == null) {
                return null;
            }
            node = node.tries[index];
        }
        return node;
    }
}
