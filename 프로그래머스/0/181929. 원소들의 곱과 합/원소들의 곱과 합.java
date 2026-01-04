class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mul = 1;
        int add = 0;
        for(int num : num_list){
            mul *= num;
        }
        for(int num : num_list){
            add += num;
        }
        
        if(mul < Math.pow(add,2)){
            answer = 1;
        }
        else{
            answer = 0;
        }
        
        return answer;
    }
}