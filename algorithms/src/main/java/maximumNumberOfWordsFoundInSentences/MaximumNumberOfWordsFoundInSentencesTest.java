package maximumNumberOfWordsFoundInSentences;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberOfWordsFoundInSentencesTest {

    private final String[] sentences = new String[]{"please wait", "continue to fight", "continue to win"};
    MaximumNumberOfWordsFoundInSentences m = new MaximumNumberOfWordsFoundInSentences();

    @Test
    public void maximumNumberOfWordsFoundInSentencesTest(){
        int expectedResult = m.mostWordsFound(sentences);
        Assert.assertEquals(expectedResult, 3);
    }

}
