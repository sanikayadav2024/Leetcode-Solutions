class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        sub(n,1,ans,res,k);
        return ans;
        
    }
     public static void sub(int n, int idx, List<List<Integer>> ans, List<Integer> res, int k) {
        if(res.size() == k){
            ans.add(new ArrayList<>(res));
            return;
        }
        if(res.size() < k && idx > n){
            return;
        }
        res.add(idx);

        sub(n,idx+1,ans,res,k);
        res.remove(res.size()-1);

        sub(n, idx+1, ans, res, k);
    }
}