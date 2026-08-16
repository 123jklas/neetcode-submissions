class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // strs 하나 넣고 나머지 각각 넣으면서 비교, 같으면 출력 array 생성
        Map<String, List<String>> result = new HashMap<>();
        for (String str : strs){
            char[] key = str.toCharArray();
            Arrays.sort(key);
            String key1 = new String(key);
            if (!result.containsKey(key1)){
                result.put(key1, new ArrayList<>());
                result.get(key1).add(str);
            } else {
                result.get(key1).add(str);
                result.put(key1, result.get(key1));
            }

        }
        return new ArrayList<>(result.values());
    }
}
