class Solution {
    public int distributeCandies(int[] candyType) {
        Map<Integer, Integer> hash = new HashMap<>();

        for(int candy : candyType){
            hash.put(candy,hash.getOrDefault(candy, 0) + 1);
        }
        int n = candyType.length / 2;
        if(hash.size() > n) return n;
        if(hash.size() < n) return hash.size();
        return n;
    }
}