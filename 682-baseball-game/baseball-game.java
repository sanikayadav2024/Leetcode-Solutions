class Solution {
    public int calPoints(String[] operations) {
      Stack<Integer> stack = new Stack<>();

      for(String op : operations){
        if(op.equals("C")){
            if(!stack.isEmpty()){
                stack.pop();
            }
        }

        else if (op.equals("D")) {
                if (!stack.isEmpty()) {
                    int lastScore = stack.peek();
                    stack.push(2 * lastScore);
                }
        }
        
        else if( op.equals("+")){
            if(stack.size() >= 2){
             int last = stack.pop();
             int slast = stack.peek();
             int curr = last + slast;
             stack.push(last);
             stack.push(curr);
            }
        }  
        else{
            int score = Integer.parseInt(op);
            stack.push(score);
        }
      }
       int total = 0;
       for (int score : stack) {
            total += score;
       }
       return total;
    }
}