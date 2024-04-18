import java.util.List;
import java.util.ArrayList;


class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        String[] newString = my_string.split(" ");
        
        for(String str : newString){
            if(!str.equals("")){
                list.add(str);
            }
        }
        
        return list.toArray(new String[0]);
    }
}