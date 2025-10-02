class Solution {
    public int maxBottlesDrunk(int full, int ex) {
        int drunk = full;
        while(full >= ex){
            full = full - (ex - 1);
            ex++;
            drunk++;
        }
        return drunk;
    }
}