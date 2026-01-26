class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minAbs = Integer.MAX_VALUE;
        int n = arr.length;
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 1; i < n; i++){
            int diff = arr[i] - arr[i - 1];
            if(diff < minAbs){
                minAbs = diff;
                list = new ArrayList<>();
                list.add(Arrays.asList(arr[i-1], arr[i]));
            }
            else if( diff == minAbs){
                list.add(Arrays.asList(arr[i-1], arr[i]));
            }
        }

        return list;
    }
}