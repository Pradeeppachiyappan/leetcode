class Solution {

    public String decodeString(String s) {

        Stack<String> str_stack = new Stack<>();
        Stack<Integer> no_stack = new Stack<>();
        StringBuilder ans = new StringBuilder();
        int num = 0;

        for(int i=0;i<s.length();i++){

            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                ans.append(s.charAt(i));
            }
            else if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                num = num * 10 + s.charAt(i) - '0';
            }
            else if(s.charAt(i) == '['){
                no_stack.push(num);
                num = 0;
                str_stack.push(ans.toString());
                ans = new StringBuilder();
            }
            else{
                int n = no_stack.pop();
                StringBuilder temp = new StringBuilder(str_stack.pop());
                for(int j=0;j<n;j++){
                    temp.append(ans.toString());
                }
                ans = temp;
            }
        }
        return ans.toString();
    }
}