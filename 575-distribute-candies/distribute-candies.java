class Solution {
    public int distributeCandies(int[] candyType) {
        Map<Integer, Integer> hash = new HashMap<>();

        for(int candy : candyType){
            hash.put(candy,hash.getOrDefault(candy, 0) + 1);
        }
        int n = candyType.length / 2;
        return Math.min(hash.size(), n);
    }
}