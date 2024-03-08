import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        // 사람 : 추억점수 HashMap 만듬 
        HashMap<String, Integer> map = new HashMap<>();
        
        // 반복문으로 HashMap에 사람: 추억점수를 넣어줌
        for(int i = 0; i < name.length; i++){
            String nameVal = name[i];
            int score = yearning[i];
            map.put(nameVal, score);
        }
        // 반복문 돌려서 answer 배열에 map에서 key값에 해당하는 점수꺼내서 더해주고 해당하지 않으면
        // 0을 넣어주는 getOrDefault 메소드 사용
        for(int i = 0; i < photo.length; i++){
            for(String nameVal : photo[i]) {
               answer[i] += map.getOrDefault(nameVal , 0);
            }
        }
        
        return answer;
    }
}