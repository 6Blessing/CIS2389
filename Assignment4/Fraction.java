public class Fraction {
    private int numerator;
    private int denominator;
    public Fraction(int n, int d) {
        if (d == 0) {
throw new IllegalArgumentException("cant have 0 in denominator");
        }
    numerator = n;
    denominator = d;
        simplify();
    }

    public Fraction(int n) {
        this(n, 1);
    }

    // Simplify the fraction
private void simplify() {
int gd = gcd(Math.abs(numerator), Math.abs(denominator)); //math.abs make sure the values are positive & greatest common denominator (gd)
numerator /= gd;
denominator /= gd;


 if (denominator < 0) { 
numerator *= -1;
denominator *= -1;
        }
    }
private int gcd(int x, int z) {
while (z != 0) {
    int tempb = z;
    z = x % z;
    x = tempb;
        }
     return x;
    }

    // this will add the fractions the second will substract them 
    public Fraction add(Fraction f) {
    int newNum = (numerator * f.denominator) + (f.numerator * denominator);
    int newDen = denominator * f.denominator;
    return new Fraction(newNum, newDen);
    }
 public Fraction subtract(Fraction f) {
    int newNum = (numerator * f.denominator) - (f.numerator * denominator);
    int newDen = denominator * f.denominator;
    return new Fraction(newNum, newDen);
    }

    // this will mulitply the fracions
public Fraction multiply(Fraction f) {
        int newNum = numerator * f.numerator;
        int newDen = denominator * f.denominator;
        return new Fraction(newNum, newDen);
    }

    public Fraction divide(Fraction f) {
    if (f.numerator == 0) {
    throw new IllegalArgumentException("cant divide by 0");
        }
     int newNum = numerator * f.denominator;
    int newDen = denominator * f.numerator;
    return new Fraction(newNum, newDen);
    }

    public int compareTo(Fraction f) {
int left = numerator * f.denominator;
int right = f.numerator * denominator;
if (left > right) return 1;
else if (left < right) return -1;
else return 0;
    }
    
    public void reduce() {
    int gd = gcd(Math.abs(numerator), Math.abs(denominator));
    numerator /= gd;
    denominator /= gd;

    if (denominator < 0){
    numerator *= -1;
    denominator *= -1;
   
    }
}

    public String toString() {
        return numerator + "/" + denominator;
    }
}