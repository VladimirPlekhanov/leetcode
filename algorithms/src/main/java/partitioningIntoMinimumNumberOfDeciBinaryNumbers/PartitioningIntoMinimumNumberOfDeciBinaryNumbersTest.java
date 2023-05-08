package partitioningIntoMinimumNumberOfDeciBinaryNumbers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbersTest {

    PartitioningIntoMinimumNumberOfDeciBinaryNumbers p = new PartitioningIntoMinimumNumberOfDeciBinaryNumbers();

    @Test
    public void partitioningIntoMinimumNumberOfDeciBinaryNumbersTest() {
        String n1 = "32";
        String n2 = "27834";
        int expected1 = 3;
        int expected2 = 8;
        int actual = p.minPartitions(n2);
        assertEquals(expected2, actual);
    }

}
