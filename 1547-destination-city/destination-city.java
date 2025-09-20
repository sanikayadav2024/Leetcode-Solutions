class Solution {
    public String destCity(List<List<String>> paths) {
        // for(List<String> p : paths){
        //     String temp = p.get(1);
        //     boolean found = false;
        //     for(List<String> s : paths){
        //        if(temp.equals(s.get(0))){
        //         found = true;
        //        }
        //     }
        //     if(!found){
        //         return temp;
        //     }
        // }

        Set<String> set = new HashSet<>();
        for(List<String> source: paths){
            set.add(source.get(0));
        }
        for(List<String> dest : paths){
            if(!set.contains(dest.get(1))){
                return dest.get(1);
            }
        }
        return " ";
    }
}