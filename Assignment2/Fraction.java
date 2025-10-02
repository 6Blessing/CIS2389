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
}
//i deleted all of the TODO comments***