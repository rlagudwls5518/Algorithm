class Solution {
    public int solution(int hp) {
        
        int generalAnt = 5;
        int soldierAnt = 3;
        int ant = 1;
        
        int answer = hp / generalAnt + (hp % generalAnt)/soldierAnt + 
            (hp % generalAnt)%soldierAnt;
        
        
        return answer;
    }
}