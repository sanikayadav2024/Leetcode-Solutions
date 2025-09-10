class Solution {
    public String[] sortPeople(String[] n, int[] h) {
        // for(int i = 0; i < h.length; i++){
        //     int max = i;
        //     for(int j = i + 1; j < h.length; j++){
        //         if(h[max] < h[j]){
        //             max = j;
        //         }
        //     }
        //     if(max != i){
        //         int temp = h[i];
        //         String name = n[i];
        //         h[i] = h[max];
        //         n[i] = n[max];
        //         h[max] = temp;
        //         n[max] = name;
        //     }
        // }
        // return n;

        HashMap<Integer, String> map = new HashMap<>();

        for(int i = 0; i < h.length; i++){
            map.put(h[i], n[i]);
        }

        Arrays.sort(h);
        int j = 0;

        for(int i = h.length - 1; i >= 0; i--){
            n[j++] = map.get(h[i]);
        }
        return n;
    }
}