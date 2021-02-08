package dynamicProgram.longestTurbulentSubarray;

public class LongestTurbulentSubarray {

    public int maxTurbulenceSize(int[] arr) {
        int len = arr.length;
        if (len <= 1) return len;

        int incr = 1, decr = 1;

        int maxCount = 1;
        for (int i = 1; i < len; i++) {
            if (arr[i] > arr[i-1]) {
                incr = decr + 1;
                decr = 1;
            } else if (arr[i] < arr[i-1]){
                decr = incr + 1;
                incr = 1;
            } else {
                incr = decr = 1;
            }
            maxCount = Math.max(maxCount, Math.max(incr, decr));
        }
        return maxCount;
    }
}
