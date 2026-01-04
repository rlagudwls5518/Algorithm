class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] str = my_string.split("");
        String dump = str[num1];
        str[num1] = str[num2];
        str[num2] = dump;
        for(String a : str){
            answer+=a;
        }
        return answer;
    }
}