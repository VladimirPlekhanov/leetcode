package other.anagram;

import org.junit.Assert;
import org.junit.Test;

public class AnagramTest {

    Anagram a = new Anagram();

    @Test
    public void anagramTest(){
        Boolean actualResult = a.anagramCheck("SILENT", "LISTEN");
        Assert.assertTrue(actualResult);
    }

}
