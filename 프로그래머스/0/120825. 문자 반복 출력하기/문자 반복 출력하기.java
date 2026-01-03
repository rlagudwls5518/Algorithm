class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        char[]my_char = my_string.toCharArray();
        for(char c : my_char){
            for(int i=0; i<n; i++){
                answer+=c;
            }
        }
        
        return answer;
    }
}