class Solution {
    public int minDeletionSize(String[] strs) {
       int m = strs.length;
       int n = strs[0].length();
       int ans = 0;

       String[] curr = new String[m];
       for(int j = 0; j < n; j++){
        String[] curr2 = Arrays.copyOf(curr, m);
        for(int i = 0; i < m; ++i){
          curr2[i] += strs[i].charAt(j);
        }
        if(isSorted(curr2)) curr = curr2;

        else ans++;
       }
       return ans;
    }

    public boolean isSorted(String[] A){
        for(int i = 0; i < A.length - 1; ++i){
            if(A[i].compareTo(A[i + 1]) > 0){
                return false;
            }
        }
        return true;
    }
}