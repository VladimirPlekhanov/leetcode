package goalParserInterpretation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GoalParserInterpretationTest {

    GoalParserInterpretation g = new GoalParserInterpretation();

    @Test
    public void goalParserInterpretationTest() {
        String actual1 = g.interpret("G()()()()(al)");
        String expect1 = "Gooooal";
        String actual2 = g.interpret("(al)G(al)()()G");
        String expect2 = "alGalooG";
        assertEquals(expect1, actual1);
        assertEquals(expect2, actual2);
    }

}
