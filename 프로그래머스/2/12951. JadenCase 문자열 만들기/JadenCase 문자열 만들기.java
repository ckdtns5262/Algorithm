import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] words = s.split(" ");
        for(int i = 0; i < words.length; i++){
            String now = words[i];
            // 문자없으면 공백 
            if(words[i].length() == 0){
                answer += " ";
            } 
            // 문자 있으면 검사
            else {
                answer += words[i].substring(0, 1).toUpperCase();
                answer += words[i].substring(1, now.length()).toLowerCase();
                answer += " ";
            }
        }
        if(s.substring(s.length()-1, s.length()).equals(" ")){
            return answer;
        }
     
        return answer.substring(0, answer.length()-1);
    }
}