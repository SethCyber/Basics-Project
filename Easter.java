import java.util.Scanner;
public class Easter
{
   public static void main(String[] args)
   {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter the year: ");
       
        int y = sc.nextInt();
       
        //Divide y by 19 and call the remainder a. Ignore the quotient.
        int a = y % 19;
        //Divide y by 100 and get a quotient b and a remainder c.
        int b = y / 100;
        int c = y % 100;
        //Divide b by 4 and get a quotient d and a remainder e
        int d = b / 4;
        int e = b % 4;
        //Divide b + 8 by 25 and get a quotient f. Ignore the remainder.
        int f = (b + 8) / 25;
        //Divide b - f + 1 by 3 and get a quotient g. Ignore the remainder.
        int g = (b - f + 1) / 3;
        //Divide 19 * a + b - d - g + 15 by 30 and get a remainder h. Ignore the quotient
        int h = (19 * a + b - d - d + 15) % 30;
        //Divide c by 4 and get a quotient i and a remainder k
        int i = c / 4;
        int k = c % 4;
        //Divide 32 + 2 * e + 2 * i - h - k by 7 and get a remainder r. Ignore the quotient.
        int r = (32 + 2 * e + 2 * i - h - k) % 7;
        //Divide a + 11 * h + 22 * r by 451 and get a quotient m. Ignore the remainder.
        int m = (a + 11 * h + 22 * r) / 451;
        //Divide h + r - 7 * m + 114 by 31 and get a quotient n and a remainder p.
        int n = (h + r - 7 * m + 114) / 31;
        int p = (h + r - 7 * m + 114) % 31;
        //  Easter fell on April 20 (month = n  and day = p + 1).
        int day = p + 1;
        System.out.println("Easter will be " + n +"/"+day);
   }
}