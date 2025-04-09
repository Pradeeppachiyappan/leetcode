class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<Character>();
        int ind=0;
        if(s.length()%2==1) return false;
        while(ind<s.length()){
            char ch=s.charAt(ind);
            if(ch=='(' || ch=='['||ch=='{') stack.push(ch);
            else{
                if(stack.isEmpty()) return false;
                if(stack.peek()=='(' && ch==')'){
                    stack.pop();
                }
                else if(stack.peek()=='[' && ch==']')
                {
                    stack.pop();
                }
                else if(stack.peek()=='{' && ch=='}'){
                    stack.pop();
                }
                else{
                    stack.push(ch);
                }
            }
            ind++;
        }
        return stack.isEmpty();
    }
}