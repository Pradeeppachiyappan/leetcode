class Solution {
    public String minRemoveToMakeValid(String s) {

        StringBuilder sb=new StringBuilder(s);
        Stack<Integer> open = new Stack<>();
        Stack<Integer> close = new Stack<>(); 

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='('){
                open.push(i);
            }
            else if(ch==')'){
                if(open.isEmpty()){
                    close.push(i);
                }else{
                    open.pop();
                }
            }
        }

        while(!open.isEmpty()){
            sb.deleteCharAt(open.pop());
        }

        while(!close.isEmpty()){
            sb.deleteCharAt(close.pop());
        }

        return sb.toString();
    }
}