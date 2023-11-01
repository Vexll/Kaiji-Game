abstract class Card {
    protected String[] lines;
    private final static int numOfLines = 5;
    protected String name;

    public Card(){
        this.name = "";
    }
    public static int getNumOfLines(){
        return numOfLines;
    }

}
