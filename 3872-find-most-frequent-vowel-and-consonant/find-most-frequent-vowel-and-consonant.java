class Solution {
    public int maxFreqSum(String s) {
        Map<Character, Integer> freqVowel = new HashMap<>();
        Map<Character, Integer> freqConst = new HashMap<>();
        for (char c : s.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                freqVowel.put(c, freqVowel.getOrDefault(c, 0) + 1);
            } else {
                freqConst.put(c, freqConst.getOrDefault(c, 0) + 1);
            }
        }
       int maxV = 0; // default = 0 if no vowels
        if (!freqVowel.isEmpty()) {
            maxV = Collections.max(freqVowel.values());
        }

        int maxC = 0; // default = 0 if no consonants
        if (!freqConst.isEmpty()) {
            maxC = Collections.max(freqConst.values());
        }

        return maxV + maxC;
           }
}