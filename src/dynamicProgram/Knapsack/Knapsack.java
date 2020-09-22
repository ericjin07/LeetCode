package dynamicProgram.Knapsack;

public class Knapsack {

    //weight:物品重量，n:物品个数，w:背包可承载重量
    public int knapsack(int [] weights, int n, int w) {
        boolean [][] state = new boolean[n][w+1];
        state[0][0] = true;
        if (weights[0] <= w) {
            state[0][weights[0]] = true;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= w; j++) { // 不把第i个物品放入背包
                if (state[i-1][j]) state[i][j] = true;
            }
            for (int j = 0; j <= w - weights[i]; j++) { //把第i个物品放入背包
                if (state[i-1][j]) state[i][j+weights[i]] = true;
            }
        }

        for (int i = w; i >= 0; i--) {
            if (state[n-1][i]) return i;
        }
        return 0;
    }

    //weight:物品重量，n:物品个数，w:背包可承载重量
    public int knapsack_improve(int [] weights, int n, int w) {
        boolean [] state = new boolean[w+1];
        state[0] = true;
        if (weights[0] <= w) {
            state[weights[0]] = true;
        }
        for (int i = 1; i < n; i++) {
            for (int j = w - weights[i]; j >=0 ; j--) { //把第i个物品放入背包
                if (state[j]) state[j+weights[i]] = true;
            }
        }

        for (int i = w; i >= 0; i--) {
            if (state[i]) return i;
        }
        return 0;
    }

    //weight:物品重量，n:物品个数，w:背包可承载重量
    //values:
    public int knapsack_high(int [] weights, int [] values, int n, int w) {
        int [][] state = new int[n][w+1];
        for (int i = 0; i < n; i++) {   //init the state
            for (int j = 0; j < w + 1; j++) {
                state[i][j] = -1;
            }
        }
        state[0][0] = 0;    // not put the first one
        if (weights[0] <= w) {
            state[0][weights[0]] = values[0]; // put the first one
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= w; j++) {   //donot put the ith
                if (state[i-1][j] > -1) state[i][j] = state[i-1][j];
            }
            for (int j = 0; j <= w - weights[i]; j++) { //把第i个物品放入背包
                if (state[i-1][j] > -1) {
                    int value = state[i-1][j] + values[i];
                    if (value > state[i][j+weights[i]]) {
                        state[i][j + weights[i]] = value;
                    }
                }
            }
        }

        int max = Integer.MIN_VALUE;
        int maxW = Integer.MIN_VALUE;
        for (int i = 0; i <= w; i++) {
            if (state[n-1][i] > max)  {
                max = state[n-1][i];
                maxW = i;
            }
        }
        System.out.println("knapsack_high::max weight = " + maxW);
        return max;
    }


    //weight:物品重量，n:物品个数，w:背包可承载重量
    //values:
    public int knapsack_high_imprv(int [] weights, int [] values, int n, int w) {
        int [] state = new int[w+1];
        //init the state
        for (int j = 0; j < w + 1; j++) {
            state[j] = -1;
        }

        state[0] = 0;    // not put the first one
        if (weights[0] <= w) {
            state[weights[0]] = values[0]; // put the first one
        }
        for (int i = 1; i < n; i++) {
            for (int j = w - weights[i]; j >= 0; j--) { //把第i个物品放入背包
                if (state[j] > -1) {
                    int value = state[j] + values[i];
                    if (value > state[j+weights[i]]) {
                        state[j + weights[i]] = value;
                    }
                }
            }
        }

        int max = Integer.MIN_VALUE;
        int maxW = Integer.MIN_VALUE;
        for (int i = 0; i <= w; i++) {
            if (state[i] > max)  {
                max = state[i];
                maxW = i;
            }
        }
        System.out.println("knapsack_high_imprv::max weight = " + maxW);
        return max;
    }

    public static void main(String[] args) {
        Knapsack knapsack = new Knapsack();
        int[] weight = {5, 1, 5, 1, 3}; // 物品重量
        int[] values = {5, 1, 5, 100, 3}; // 物品value
        int i = knapsack.knapsack(weight, 5, 16);
        int j = knapsack.knapsack_improve(weight, 5, 16);
        System.out.println(i);
        System.out.println(j);
        int k = knapsack.knapsack_high(weight, values, 5, 16);
        int d = knapsack.knapsack_high_imprv(weight, values, 5, 16);
        System.out.println(k);
        System.out.println(d);
    }
}
