class Solution {
    boolean solution(String s) {
        int num = 0;
        for(int i = 0; i < s.length(); i++){
            if(num == 0){
                if(s.charAt(i) == '('){
                    num++;
                } else {
                    return false;
                }
            } 
            else if(num > 0){
                if(s.charAt(i) == '('){
                    num++;
                } else {
                    num--;
                }
            }
            else {
             return false;   
            }
        }
        boolean answer = (num == 0) ? true : false;
        return answer;
    }
}