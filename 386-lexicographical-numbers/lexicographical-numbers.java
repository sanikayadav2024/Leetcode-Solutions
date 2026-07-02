class Solution {
    public List<Integer> lexicalOrder(int n) {
     List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 9 ; i++) {
            create(list, i, n);
        }
        return list;
    }
    public static void create(List<Integer> res,int i, int n){
        if(i > n){
            return;
        }
        res.add(i);
        if(i*10 > n) return;
        for (int j = 0; j <= 9; j++) {
            int newNum = i*10+j;
            if(newNum > n){
                return;
            }
            create(res,newNum, n);
        }
    }
}
