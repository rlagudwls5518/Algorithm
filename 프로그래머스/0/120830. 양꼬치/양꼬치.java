class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int serviceDrink = 0;
        int meatAmount = n*12000;
        
        if(n>9){
         serviceDrink = n/10;   
        }
        
        int drinkAmount = (k - serviceDrink) * 2000;
        
        answer = drinkAmount + meatAmount;
        return answer;
    }
}