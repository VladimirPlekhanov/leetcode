package subrectangleQueries;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubrectangleQueriesTest {

    SubrectangleQueries s = new SubrectangleQueries(new int[][]{{1, 1, 1}, {2, 2, 2}, {3, 3, 3}});

    @Test
    public void subrectangleQueriesTest() {
        s.updateSubrectangle(0, 0, 1, 1, 100);
        int expectedGetValue = 100;
        int actualGetVale = s.getValue(0, 1);
        assertEquals(expectedGetValue, actualGetVale);
    }

}
