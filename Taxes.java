import java.util.Scanner;

public class Taxes
{
   public static void main(String[] args)
   {
   
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Are you single(1) or married(2)?: ");
      double relation = sc.nextDouble();
      
      if (relation == 1)
      {
         System.out.print("Income(USD)?: ");
         double i = sc.nextInt();
         
         if (i <= 27050)
         {
            double taxed = (i)*15)/100+;
            System.out.print("Taxed:"+taxed);
         }
         
         if (i <= 65550 && i >= 27050)
         {
            double taxed = ((i - 27050)*27.5)/100+4057.5;
            System.out.print("Taxed:"+taxed);
         }
         if (i <= 136750 && i >= 65550)
         {
            double taxed = ((i - 65550)*30.5)/100+14645;
            System.out.print("Taxed:"+taxed);
         }
          if (i <= 297350 && i >= 136750)
         {
            double taxed = ((i - 136750)*35.5)/100+36361;
            System.out.print("Taxed:"+taxed);
         }
         if (i >= 297350)
         {
            double taxed = ((i - 297350)*39.1)/100+93374;
            System.out.print("Taxed:"+taxed);
        
         }      
      }   
      if (relation == 2)
      {
         System.out.print("Income(USD)?: ");
         double i = sc.nextInt();
         
         if (i <= 45200)
         {
            double taxed = (i)*15)/100+;
            System.out.print("Taxed:"+taxed);
         }
         
         if (i <= 109250 && i >= 45200)
         {
            double taxed = ((i - 45200)*27.5)/100+6780;
            System.out.print("Taxed:"+taxed);
         }
         if (i <= 166500 && i >= 109250)
         {
            double taxed = ((i - 109250)*30.5)/100+24393.75;
            System.out.print("Taxed:"+taxed);
         }
          if (i <= 297350 && i >= 166500)
         {
            double taxed = ((i - 136750)*35.5)/100+41855;
            System.out.print("Taxed:"+taxed);
         }
         if (i >= 297350)
         {
            double taxed = ((i - 297350)*39.1)/100+88306;
            System.out.print("Taxed:"+taxed);
        
         }      
         
                                  
      } 
   }
}