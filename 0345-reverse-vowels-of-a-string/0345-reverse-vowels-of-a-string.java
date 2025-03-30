class Solution {
    public String reverseVowels(String s) {
        List<Character> list=new ArrayList<Character>();
        int n=s.length(),ind=0;
        while(ind<n){
            char ch=s.charAt(ind);
            if(ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U' ||ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){
                list.add(ch);
            }
            ind++;
        }
        Collections.reverse(list);
        int in=0,revIndd=0;
        String s1="";
        while(in<n){
            char ch=s.charAt(in);
            if(ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U' ||ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){
                s1+=list.get(revIndd);
                revIndd++;
            }
            else{
                s1+=ch;
            }
            in++;
        }
        return s1;
    }
}