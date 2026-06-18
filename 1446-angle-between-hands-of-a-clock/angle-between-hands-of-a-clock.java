class Solution {
    public double angleClock(int hour, int minutes) {
        double angle1 = 6 * minutes;
        double angle2 = (30*hour) + (0.5*minutes);
        double first = Math.abs(angle2 - angle1);
        double second = 360 - first;
        return Math.min(first, second);
    }
}