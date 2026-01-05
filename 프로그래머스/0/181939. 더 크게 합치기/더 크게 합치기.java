class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String astr = Integer.toString(a);
        String bstr = Integer.toString(b);
        
        String sum1 = astr+bstr;
        String sum2 = bstr+astr;
        
        if(Integer.parseInt(sum1)>Integer.parseInt(sum2)){
            answer = Integer.parseInt(sum1);
        }
        else{
            answer = Integer.parseInt(sum2);
        }
        
        return answer;
    }
}