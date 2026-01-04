class Solution {
    public int solution(int[] box, int n) {
        
        int garo = box[0]/n;
        int sero = box[1]/n;
        int height = box[2]/n;
        int answer = garo * sero * height;
            
        return answer;
    }
}