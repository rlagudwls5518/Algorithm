class Solution {
            public String solution(String s) {
                String answer = "";
                String[] str = s.split(" ",-1);
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i< str.length; i++){

                    if(str[i].length() > 0){
                        String first = str[i].substring(0,1).toUpperCase();
                        String second = str[i].substring(1).toLowerCase();
                        sb.append(first).append(second);
                    }
                    
                    if(i != str.length-1){
                        sb.append(" ");
                    }
                }
                answer = sb.toString();
                return answer;
            }
        }