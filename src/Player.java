public class Player {
    public Deck deck;
    private String name;

    public Player(Deck deck, String name){
        this.deck = deck;
        this.name = name;
    }

    public Player(){

    }

    public String getName(){
        return name;
    }

    public boolean isDeckEmpty(){
        return deck.getNb() == deck.cards.length;
    }

    public boolean pickACard(char firstLetter){
        //this condition checks if 'firstLetter' correct or not
        if((firstLetter != 'e') && (firstLetter != 's') && (firstLetter != 'c')){
            System.out.println("enter a correct letter!");
            return false;
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
