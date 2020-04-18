/**
 * @author Jose De Jesus Gutierrez
 */

public abstract class Calculator implements Multiplier, Divider {
    protected int total; //field that keeps track of the total

    //Default constructor
    public Calculator() {
        this.total = 1;
    }

    //This method multiplies the value in 'total' times the value in 'y' and saves the result in the 'total' variable
    public void multiply(int y) {
        this.total *= y;
    }

    //This method divides the value in 'total' by the value in 'y' and saves the result in the 'total' variable
    public void divide(int y) {
        this.total /= y;
    }

    //abstract method that returns an int
    abstract int calculate();
    
}
