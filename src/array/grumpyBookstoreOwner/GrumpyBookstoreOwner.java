package array.grumpyBookstoreOwner;

public class GrumpyBookstoreOwner {

    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int len = customers.length;
        //1. get the all origin satisfied
        int res = 0;
        for (int i = 0; i < len; i++) {
            if (grumpy[i] == 0) {
                res += customers[i];
            }
        }
        //2. get max X length, that the not grumpy method will get how much customers satisfied those who was not satisfied
        int left = 0, maxXs = 0, curSatis = 0;
        for (int i = 0; i < len; i++) {
            curSatis += customers[i] * grumpy[i];
            if (i - left >= X) {
                curSatis -= customers[left] * grumpy[left];
                left++;
            }
            maxXs = Math.max(maxXs, curSatis);
        }
        return res + maxXs;
    }
}
