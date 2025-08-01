import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (o1, o2) -> {
            if (o1.charAt(n) != o2.charAt(n)){
                return  o1.charAt(n) - o2.charAt(n);
            }else{
                return o1.compareTo(o2);
            }
        });
        return strings;
    }
}