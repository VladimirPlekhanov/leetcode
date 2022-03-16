package romanToInteger;

public class RomanToInteger {

  public int romanToInt(String s) {
    char[] arrayFirst = s.toCharArray();
    int[] arraySecond = new int[arrayFirst.length];
    int result = 0;

    for (int i = 0; i < arrayFirst.length; i++) {
      switch (arrayFirst[i]) {
        case 'I':
          arraySecond[i] = 1;
          break;
        case 'V':
          arraySecond[i] = 5;
          break;
        case 'X':
          arraySecond[i] = 10;
          break;
        case 'L':
          arraySecond[i] = 50;
          break;
        case 'C':
          arraySecond[i] = 100;
          break;
        case 'D':
          arraySecond[i] = 500;
          break;
        case 'M':
          arraySecond[i] = 1000;
          break;
      }
    }

    for (int i = 0; i < arraySecond.length - 1; i++) {
      if (arraySecond[i] >= arraySecond[i + 1]) {
        result = result + arraySecond[i];
      } else {
        result = result - arraySecond[i];
      }
    }
    result += arraySecond[arraySecond.length - 1];
    return result;
  }
}
