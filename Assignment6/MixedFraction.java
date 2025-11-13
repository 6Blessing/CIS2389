public class MixedFraction implements Comparable<MixedFraction> {
private int whole;
private int numerator;
private int denominator;

public MixedFraction(ProperFraction frac) {
this(0, frac.getNumerator(), frac.getDenominator());
}

public MixedFraction(ImproperFraction frac) {
    this.whole = frac.getNumerator() / frac.getDenominator();
        this.numerator = frac.getNumerator() % frac.getDenominator();
            this.denominator = frac.getDenominator();
}

public MixedFraction(Fraction frac) {
    this.whole = frac.getNumerator() / frac.getDenominator();
            this.numerator = frac.getNumerator() % frac.getDenominator();
                    this.denominator = frac.getDenominator();
}

public MixedFraction(int whole, Fraction frac) {
    this.whole = whole + frac.getNumerator() / frac.getDenominator();
        this.numerator = frac.getNumerator() % frac.getDenominator();
            this.denominator = frac.getDenominator();
}

public MixedFraction(int whole, ProperFraction frac) {
        this.whole = whole;
            this.numerator = frac.getNumerator();
                this.denominator = frac.getDenominator();
}

public MixedFraction(int whole, int numerator, int denominator) {
        this.whole = whole;
            this.numerator = numerator;
                this.denominator = denominator;
simplify();
}
private void simplify() {


if (numerator >= denominator) {
    whole += numerator / denominator;
        numerator = numerator % denominator;
}

int gcd = gcd(numerator, denominator);
  if (gcd != 0) {
   numerator /= gcd;
   denominator /= gcd;
}
}

private int gcd(int a, int b) {
   if (b == 0) return a;
      return gcd(b, a % b);
}


public int compareTo(MixedFraction other) {
    double thisValue = this.toDouble();
        double otherValue = other.toDouble();
            return Double.compare(thisValue, otherValue);
}

public double toDouble() {
    return whole + (double) numerator / denominator;
}

public String toString() {
    if (numerator == 0)
        return String.valueOf(whole);

    if (whole == 0)
        return numerator + "/" + denominator;
    return whole + " " + numerator + "/" + denominator;
}
}