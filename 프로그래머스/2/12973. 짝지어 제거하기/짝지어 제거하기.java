import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if (stack.empty()){
                stack.push(c);
            }else{
                if (c == stack.peek()){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }
        }
        
        return stack.empty() ? 1 : 0;
    }
}