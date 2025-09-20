class Solution {
    public String destCity(List<List<String>> paths) {
        for(List<String> p : paths){
            String temp = p.get(1);
            boolean found = false;
            for(List<String> s : paths){
               if(temp.equals(s.get(0))){
                found = true;
               }
            }
            if(!found){
                return temp;
            }
        }
        return " ";
    }
}