class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String current = strs[i];
            int sum =0;
            for(int j=0;j<current.length();j++){
                sum+=current.charAt(j)-'a';
            }
            String sums = Integer.toString(sum);
            if(!map.containsKey(sums)){
                map.put(sums,new ArrayList<>());
                map.get(sums).add(current);
            }
            else{
                map.get(sums).add(current);
            }
        }

        List<List<String>> list = new ArrayList<>();
        for(String i : map.keySet()){
            List<String> currentList = new ArrayList<>();
            for(String s : map.get(i)){
                currentList.add(s);
            }
            list.add(currentList);
        }
        Collections.sort(list,(a,b)->a.size()-b.size());
        return list;
    }
}
