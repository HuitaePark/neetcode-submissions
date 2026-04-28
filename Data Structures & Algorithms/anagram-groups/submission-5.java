class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String current = strs[i];
            char[] arr = current.toCharArray();
            Arrays.sort(arr);
            String sums = new String(arr);
         
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
        return list;
    }
}
