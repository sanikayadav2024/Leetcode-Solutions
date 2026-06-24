class Solution {
    public int passwordStrength(String password) {
        List<Character> list = new ArrayList<>();
       for(char ch : password.toCharArray()){
          if(!list.contains(ch)){
            list.add(ch);
          }
       } 
       Set<Character> chars = Set.of('!', '@', '#', '$');
       int point = 0;
       for(Character ch : list){
        if((ch >= 'A' && ch <= 'Z')){
            point += 2;
        }
        else if(ch >= 'a' && ch <= 'z'){
            point++;
        }
        else if(Character.isDigit(ch)){
            point += 3;
        }
        else if(chars.contains(ch)){
            point += 5;
        }
       }
       return point;
    }
}