class Solution {
    public int busyStudent(int[] s, int[] e, int q) {
        int student = 0;
        for(int i = 0; i < s.length; i++){
            if(s[i] <= q && e[i] >= q){
                student++;
            }
        }
        return student;
    }
}