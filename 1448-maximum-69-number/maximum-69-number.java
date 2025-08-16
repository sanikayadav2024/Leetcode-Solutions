class Solution {
    public int maximum69Number (int num) {
         String numString = String.valueOf(num);
         StringBuilder sb = new StringBuilder(numString);
         for(int i = 0; i < sb.length(); i++){
            if(sb.charAt(i) == '6'){
                sb.setCharAt(i,'9');
                break;
            }
         }
         int modifiedNumber = Integer.parseInt(sb.toString());
          return modifiedNumber;
    }
}