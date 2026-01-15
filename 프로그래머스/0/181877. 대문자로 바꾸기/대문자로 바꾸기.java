class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] charArr = myString.toCharArray();
        for(int i =0; i< charArr.length; i++){
            if('a'<= charArr[i] && 'z'>= charArr[i]){
                charArr[i] -= 32;
            }
        }
        answer = String.valueOf(charArr);
        return answer;
    }
}