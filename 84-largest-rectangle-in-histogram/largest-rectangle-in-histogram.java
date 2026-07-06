class Solution {
    public int largestRectangleArea(int[] h) {
        ArrayList<Integer> prev = prevSmaller(h);
        ArrayList<Integer> next = nextSmallerEle(h);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < h.length; i++) {
            max = Math.max(max, (next.get(i) - prev.get(i) - 1) * h[i]);
        }
        return max;
    }

    public static ArrayList<Integer> nextSmallerEle(int[] arr) {

        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (st.isEmpty())
                ans.add(n);
            else
                ans.add(st.peek());

            st.push(i);
        }

        Collections.reverse(ans);
        return ans;
    }

    public static ArrayList<Integer> prevSmaller(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (st.isEmpty())
                ans.add(-1);
            else
                ans.add(st.peek());

            st.push(i);
        }

        return ans;
    }
}