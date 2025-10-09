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
   
<<<<<<< HEAD
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
   
      
=======
   public Fraction(int n, int d){
      //TODO: Finish this constructor
   }
   
   public Fraction(int n){
      //TODO: Finish this constructor so that n is over 1 for a whole number
   }
   
   /*
     TODO: create the required method so that when 
     a Fraction object is part of a print() then output
     is numerator/denominator.
   */
   //public...
      
}
>>>>>>> 0e7cc86663604b9d36aaac2012d20c5e7a9b148d
