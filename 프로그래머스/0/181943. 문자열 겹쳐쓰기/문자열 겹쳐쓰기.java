class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int len = overwrite_string.length();
        
        answer = my_string.substring(0, s) + overwrite_string + my_string.substring(len + s);
        return answer;
    }
}