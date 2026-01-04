class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String sum = Integer.toString(a) + Integer.toString(b);
        int dump = a * b * 2;
        
        if(dump > Integer.parseInt(sum)){
            answer = dump;
        }
        if(dump <= Integer.parseInt(sum)){
            answer = Integer.parseInt(sum);
        }
        
        return answer;
    }
}