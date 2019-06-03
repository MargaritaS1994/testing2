/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import myCode.*;
import static org.testng.Assert.*;
import org.testng.annotations.*;

/**
 *
 * @author user
 */
public class CalculatorTestNG {

    private CalculatorImp calculator;

    @BeforeClass
    public void setUp() {
        calculator = new CalculatorImp();
    }

    public CalculatorTestNG() {
    }

    @Test
    public void zeroTest() {
        double result = calculator.calculate("0");
        assertEquals(result, 0.0, "Owibka! Test na nol ne prohodit");
    }

    @Test
    public void floatingPointTest() {
        double result = calculator.calculate("-3000.02");
        assertEquals(result, -3000.02, "Owibka na otricanie!");

    }

    @Test
    public void addTest_1() {
        double result = calculator.calculate("30.4/2");
        assertEquals(result, 15.2, "Owibka! Test na delenie ne prohodit!");
    }

    @Test
    public void addTest_2() {
        double result = calculator.calculate("(2+2)*1.5/10-444");
        assertEquals(result, -443.4, "Owibka! Test ne prohodit, slownqe delenija");

    }

    @Test
    public void functionTest() {
        double result = calculator.calculate("sin(1)*sin(1)+cos(1)*cos(1)");
        assertEquals(result, 1.0, "Owibka! Test na sin, cos, ne prohodit");
    }

}
