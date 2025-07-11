class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int mid = total / num;
        
        int first = 1000;
        if (total % num != 0){
            first = mid - (num / 2 - 1);
        }else{
            first = mid - num / 2;
        }
        
        for (int i = 0; i < num; i++){
            answer[i] = first + i;
        }
        
        return answer;
    }
}