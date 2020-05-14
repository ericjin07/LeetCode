package tree.implementTrie;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

        /** Initialize your data structure here. */
        public Trie() {
            root = new TrieNode();
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            TrieNode cur = root;
            for (int i = 0; i < word.length(); i++) {
                if (cur.child[word.charAt(i) - 'a'] == null) {
                    cur.child[word.charAt(i) - 'a'] =  new TrieNode();
                }
                cur = cur.child[word.charAt(i) - 'a'];
            }
            cur.isLeaf = true;
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            TrieNode cur = root;
            for (int i = 0; i < word.length(); i++) {
                cur = cur.child[word.charAt(i) - 'a'];
                if (cur == null) return false;
            }
            return cur.isLeaf;
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            TrieNode cur = root;
            for (int i = 0; i < prefix.length(); i++) {
                cur = cur.child[prefix.charAt(i) - 'a'];
                if (cur == null) return false;
            }
            return true;
        }

        class TrieNode {
            boolean isLeaf;
            TrieNode[] child;

            public TrieNode() {
                this.child = new TrieNode[26];
            }
        }
    }
}
