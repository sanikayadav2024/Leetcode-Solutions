class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(!stack.isEmpty()){
                char last = stack.peek();
                if(isValid(ch, last)){
                    stack.pop();
                    continue;
                }
            }
            stack.push(ch);
        }
        return stack.isEmpty();
    }

    private boolean isValid(char curr, char last){
        return (curr == ')' && last == '(') || (curr == ']' && last == '[') || (curr == '}' && last == '{');
    }
}