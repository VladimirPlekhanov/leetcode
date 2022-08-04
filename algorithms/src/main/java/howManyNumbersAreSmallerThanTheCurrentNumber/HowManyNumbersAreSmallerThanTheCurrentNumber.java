package howManyNumbersAreSmallerThanTheCurrentNumber;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        int counter;
        for (int i = 0; i < nums.length; i++) {
            counter = 0;
            for (int num : nums) {
                if (num < nums[i]) counter++;
            }
            result[i] = counter;
        }
        return result;
    }

}
