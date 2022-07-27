package finalValueOfVariableAfterPerformingOperations;

import org.junit.Assert;
import org.junit.Test;

public class FinalValueOfVariableAfterPerformingOperationsTest {

    private final String[] operations = new String[]{"--X", "X++", "X++"};
    FinalValueOfVariableAfterPerformingOperations f = new FinalValueOfVariableAfterPerformingOperations();

    @Test
    public void finalValueOfVariableAfterPerformingOperationsTest() {
        int actualResult = f.finalValueAfterOperations(operations);
        int expectedResult = 1;
        Assert.assertEquals(expectedResult, actualResult);
    }

}
