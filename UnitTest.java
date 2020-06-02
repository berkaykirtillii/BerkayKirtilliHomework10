
import berkaykirtilli_hw6.Fractional;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BERKAY
 */
public class FractionalTest {
    public  FractionalTest() {
    }
    
   @Test
    public void testSimplify(){
        assertEquals("-2/5", new Fractional(-8,20).simplify().toString());
        assertEquals("2/-5", new Fractional(8,-20).simplify().toString());
        assertEquals("2/5", new Fractional(8,20).simplify().toString());
        assertEquals("2/5", new Fractional(-8,-20).simplify().toString());
        assertEquals("2", new Fractional(4, 2).simplify().toString());
        
    }
    
     @Test
    public void testEquals(){
        assertEquals(true, new Fractional(3, 6).equals(new Fractional(3, 6)));
        assertEquals(true, new Fractional(-2,-4).equals(new Fractional(2,4)));
        
    }
    
    @Test
    public void testSign(){
        Assertions.assertThrows(ArithmeticException.class, () -> {new Fractional(0, 0).sign(); });
        assertEquals(1,new Fractional(7,0).sign());
        assertEquals(-1,new Fractional(-7,0).sign());
        assertEquals(1,new Fractional(-9,-4).sign());
        assertEquals(-1, new Fractional(-4,3).sign());
        assertEquals(-1, new Fractional(4,-3).sign());
        assertEquals(0, new Fractional(0,-5).sign());
    }
    
    @Test
    public void testIsNan(){
        assertEquals(Fractional.NotANumber,new Fractional(0, 0).toString());
    }
    
    @Test
    public void testIsInfinity(){
        assertEquals(false,new Fractional(5, 3).isInfinity());
        assertEquals(true,new Fractional(7, 0).isInfinity());
    }
    
    @Test
    public void testGetValue(){
        assertEquals(2/1, new Fractional(8, 4).getValue());
    }
    
    @Test
    public void testConstructor(){
        Fractional frac = new Fractional(4, 8);
        Fractional fra = frac;
        assertEquals(frac, fra);
    }
    
    @Test
    public void testToString(){
        assertEquals(Fractional.NegativeInfinity, new Fractional(-8, 0).toString());
        assertEquals(Fractional.PositiveInfinity, new Fractional(8, 0).toString());
        assertEquals("6/2", new Fractional(6, 2).toString());
    }
   
    
    
}