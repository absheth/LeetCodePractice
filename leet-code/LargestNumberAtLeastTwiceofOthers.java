class LargestNumberAtLeastTwiceofOthers {
    public int dominantIndex(int[] nums) {
        int returnIndex = -1;

        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                returnIndex = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i != returnIndex && nums[i] * 2 > max) {
                returnIndex = -1;
                break;
            }
        }

        return returnIndex;
    }
}
