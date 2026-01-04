import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        
        
        String str = my_string.replaceAll("[a-z]", "");
        String[] nums = str.split("");
        
        int[] answer = new int[nums.length];
        for(int i = 0; i < nums.length; i++ ){
            answer[i] = Integer.parseInt(nums[i]);
        }
        Arrays.sort(answer);
        return answer;
    }
}