class Solution {
    public String rearrangeString(String s, char x, char y) {
        boolean isAsc = (x > y);
        char[] ch = s.toCharArray();
        Arrays.sort(ch);

        if(!isAsc){
            int i = 0;
            int j = ch.length - 1;
            while(i < j){
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
        }
        return new String(ch);
    }
}