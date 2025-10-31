import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FractionDriver {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner fin = new Scanner(new File("values.txt"));


      Fraction[] fractionList = new Fraction[5];
      int count = 0;
       

      while (fin.hasNextInt() && count < fractionList.length) {
         int n = fin.nextInt();
         int d = fin.nextInt();

         //if a value gets put to 0 then this should make it not be 0
         if (d == 0) {
            d = 1;
         }

         fractionList[count] = new Fraction(n, d);
         count++;
      }

      System.out.println("Original fractions:");
      for (int i = 0; i < count; i++) {
         System.out.println(fractionList[i]);
      }

      System.out.println("\nReduced fractions:");
      for (int i = 0; i < count; i++) {
   fractionList[i].reduce();
         
         System.out.println(fractionList[i]);
      }
      
   }
}
