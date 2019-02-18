
class Pivot {
    public int pivotIndex(int[] nums) {
        int index = -1;
        for(int i = 0; i < nums.length; i++) {
            int sum1=0,
                sum2=0;
            for(int j = 0; j < i; j++) {
                sum1 += nums[j];
            }
            for(int j = i+1; j < nums.length; j++) {
                sum2 += nums[j];
            }
            if (sum1 == sum2) {
                index = i;
                break;
            }
        }
        return index;
    }
}


