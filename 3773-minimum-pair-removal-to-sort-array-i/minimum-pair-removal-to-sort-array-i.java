class Solution {
    public int minimumPairRemoval(int[] nums) {
       List<Integer> list = new ArrayList<>();
       for(int i : nums){
        list.add(i);
       }

       int ops = 0;
       while(!isSorted(list)){
           int pos = minPair(list);
           mergePair(list, pos);
           ops++; 
       }
       return ops;

    }

    private void mergePair(List<Integer> list, int pos){
        list.set(pos, list.get(pos) + list.get(pos+1));
        list.remove(pos+1);
    }
    private boolean isSorted(List<Integer> list){
        for(int i = 0; i < list.size() - 1; i++){
            if(list.get(i) > list.get(i+1)){
                return false;
            }
        }
        return true;
    }

    private int minPair(List<Integer> list){
        int min = Integer.MAX_VALUE;
        int m = -1;
        for(int i = 0; i < list.size() - 1; i++){
            int sum = list.get(i) + list.get(i+1);
            if(sum < min){
                min = sum;
                m = i;
            }
        }
        return m;
    }
}