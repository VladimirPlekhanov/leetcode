package twoSum;

public class TwoSum {

  public int[] twoSum(int[] nums, int target) {
    int result;
    int[] arr = new int[2];
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        result = nums[i] + nums[j];
        if (result == target) {
          arr[0] = i;
          arr[1] = j;
          break;
        }
      }
    }
    return arr;
  }

}
