class Solution {
    public boolean isAnagram(String s, String t) {
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char current = s.charAt(i);
            list1.add(current);
        }
        for(int i=0;i<t.length();i++){
            char current = t.charAt(i);
            list2.add(current);
        }
        Collections.sort(list1);
        Collections.sort(list2);
        
        for(int i=0;i<list1.size();i++){
            if(list1.get(i)!=list2.get(i)) return false;
        }
        return true;
    }
}
