class Solution {
    public int uniqueMorseRepresentations(String[] words) {
       String[] code = {".-","-...","-.-.","-..",".",
                        "..-.","--.","....","..",".---",
                        "-.-",".-..","--","-.","---",".--.",
                        "--.-",".-.","...","-","..-",
                        "...-",".--","-..-","-.--","--.."}; 
        
        Set<String> codes = new HashSet<>();

       for(String word : words){
          StringBuffer sb = new StringBuffer();
          for(char c : word.toUpperCase().toCharArray()){
            sb.append(code[(c - 'A')]);
          }

          codes.add(sb.toString());
       }
       return codes.size();
    }
}