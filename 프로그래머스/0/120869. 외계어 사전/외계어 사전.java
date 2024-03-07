import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        // Spell 배열의 문자들로 만들 수 있는 단어를 생성
        String word = String.join("", spell);
        
        // dic 배열을 정렬하여 이진 검색을 할 수 있도록 준비
        Arrays.sort(dic);
        
        // 가능한 모든 문자열 순열을 확인하여 dic에 존재하는지 검사
        if (isPermutationInDictionary(word, "", dic)) {
            return 1;
        } else {
            return 2;
        }
    }

    private boolean isPermutationInDictionary(String word, String perm, String[] dic) {
        if (word.isEmpty()) {
            // 이진 검색을 통해 dic 배열에 perm이 존재하는지 확인
            return Arrays.binarySearch(dic, perm) >= 0;
        } else {
            for (int i = 0; i < word.length(); i++) {
                // 다음 순열 생성
                String next = word.substring(0, i) + word.substring(i + 1);
                if (isPermutationInDictionary(next, perm + word.charAt(i), dic)) {
                    return true;
                }
            }
        }
        return false;
    }
}
