class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == complement) {
                    answer[0] = i;
                    answer[1] = j;
                    return answer;
                }
            }
        }
        return new int[0];

        // Another solution
        // for (int i = 1; i < nums.length; i++) {
        //     for (int j = i; j < nums.length; j++) {
        //         if (nums[j] + nums[j - i] == target) {
        //             return new int[] { j, j - i };
        //         }
        //     }
        // }

        // return null;
    }
}