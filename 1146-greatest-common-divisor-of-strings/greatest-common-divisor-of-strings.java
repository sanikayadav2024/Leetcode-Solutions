class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1)) return "";

        int idx = 0;
        int i = str1.length();
        int j = str2.length();
        while(j != 0){
            int temp = i % j;
            i = j;
            j = temp;
        }
        idx = i;
        return str2.substring(0,idx);
    }
}