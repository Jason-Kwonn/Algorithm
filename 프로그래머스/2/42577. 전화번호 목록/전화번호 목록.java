import java.util.HashMap;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, Boolean> map = new HashMap<>();
        
        for(String phone : phone_book){
            map.put(phone, true);
        }
        
        for(String phone : phone_book){
            for(int i = 0; i < phone.length(); i++){
                String prefix = phone.substring(0, i);
                if(map.containsKey(prefix)){
                    answer = false;
                }
            }
        }
        
        return answer;
    }
}