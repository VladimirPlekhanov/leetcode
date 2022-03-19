package palindromeNumber;

public class PalindromeNumber {

  public boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }
    int palindrome = x;
    int revers = 0;
    while (palindrome != 0) {
      int remainder = palindrome % 10;
      revers = revers * 10 + remainder;
      palindrome = palindrome / 10;
    }
    return x == revers;
  }

}
