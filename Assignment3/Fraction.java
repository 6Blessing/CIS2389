/**
*
* Using your previous Fraction class, add the following accessor and mutator methods
*  -getNumerator() -> returns the numerator 
*  -getDenominator() -> returns the denominator
*  -reduce() -> reduces the numerator and denominator by the greatest common divisor.
*
**/
public class Fraction{
   private int numerator;
   private int denominator;
   
 public Fraction(int n, int d){
      if (d == 0){
      throw new IllegalArgumentException("denominator cannot be zero");
   }
 this.numerator = n;
 this.denominator = d;
}
  public Fraction(int n){
    this(n,1);
   }
   
@Override
public String toString(){
   return this.numerator + "/" + this.denominator;
}
   public int getNumerator(){
      return this.numerator;
   }
   public int getDenominator(){
      return this.denominator;
   }
   public void reduce (){
      int greatest = greatest(this.numerator, this.denominator);
      this.numerator /= greatest;
   this.denominator /= greatest;
   }
   private int greatest (int x, int y){
         while(y !=0){
         int temp = y; //Google assisted method*
            y = x % y;
            x = temp;

            
         }
         return x;
      }}
   
      