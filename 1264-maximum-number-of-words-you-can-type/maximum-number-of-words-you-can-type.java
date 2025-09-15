class Solution {
    public int canBeTypedWords(String text, String bl) {
        String[] word = text.split(" ");
        int count = 0;

        for(String str: word){
            boolean isValid = true;
            for(char c : str.toCharArray()){
                if(bl.indexOf(c) != -1){
                    isValid = false;
                    break;
                }
            }
            if(isValid) count++;
        }
        return count;
    }
}