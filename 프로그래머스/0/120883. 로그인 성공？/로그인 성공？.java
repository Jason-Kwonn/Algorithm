class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        
        String id = id_pw[0];
        String pw = id_pw[1];
        
        for (String[] member : db){
            String dbId = member[0];
            String dbPw = member[1];
            
            if(id.equals(dbId)){
                
                if(pw.equals(dbPw)){
                    return "login";
                } else return "wrong pw";
            }
        }
        
        
        
        return answer;
    }
}