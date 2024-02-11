
class Solution {
    public String solution(String s) {
        String answer = "";
        // 공백으로 구분된 숫자 끊어서 배열에 담기
        String[] str = s.split(" ");
        // 숫자로 변경시켜서 배열에 담기
        int[] array = new int[str.length];
        
        for(int i = 0; i < str.length; i++){
            array[i] = Integer.parseInt(str[i]);
        }
        int max = array[0];
        int min = array[0];
        
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }
        answer = min + " " + max;
        
        return answer;
    }
}