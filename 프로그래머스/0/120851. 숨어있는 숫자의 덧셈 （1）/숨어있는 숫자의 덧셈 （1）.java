class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String str = my_string.replaceAll("[a-zA-Z]", "");
        String[] strarr = str.split("");
        
        for(String num : strarr){
            answer += Integer.parseInt(num);
        }
        return answer;
    }
}