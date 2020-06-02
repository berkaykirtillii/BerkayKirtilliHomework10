
public class Fractional {
	public final long numerator;
	public final long denominator;
	public static final String NotANumber = "Not a Number";
	public static final String PositiveInfinity = "+Infinity";
	public static final String NegativeInfinity = "-Infinity";
	
	Fractional(long numerator, long denominator) {	
		// student code
	}
	
	Fractional simplify() {
		// student code
                
	}
	
	// Not a Number (NaN) 
	boolean isNaN() {
		if(denominator==0){
                   return true;
                } 
                else
                  return false;
	}

	boolean isInfinity() {
		// student code
	}
	
	static int sign(long numerator, long denominator) {
		// student code
	}
	
	int sign() {
		// student code
	}

	double getValue() {
		return (double)numerator / denominator;
	}
	
	@Override
	public boolean equals(Object obj) {
		// student code
	}
	
	@Override
	public String toString() {
		// student code
	}

}
