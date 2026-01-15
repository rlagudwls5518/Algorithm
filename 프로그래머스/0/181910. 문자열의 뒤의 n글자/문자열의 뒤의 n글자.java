class Solution {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        char[] charArr = my_string.toCharArray();
        for(int i = charArr.length-n; i<charArr.length; i++){
            answer.append(charArr[i]);
        }
        
        return answer.toString();
    }
}