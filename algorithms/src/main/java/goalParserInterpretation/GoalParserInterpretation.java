package goalParserInterpretation;

public class GoalParserInterpretation {

    // Linear complexity - O(n)

    public String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }

}
