class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        List<Integer> lt = new ArrayList<>();
        int i = 0;
        int cnt = 0;

        while(i < arr.length){
            int j = i;
            while(j + 1 < arr.length && arr[j + 1] == arr[j]){
                j++;
            }
            int freq = j - i + 1;
            if(!lt.contains(freq)) lt.add(freq);
            cnt++;
            i = j + 1;
        }
        return lt.size() == cnt;
    }
}