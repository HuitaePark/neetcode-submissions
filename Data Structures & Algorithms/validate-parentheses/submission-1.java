class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        boolean isValid = true;
        for(int i=0;i<s.length();i++){
            char current = s.charAt(i);

            if(stack.isEmpty()){
                if(current==']' || current=='}' || current==')') return false;
                else stack.push(current);
            }
            else{
                if(stack.peek()=='('){
                    if(current=='}' || current==']') return false;
                    else if(current==')') stack.pop();
                    else stack.push(current);
                }
                else if(stack.peek()=='{'){
                    if(current==')' || current==']') return false;
                    else if(current=='}') stack.pop();
                    else stack.push(current);
                }
                else if(stack.peek()=='['){
                    if(current==')' || current=='}') return false;
                    else if(current==']') stack.pop();
                    else stack.push(current);
                }
            }
        }

        return stack.isEmpty()? isValid : !isValid;
    }
}
