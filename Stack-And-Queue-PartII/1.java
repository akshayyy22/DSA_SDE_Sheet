class Solution {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
       Stack<Integer> stack = new Stack<>();
       ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < A.size(); i++) {
            int val = A.get(i);

            while (!stack.isEmpty() && stack.peek() >= val) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                result.add(stack.peek());
            } else {
                result.add(-1);
            }

            stack.push(val);
        }

        return result;
    }
}
