package datastructure.trie;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 07/14/2020 9:17 AM
 */
public class Trie {

    class TrieNode {
        char data;
        TrieNode[] children = new TrieNode[26];
        boolean isEndChild;

        public TrieNode(char data) {
            this.data = data;
        }
    }

    private TrieNode root = new TrieNode('/');
    public void insert(String str) {
        TrieNode p = root;
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            if (p.children[a - 'a'] == null) {
                TrieNode child = new TrieNode(a);
                p.children[a - 'a'] = child;
            }
            p = p.children[a - 'a'];
        }
        p.isEndChild = true;
    }

    public boolean find(String pattern) {
        TrieNode p = root;
        for (int i = 0; i < pattern.length(); i++) {
            char a = pattern.charAt(i);
            if (p.children[a - 'a'] == null) {
                return false;
            }
            p = p.children[a - 'a'];
        }
        return p.isEndChild;
    }

}
