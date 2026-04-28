class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0'&&s.charAt(i)<='9') sb.append(s.charAt(i));
            else if(s.charAt(i)>='a'&&s.charAt(i)<='z') sb.append(s.charAt(i));
        }
        
        String str = sb.toString();
        int start = 0;
        int end = str.length()-1;

        while(start<=end){
            if(str.charAt(start)!=str.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
