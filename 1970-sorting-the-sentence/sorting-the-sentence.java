class Solution {
    public String sortSentence(String s) {
      String[] word = s.split(" ");
      String[] res = new String[word.length];
      StringBuilder sb = new StringBuilder();
      int i = 0;

      for(String w: word){
        i = (int) (w.charAt(w.length() - 1) - '0');
        res[i - 1] = w.substring(0, w.length() - 1);
      }

      for(i = 0; i < res.length - 1; i++){
        sb.append(res[i]).append(" ");
      }
      sb.append(res[i]);

      return sb.toString();
    }
}