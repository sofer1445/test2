public class Element {
    private char letter;
    private int amount;
    // b,e,a,t,a,b,z
    public Element(char letter , int amount){
        this.amount = amount;
        this.letter = letter;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
