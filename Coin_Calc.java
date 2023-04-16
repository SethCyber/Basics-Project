import java.util.Scanner;
public class Coin_Calc
{
public static void main(String[] args)
   {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter Change: $0.");
        int $ = sc.nextInt();
        
        int a = $ / 25;
        int b = $ % 25;
        
        int c = b / 10;
        int d = b % 10;
        
        int e = d / 5;
        int f = d % 5;
        
        int g = f / 1;
        
        
        System.out.print("Your Change is: "+a+" Quarters "+c+" Dimes "+e+" Nickles "+g+" Pennies");
   }
}