import java.util.Scanner;
public class palindromeDetection
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter palindrome candidate: ");
      String input = sc.nextLine();
      // [^a-zA-Z] matches any character that is not an uppercase or lowercase letter.
      input = input.replaceAll("[^a-zA-Z]", "");
      String candidate = input.toLowerCase();
      int count;
      int length = candidate.length();
      String letters = "";
      for(count = length - 1; count >= 0; count--)
      {
         char reversedLetter = candidate.charAt(count);              
         letters += reversedLetter;
      }
      if(candidate.equals(letters))
      {
         System.out.print("Palindrome!!");
      }
      else
      {
         System.out.print("Not a palindrome :(");
      }
   }
}