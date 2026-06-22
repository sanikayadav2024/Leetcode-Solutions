class Solution {
    public int maxNumberOfBalloons(String text) {
        int b = 0;
        int a = 0;
        int l = 0;
        int o = 0;
        int n = 0;
        for(char ch : text.toCharArray()){
            switch(ch){
                case 'b':b++;break;
                case 'a':a++;break;
                case 'l':l++;break;
                case 'o':o++;break;
                case 'n':n++;break;
            }
        }
        int abMin = Math.min(a,b);
        int loMin = Math.min(l/2, o/2);
        int nloMin = Math.min(loMin, n);
        return Math.min(abMin, nloMin);
    }
}