public class Solution {
    public char findTheDifference(String s, String t) {
        int res = 0;

        // XOR all characters in both strings
        for (int i = 0; i < s.length(); i++) {
            res ^= s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            res ^= t.charAt(i);
        }

        // Convert the final result back to a character
        return (char) res;
    }
}
