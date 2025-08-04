package com.nt.source;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static  org.junit.Assert.*;

import org.junit.*;
public class AppTest extends TestCase {

    public void testSumWithPositive(){
        //create object
        Arithematic ath= null;
        ath=new Arithematic();
        int actual= ath.add(20,3);
        int expected= 23;
        assertEquals(expected,actual);// here this method will check the result if correct than this method gaves us true if uncorrect gaves us false

    }
    public void testSumWithNegativeNumber(){
        // create object of the negative class
    Arithematic ath= new Arithematic();
    int actual= ath.add(-20,-3);
    int expected=-23;
    assertEquals(expected,actual);
    }
    public void testSumWithMixedNumber()
        {
        // create object of the negative class
        Arithematic ath= new Arithematic();
        int actual= ath.add(20,-3);
        int expected=17;
        assertEquals(expected,actual);
        }

    public void testSumWithZeros() {
        // create object of the negative class
        Arithematic ath = new Arithematic();
        int actual = ath.add(0, 0);
        int expected = 0;
        assertEquals(expected, actual);
    }


//        public void testApp(){
//        assertTrue(true);// here we are calling the assert method without hte class name because above we using hte static import of the class
//    }
}
