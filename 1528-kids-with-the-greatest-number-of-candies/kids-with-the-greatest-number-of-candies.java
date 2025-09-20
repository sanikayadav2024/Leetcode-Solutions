class Solution {
    public List<Boolean> kidsWithCandies(int[] candi, int extraCandies) {
        List<Boolean> list = new ArrayList<>();

        int max = candi[0];
        for(int i = 0; i < candi.length; i++){
            if(candi[i] > max){
                max = candi[i];
            }
        }

        for(int i = 0; i < candi.length; i++){
            int sum = candi[i] + extraCandies;
            if(sum >= max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}