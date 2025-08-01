#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(long num) {
    int answer = 0;
    
    while (num != 1){
        if (answer == 500){
            return -1;
        }
        num = (num % 2 == 0) ? num / 2 : num * 3 + 1;
        answer++;
    }
    
    return answer;
}