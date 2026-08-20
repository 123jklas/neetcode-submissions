class Solution {

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();
        for (String s : strs){
            builder.append(s.length()).append("#").append(s);
        }
        String result = builder.toString();
        return result;
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int j = 0;
        while (j < str.length()){
            int delimeter = str.indexOf("#", j);
            int length = Integer.parseInt(str.substring(j, delimeter));
            j = delimeter + 1;
            result.add(str.substring(j,j+length));
            j+=length;
        }
        return result;
    }
}
