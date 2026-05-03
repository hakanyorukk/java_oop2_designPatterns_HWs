package HW7.models;

public class LatinLetter implements Symbol {

    private char letter;

    public LatinLetter(char letter) {
        this.letter = letter;
    }

    @Override
    public String visualize() {
        return String.valueOf(letter);
    }
}
