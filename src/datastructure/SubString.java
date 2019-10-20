package datastructure;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 10/08/2018 2:56 PM
 */
public class SubString {

    public static int index(String s, String t, int pos) {
        int i = pos-1;
        int j = 0;
        int sLen = s.length();
        int tLen = t.length();

        char sArr[] = s.toCharArray();
        char tArr[] = t.toCharArray();


        while (i <= sLen-1 && j <= tLen-1) {
            if (sArr[i] == tArr[j]){
                i++;
                j++;
            } else {
                i = i-j + 1;
                j = 0;
            }
        }
        System.out.println(i + "---" + j);
        System.out.println(sLen + "---" + tLen);
        if (j >= tLen)
            return i - tLen;
        else
            return 0;

    }

    public static void main(String[] args) {
        for (int i = 0; i< 100; i++) {
            System.out.println("小仙女你一定会做个美梦");
        }
    }
}
