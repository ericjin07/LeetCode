package backtracking.knapsack;

public class Knapsack {

    private int MAX_VALUE = Integer.MIN_VALUE;
    private int w = 9;
    private int n = 5;
    private int[] weight = {1, 5, 5, 7, 3}; // 物品重量
    //对于一组同重量、不可分割的物品，我们需要选择一些装入背包，在满足背包最大重量限制的前提下，背包中物品总重量的最大值是多少呢？
    //cw weight of the package now
    //w the max weight the package can put
    //n the number of the goods
    public void knapsack(int i, int cw) {
        if (cw == w || i == n) {    //cw==w表示装满了，i==n表示物品都考察完了
            if (cw > MAX_VALUE) MAX_VALUE = cw;
            return;
        }
        knapsack(i + 1, cw);    // don't put the i
        if (cw + weight[i] <= w) {
            knapsack(i+1, cw + weight[i]); // put the ith into pack
        }
    }

    private int[] value = {3,4,8,9,6}; // 物品的价值
    // add value to the goods
    public void knapsack_high(int i, int cw, int cv) {
        if (cw == w || i == n) {    //cw==w表示装满了，i==n表示物品都考察完了
            if (cv > MAX_VALUE) MAX_VALUE = cv;
            return;
        }
        knapsack_high(i + 1, cw, cv);    // don't put the i
        if (cw + weight[i] <= w) {
            knapsack_high(i+1, cw + weight[i], cv + value[i]); // put the ith into pack
        }
    }


    public static void main(String[] args) {
        Knapsack knapsack = new Knapsack();
        knapsack.knapsack(0, 0);
        System.out.println(knapsack.MAX_VALUE);
    }
}
