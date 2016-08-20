import java.lang.Math;
import java.lang.NumberFormatException;

class Fraction {
    private int numerator, denominator;
    
    public Fraction(int n, int d) {
        numerator = n;
        denominator = d;
        simplify();
    }
    
    public Fraction(double n)
    
    public Fraction(String fraction) {
        parseString(fraction);
    }
    
    public Fraction(double decimal) {
        parseString(parseDecimal(decimal));
    }
    
    /* This method converts a double into a string representation of a fraction
     * Using the stern-brocot tree 
     * https://en.wikipedia.org/wiki/Stern-Brocot_tree
     * Precision is used to determine how far down the tree the search goes.  
     * Smaller values give more accurate fraction
     * Accuracy is used to determine how close the fraction is to the decimal
     */
    public String parseDecimal(double decimal) {
        
        // The two numerators it is searching between
        double[] n = {Math.floor(decimal), Math.ceil(decimal)};
        //The two denominators it is searching between
        double[] d = {1,1};
        
        /* This runs through the tree till it reaches the point the fractions are 
         * at increments of ~1/1002.  If the fraction isn't found by then we give
         * up on the search.
         */
        for(int g = 1; g<10000; g++) {
            if ( Math.abs( (decimal - (n[0] + n[1]) / (d[0] + d[1])) ) < Math.pow(10, -35)) {  //If true, the fraction is found
                return Integer.toString((int)(n[0] + n[1])) + "/" + Integer.toString((int)(d[0] + d[1]));
            } else if ( decimal < ( n[0] + n[1] ) / ( d[0] + d[1] ) ) { // Continues searching on the left side from the current point
                n[1] = n[0] + n[1];
                d[1] = d[0] + d[1];
            } else  { // Continues searching on the right side from the current point
                n[0] = n[0] + n[1];
                d[0] = d[0] + d[1];
            }
        }
        
        return Double.toString(decimal) + "/1";
    }
    
    public String parseDecimal(double decimal) {
        return parseDecimal(decimal, Math.pow(10,-1000), Math.pow(10, -35));
    }
    
    
    //Parses a string form of a fraction
    private void parseString(String input) {
        String[] fraction = input.split("/");
        if (fraction.length == 2) {
            numerator = Integer.parseInt(fraction[0]);
            denominator = Integer.parseInt(fraction[1]);
            if (denominator < 0) {
                numerator *= -1;
                denominator *= -1;
            }
            simplify();
        } else {
            throw new NumberFormatException();
        }
    }
    
    private void simplify() {
        int gcf = new NateMath().gcf(numerator, denominator);
        numerator  = numerator / gcf;
        denominator = denominator / gcf;
    }
    
    public Fraction multiply(Fraction fraction) { 
        return new Fraction(numerator * fraction.getNumerator(), denominator * fraction.getDenominator());
    }
    
    public Fraction divide(Fraction fraction) {
        return new Fraction(numerator * fraction.getDenominator(), denominator * fraction.getNumerator());
    }
    
    public Fraction add(Fraction fraction) {
        return new Fraction((numerator * fraction.getDenominator()) + (denominator * fraction.getNumerator()), denominator * fraction.getDenominator());
    }
    
    public Fraction subtract(Fraction fraction) {
        return new Fraction((numerator * fraction.getDenominator()) - (denominator * fraction.getNumerator()), denominator * fraction.getDenominator());
    }
    
    public Fraction reciprocal() {
        return new Fraction(denominator, numerator);
    }
    
    public Fraction abs() {
        return new Fraction(Math.abs(numerator), Math.abs(denominator));
    }
    
    public Fraction pow(int power) {
        return new Fraction(Math.pow(numerator, power), Math.pow(denominator, power));
    }
    
    public int intValue() {
        return (int)numerator/denominator;
    }
    
    public double doubleValue() {
        return (double)numerator/denominator;
    }
    
    public float floatValue() {
        return (float)numerator/denominator;
    }
    
    public String toString() {
        return Integer.toString(numerator) + "/" + Integer.toString(denominator);
    }
    
    public int getNumerator() {
        return numerator;
    }
    
    public int getDenominator() {
        return denominator;
    }
}