public abstract class Fraction implements Comparable<Fraction> {
 protected int numerator;
 protected int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0)
          throw new IllegalArgumentException("denominator cant be 0");
  this.numerator = numerator;
  this.denominator = denominator;
    }

 public int getNumerator(){
 return numerator;
    }

 public int getDenominator(){
 return denominator;
    }
    
 public double toDecimal(){
 return (double) numerator / denominator;
     }
     
 public int compareTo(Fraction other) {
  double diff = this.toDecimal()-other.toDecimal();
  return diff == 0 ? 0 : (diff > 0 ? 1 :-1);
    }
    public String toString() {
     return numerator + "/" + denominator;
    }
}