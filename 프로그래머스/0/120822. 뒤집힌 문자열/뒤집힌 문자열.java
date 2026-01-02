class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        char[]array = my_string.toCharArray();
        char[]reverse = new char[array.length];
        
        for(int i=0; i< array.length; i++){
            reverse[i] = array[array.length-i-1];
        }
        
        
        answer = new String(reverse);
        
        return answer;
    }
}