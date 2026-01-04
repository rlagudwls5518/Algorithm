import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String subStr = my_string.toLowerCase();
        
        
        char[] charArr = subStr.toCharArray(); 
        Arrays.sort(charArr); 

        answer = new String(charArr); 
        
        
        return answer;
    }
}