public class EmpireDeck extends Deck {

    public EmpireDeck(){
        // build up Empire deck cards contains -> 1 empire 4 warriors
        super.cards = new Card[]{
                new EmpireCard(),
                new CitizenCard(),
                new CitizenCard(),
                new CitizenCard(),
                new CitizenCard()};
    }
}
