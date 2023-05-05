package leftAndRightSumDifferences;

public class LeftAndRightSumDifferences {

    // Quadratic complexity - O(n^2)
    public int[] leftRightDifference(int[] nums) {
        int length = nums.length;
        int[] leftArr = new int[length];
        int[] rightArr = new int[length];

        if (length == 1) {
            return new int[]{0};
        } else {
            for (int i = 0; i < length; i++) {
                if (i == 0) {
                    leftArr[i] = 0;
                } else {
                    for (int j = 0; j < i; j++) {
                        leftArr[i] += nums[j];
                    }
                }
            }
            for (int i = length - 1; i > -1; i--) {
                if (i == length - 1) {
                    rightArr[i] = 0;
                } else {
                    for (int j = i + 1; j < length; j++) {
                        rightArr[i] += nums[j];
                    }
                }
            }
        }

        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = Math.abs(leftArr[i] - rightArr[i]);
        }

        return result;
    }

    // Logarithmic complexity - O(log n)
    public int[] leftRigthDifference(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int[] ans = new int[nums.length];
        int leftsum = 0;
        int rightsum = sum - nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            ans[i] = Math.abs(leftsum - rightsum);
            leftsum += nums[i];
            rightsum -= nums[i + 1];
        }
        ans[nums.length - 1] = Math.abs(leftsum - rightsum);
        return ans;
    }

}
