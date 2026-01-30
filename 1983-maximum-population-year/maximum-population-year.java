class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] year = new int[101]; // years from 1950 to 2050

        for (int[] log : logs) {
            year[log[0] - 1950]++;   // birth
            year[log[1] - 1950]--;   // death
        }

        int maxPop = 0;
        int currPop = 0;
        int maxYear = 1950;

        for (int i = 0; i < 101; i++) {
            currPop += year[i];
            if (currPop > maxPop) {
                maxPop = currPop;
                maxYear = 1950 + i;
            }
        }

        return maxYear;
    }
}
