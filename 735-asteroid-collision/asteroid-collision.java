class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < a.length; i++) {
            int curr = a[i];
            while (!stack.isEmpty() && stack.peek() > 0 && curr < 0) {
                if (stack.peek() < -curr) {
                    stack.pop();
                } else if (-curr == stack.peek()) {
                    stack.pop();
                    curr = 0;
                    break;
                } else {
                    curr = 0;
                    break;
                }
            }
            if (curr != 0) {
                stack.push(curr);
            }
        }

        int ans[] = new int[stack.size()];
        for (int i = ans.length-1; i >= 0; i--) {
            ans[i] = stack.pop();
        }
        return ans;
    }
}