package maximumNumberOfWordsFoundInSentences;

public class MaximumNumberOfWordsFoundInSentences {

    public int mostWordsFound(String[] sentences) {
        int count = 0;
        for (String sentence : sentences) {
            String[] array = sentence.split(" ");
            count = Math.max(count, array.length);
        }
        return count;
    }

}
