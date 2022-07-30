package shuffleTheArray;

public class ShuffleTheArray {

    public int[] shuffle(int[] nums, int n) {
        int counter = 0;
        int[] newArr = new int[nums.length];
        for(int i = 0; i < n; i++){
            newArr[counter++] = nums[i];
            newArr[counter++] = nums[i + n];
        }
        return newArr;
    }

}
