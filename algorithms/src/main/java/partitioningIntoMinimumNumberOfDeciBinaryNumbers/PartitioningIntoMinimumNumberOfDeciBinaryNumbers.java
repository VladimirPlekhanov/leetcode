package partitioningIntoMinimumNumberOfDeciBinaryNumbers;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {

    // Linear complexity - O(n)
    public int minPartitions(String n) {
        int result = 0;
        for (char i : n.toCharArray()) {
            if (result < i - '0') {
                result = i - '0';
            }
        }
        return result;
    }

}
