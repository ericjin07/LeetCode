package tree.implementTrie;


/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 05/14/2020 8:40 PM
 *
 * Implement a trie with insert, search, and startsWith methods.
 *
 * Example:
 *
 * Trie trie = new Trie();
 *
 * trie.insert("apple");
 * trie.search("apple");   // returns true
 * trie.search("app");     // returns false
 * trie.startsWith("app"); // returns true
 * trie.insert("app");
 * trie.search("app");     // returns true
 * Note:
 *
 * You may assume that all inputs are consist of lowercase letters a-z.
 * All inputs are guaranteed to be non-empty strings.
 */
public class ImplementTrie {

    class Trie {

        TrieNode root;
        class TrieNode {
            TrieNode[] child;
            boolean isLeaf;

            public TrieNode() {
                this.child = new TrieNode[26];
                this.isLeaf = false;
            }
        }

        /** Initialize your data structure here. */
        public Trie() {
            root = new TrieNode();
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            TrieNode cur = root;
            int len = word.length();
            for (int i = 0; i < len; i++) {
                int index = word.charAt(i) - 'a';
                if (cur.child[index] == null) {
                    cur.child[index] = new TrieNode();
                }
                cur = cur.child[index];
            }
            cur.isLeaf = true;
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            TrieNode cur = root;
            int len = word.length();
            for (int i = 0; i < len; i++) {
                int index = word.charAt(i) - 'a';
                if ((cur = cur.child[index]) == null) {
                    return false;
                }
            }
            return cur.isLeaf;
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            TrieNode cur = root;
            int len = prefix.length();
            for (int i = 0; i < len; i++) {
                int index = prefix.charAt(i) - 'a';
                if ((cur = cur.child[index]) == null) {
                    return false;
                }
            }
            return true;
        }
    }
}
