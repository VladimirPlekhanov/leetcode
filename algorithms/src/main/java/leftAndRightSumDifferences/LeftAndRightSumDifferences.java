package leftAndRightSumDifferences;

public class LeftAndRightSumDifferences {

    public int[] leftRightDifference(int[] nums) {
        int length = nums.length;
        if (length == 1) return new int[]{0};
        // {2, 4, 7}
        else {
            int[] leftArr = new int[length];
            int[] rightArr = new int[length];
            for (int i = 0; i < length; i++) {
                if (i == 0) {
                    leftArr[i] = 0;
                } else {
                    for (int j = 0; j < i; j++) {
                        leftArr[i] += nums[j]; //i = 1 ok, i = 2
                    }
                }
            }
            for (int i = length - 1; i > -1; i--) {
                if (i == length - 1) {
                    rightArr[i] = 0;
                } else {
                    for (int j = i; j > -1; j--) {
                        rightArr[i] += nums[j]; //i = 1 ok, i = 0
                    }
                }
            }
        }

        return new int[]{length};
    }

}
