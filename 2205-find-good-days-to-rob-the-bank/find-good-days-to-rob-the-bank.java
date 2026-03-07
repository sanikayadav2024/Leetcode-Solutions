class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        List<Integer> list = new ArrayList<>();
        int n = security.length;

        if(time == 0){
            for(int i = 0; i < n; i++){
                list.add(i);
            }
            return list;
        }

        int[] pref = new int[n];
        int[] suff = new int[n];

        for(int i = 1; i < n; i++){
            if(security[i] <= security[i-1]){
                pref[i] = pref[i-1] + 1;
            }
        }
        for(int i = n - 2; i >= 0; i--){
            if(security[i] <= security[i+1]){
                suff[i] = suff[i+1] + 1;
            }
        }

        for(int i = time; i < n - time; i++){
            if(pref[i] >= time && suff[i] >= time){
                list.add(i);
            }
        }
        return list;
    }
}