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
}