package richestCustomerWealth;

public class RichestCustomerWealth {

    public int maximumWealth(int[][] accounts) {
        int  maxSum = 0;
        int temp;
        for (int[] account : accounts) {
            temp = 0;
            for (int i : account) {
                temp += i;
            }
            if (temp > maxSum) {
                maxSum = temp;
            }
        }
        return maxSum;
    }

}
