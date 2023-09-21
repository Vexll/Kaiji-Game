abstract class Card {
    protected String[] lines;
    private final static int numOfLines = 5;
    protected int power;
    protected String name;

    public Card(){
        this.name = "";
        this.power = 0;
    }
    public static int getNumOfLines(){
        return numOfLines;
    }


}
