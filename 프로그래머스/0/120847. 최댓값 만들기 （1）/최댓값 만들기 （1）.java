import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        
        int max = numbers[numbers.length-1];
        int second = numbers[numbers.length-2];
        
        answer = max * second;
        return answer;
    }
}