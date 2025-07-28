class Solution {
    public int longestPalindrome(String s) {
       int count[]=new int[52];
       for(char ch:s.toCharArray()){
        if(Character.isLowerCase(ch)){
            count[ch-'a']++;
        }
        else{
           count[ch-'A'+26]++;
        } 
       } 
       int odd=0;
       for(int i=0;i<count.length;i++){
        if(count[i]%2 == 1){
        odd++;
        }
       }
       if(odd>1){
        return s.length()-odd+1;
       }
       return s.length();
  }
}