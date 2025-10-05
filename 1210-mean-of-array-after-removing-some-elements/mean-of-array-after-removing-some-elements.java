class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int five = (n * 5) / 100;
        int sum = 0;
        for(int i = five; i < n - five; i++){
            sum = sum + arr[i];
        }
        double avg = (double) sum / (n - 2*five);
        return avg;
    }
}