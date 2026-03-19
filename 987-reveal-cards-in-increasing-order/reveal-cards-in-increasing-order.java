class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int[] ans = new int[deck.length];

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < deck.length; i++){
            q.add(i);
        }

        for(int card : deck){
            ans[q.poll()] = card;

            if(!q.isEmpty()){
                q.add(q.poll());
            }
        }
        return ans;
    }
}