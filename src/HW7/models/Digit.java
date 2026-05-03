package HW7.models;

public class Digit implements Symbol {

    private char digit;

    public Digit(char digit) {
        this.digit = digit;
    }

    @Override
    public String visualize() {
        return String.valueOf(digit);
    }
}
