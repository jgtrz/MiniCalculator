/**
 * @author Jose De Jesus Gutierrez
 */

public class UnitTests {

    public static void main (String[] args){
        //Call the test methods
        multiplyTest();
        divideTest();
        calculateTest();
    }

    //This tests the multiply() method in MiniCalculator
    public static void multiplyTest() {
        MiniCalculator miniCalc; //field of type MiniCalculator, will be used to create instances of the MiniCalculator class during the tests
        try {
            miniCalc = new MiniCalculator();
            miniCalc.multiply(0); //testing multiplication by zero
            if(miniCalc.calculate() != 0) {
                System.out.println("FAILED MULTIPLY");
            }
            else {
                System.out.println("SUCCESS MULTIPLY");
            }

            miniCalc = new MiniCalculator();
            miniCalc.multiply(1); //testing multiplication by a positive number
            if(miniCalc.calculate() != 1) {
                System.out.println("FAILED MULTIPLY");
            }
            else {
                System.out.println("SUCCESS MULTIPLY");
            }

            miniCalc = new MiniCalculator();
            miniCalc.multiply(-1); //testing multiplication by a negative number
            if(miniCalc.calculate() != -1) {
                System.out.println("FAILED MULTIPLY");
            }
            else {
                System.out.println("SUCCESS MULTIPLY");
            }
        
            miniCalc = new MiniCalculator();
            miniCalc.multiply(999999999); //testing multiplication by a large positive number
            if(miniCalc.calculate() != 999999999) {
                System.out.println("FAILED MULTIPLY");
            }
            else {
                System.out.println("SUCCESS MULTIPLY");
            }

            miniCalc = new MiniCalculator();
            miniCalc.multiply(-999999999); //testing multiplication by a large negative number
            if(miniCalc.calculate() != -999999999) {
                System.out.println("FAILED MULTIPLY");
            }
            else {
                System.out.println("SUCCESS MULTIPLY");
            }

        }
        finally {
            miniCalc = new MiniCalculator();
            miniCalc.multiply(5); //
            miniCalc.multiply(2); //testing calling multiply() multiple times
            miniCalc.multiply(4); //
            
            if(miniCalc.calculate() != 40) {
                System.out.println("FAILED MULTIPLY");
            }
            else {
                System.out.println("SUCCESS MULTIPLY");
            }
        }

    }

    //This tests the divide() method in MiniCalculator
    public static void divideTest() {
        MiniCalculator miniCalc; //field of type MiniCalculator, will be used to create instances of the MiniCalculator class during the tests
        try {
            miniCalc = new MiniCalculator();
            miniCalc.divide(0); //testing division by zero
        }
        catch(ArithmeticException ex) {
            System.out.println("YOU TRIED TO DIVIDE BY ZERO");
        }
        try {
            miniCalc = new MiniCalculator();
            miniCalc.divide(1); //testing division by a positive number
            if(miniCalc.calculate() != 1) {
                System.out.println("FAILED DIVIDE");
            }
            else {
                System.out.println("SUCCESS DIVIDE");
            }

            miniCalc = new MiniCalculator();
            miniCalc.divide(-1); //testing division by a negative number
            if(miniCalc.calculate() != -1) {
                System.out.println("FAILED DIVIDE");
            }
            else {
                System.out.println("SUCCESS DIVIDE");
            }
            
            miniCalc = new MiniCalculator();
            miniCalc.divide(999999999); //testing division by a large positive number
            if(miniCalc.calculate() != 0) {
                System.out.println("FAILED DIVIDE");
            }
            else {
                System.out.println("SUCCESS DIVIDE");
            }
        
            miniCalc = new MiniCalculator();
            miniCalc.divide(-999999999); //testing division by a large negative number
            if(miniCalc.calculate() != 0) {
                System.out.println("FAILED DIVIDE");
            }
            else {
                System.out.println("SUCCESS DIVIDE");
            }

            miniCalc = new MiniCalculator();
            miniCalc.multiply(10); //setting the total to something greater than 1
            miniCalc.divide(2); //testing division that has result gteater than 1
            if(miniCalc.calculate() != 5) {
                System.out.println("FAILED DIVIDE");
            }
            else {
                System.out.println("SUCCESS DIVIDE");
            }
            
        }
        finally {
            miniCalc = new MiniCalculator();
            miniCalc.multiply(50); //setting the total to something greater than 1
            miniCalc.divide(5);
            miniCalc.divide(2); //testing division multiple times
            if(miniCalc.calculate() != 5) {
                System.out.println("FAILED DIVIDE");
            }
            else {
                System.out.println("SUCCESS DIVIDE");
            }
        }
        
    }
    
    //test fot the calculate() method in MiniCalculator
    public static void calculateTest() {
        MiniCalculator miniCalc = new MiniCalculator();
        miniCalc.calculate();
        if(miniCalc.calculate() != miniCalc.total) {
            System.out.println("FAILED CALCULATE");
        }
        else {
            System.out.println("SUCCESS CALCULATE");
        }
    }
}
