class Solution {
    public String reverseWords(String s) {
       StringBuilder sb = new StringBuilder();

       for(int i = s.length()-1; i >= 0; i--){
        if(s.charAt(i) == ' ') continue;

        int j = i - 1;
        while(j >= 0 && s.charAt(j) != ' '){
            j--;
        }
       
        sb.append(s.substring(j+1, i+1) + " ");
        i = j;
       } 
       return sb.toString().trim();
    }
}