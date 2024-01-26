class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] ransomChars = ransomNote.toCharArray();
        char[] magazineChars = magazine.toCharArray();
        int ransomCount = ransomChars.length;
        Arrays.sort(ransomChars);
        Arrays.sort(magazineChars);

        int i = 0;
        int j = 0;
        while (i < ransomChars.length && j < magazineChars.length) {
            if (ransomChars[i] == magazineChars[j]) {
                i++;
            }
            j++;
        }

        return i == ransomChars.length;
    }
}