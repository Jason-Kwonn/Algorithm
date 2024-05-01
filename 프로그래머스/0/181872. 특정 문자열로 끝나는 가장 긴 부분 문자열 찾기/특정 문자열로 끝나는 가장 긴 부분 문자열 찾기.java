class Solution {
    public String solution(String myString, String pat) {

        int index = myString.lastIndexOf(pat);
        
        if (index != -1) {
            return myString.substring(0, index + pat.length());
        }
        
        return "";
    }
}
