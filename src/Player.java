public class Player {
    private Deck deck;
    private String name;


    public Player(Deck deck, String name){
        this.deck = deck;
        this.name = name;
    }

    public Player(Player player){
        this.deck = player.deck;
        this.name = player.name;
    }

    public String getName(){
        return name;
    }

    public Deck getDeck(){return deck;}


    public Card pickACard(char firstLetter){
        //this condition checks if 'firstLetter' correct or not
        if((firstLetter != 'e') && (firstLetter != 's') && (firstLetter != 'c')){
            System.out.println("Please enter a correct letter!");
            return null;
        }
        return deck.removeCard(firstLetter);
    }

    public void displayCurrentCards(){
        System.out.println(deck);
    }

    public void switchDeck(){
        if(deck instanceof EmpireDeck)
            deck = new SlaveDeck();
        else
            deck = new EmpireDeck();
    }

}
