class Solution {
    public String[] sortPeople(String[] n, int[] h) {
        for(int i = 0; i < h.length; i++){
            int max = i;
            for(int j = i + 1; j < h.length; j++){
                if(h[max] < h[j]){
                    max = j;
                }
            }
            if(max != i){
                int temp = h[i];
                String name = n[i];
                h[i] = h[max];
                n[i] = n[max];
                h[max] = temp;
                n[max] = name;
            }
        }
        return n;
    }
}