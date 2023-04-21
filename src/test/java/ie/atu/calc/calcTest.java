package ie.atu.calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class calcTest {
 Calculator myCalc;

 @Test
 public void testSubtract(){
     myCalc = new Calculator();
     assertEquals(0, myCalc.sub(20,20));
    }

@Test
public void testAdd(){
     myCalc = new Calculator();
     assertEquals(40, myCalc.add(20,20));
    }


    @Test
    public void testMultiply(){
        myCalc = new Calculator();
        assertEquals(4, myCalc.multiply(2,2));
    }

    public void testDivide(){
        myCalc = new Calculator();
        assertEquals(10, myCalc.divide(20,2));
    }
}