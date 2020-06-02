
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package berkaykirtilli_hw6;

/**
 *
 * @author BERKAY
 */
public class Fractional {
	public final long numerator;
	public final long denominator;
	public static final String NotANumber = "Not a Number";
	public static final String PositiveInfinity = "+Infinity";
	public static final String NegativeInfinity = "-Infinity";
	
	public Fractional(long numerator, long denominator) {	
		// student code
                this.numerator = numerator;
                this.denominator = denominator;
	}
	
	public Fractional simplify() {
		// student code
                Fractional simplify;
                simplify= new Fractional(numerator, denominator);
                int ebob = 1;
                
                if(numerator > 0 && denominator > 0){
                   for(int i=1;i<=numerator && i<=denominator;i++){
                       if(numerator%i ==0 && denominator%i==0){
                           ebob=i;
                       }
                   }
                    simplify= new Fractional(numerator/ebob,denominator/ebob);
                }
                else if(numerator < 0 && denominator > 0){
                  
                  for(int i=1;i<=(-1*numerator) && i<=denominator;i++){
                       if(numerator%i ==0 && denominator%i==0){
                           ebob=i;
                       }
                   }
                    simplify= new Fractional(numerator/ebob,denominator/ebob);
                }
                else if(numerator > 0 && denominator < 0){
