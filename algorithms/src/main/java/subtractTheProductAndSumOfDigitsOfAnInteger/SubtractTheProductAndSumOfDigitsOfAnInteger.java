package subtractTheProductAndSumOfDigitsOfAnInteger;

public class SubtractTheProductAndSumOfDigitsOfAnInteger {

    public int subtractProductAndSum(int n) {
        char[] array = Integer.toString(n).toCharArray();
        int sum = 0;
        int product = 1;
        for (char c : array) {
            sum += Character.getNumericValue(c);
            product *= Character.getNumericValue(c);
        }
        return product - sum;
    }

}
