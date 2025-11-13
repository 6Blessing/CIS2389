public class ProperFraction extends Fraction {
    public ProperFraction(int nuemrator, int denominator) throws ProperFractionException {
        super(nuemrator, denominator);
 if (Math.abs(numerator) >= Math.abs(denominator))  
      throw new ProperFractionException ("Not a proper fraction" + numerator + "/" + denominator);
            }
   }     
  

    