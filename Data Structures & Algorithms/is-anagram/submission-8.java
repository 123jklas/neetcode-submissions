class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> ana = new HashMap<>();
        Map<Character, Integer> gram = new HashMap<>();
        int k=0;
        for (int i=0; i<s.length(); i++){
            if (ana.containsKey(s.charAt(i))){
                k = ana.get(s.charAt(i));
                k++;
                ana.put(s.charAt(i),k);
            } else {
                ana.put(s.charAt(i),0);
            } 
        }
        for (int i=0; i<t.length(); i++){
            if (gram.containsKey(t.charAt(i))){
                k = gram.get(t.charAt(i));
                k++;
                gram.put(t.charAt(i),k);
            } else {
                gram.put(t.charAt(i),0);
            } 
        }
        return ana.equals(gram);
    }
}
