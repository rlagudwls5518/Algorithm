class Solution {
    public int solution(int n, String control) {
        int answer = n;
        String[] c = control.split("");
        for(String str : c){
            if(str.equals("w")){
                answer++;
            }
            if(str.equals("s")){
                answer--;
            }
            if(str.equals("d")){
                answer+=10;
            }
            if(str.equals("a")){
                answer-=10;
            }
        }
        return answer;
    }
}