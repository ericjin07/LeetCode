package array.numberOfProvinces;

public class NumberOfProvinces {

    public int findCircleNum(int[][] isConnected) {
        int cnt = 0;
        boolean[] visited = new boolean[isConnected.length];
        for (int i = 0; i < isConnected.length; i++) {
            if (!visited[i]) {
                dsf(isConnected, i, visited);
                cnt++;
            }

        }
        return cnt;
    }

    private void dsf(int [][] isConnected, int i, boolean[] visited) {
        visited[i] = true;
        for (int j = 0; j < isConnected.length; j++) {
            if (!visited[j] && isConnected[i][j] == 1) {
                dsf(isConnected, j, visited);
            }
        }
    }
}
