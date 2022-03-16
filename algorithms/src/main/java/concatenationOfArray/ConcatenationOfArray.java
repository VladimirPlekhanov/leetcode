package concatenationOfArray;

public class ConcatenationOfArray {

  public int[] getConcatenation(int[] numbs) {
    int[] ans = new int[numbs.length * 2];
    for (int i = 0; i < numbs.length; i++) {
      ans[i] = numbs[i];

      ans[numbs.length + i] = numbs[i];
    }
    return ans;
  }

}
