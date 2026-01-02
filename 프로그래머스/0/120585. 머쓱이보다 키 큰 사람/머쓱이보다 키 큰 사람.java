class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        
        for(int student : array){
            if( height < student){
                answer++;
            }
        }
        return answer;
    }
}