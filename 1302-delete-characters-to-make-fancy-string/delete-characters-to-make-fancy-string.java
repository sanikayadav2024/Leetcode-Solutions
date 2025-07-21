class Solution {
    public String makeFancyString(String s) {
        if(s.length() < 3) return s;
         StringBuffer sb = new StringBuffer();
         char[] arr = s.toCharArray();
         sb.append(arr[0]);
         sb.append(arr[1]);
         for(int i = 2; i < arr.length; i++){
            if(arr[i] != arr[i - 1] || arr[i] != arr[i - 2]){
                sb.append(arr[i]);
            }
         }
         String ss = sb.toString();
         return ss;
    }
}