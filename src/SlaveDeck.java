public class SlaveDeck extends Deck {

    public SlaveDeck(){
        // build up Slave Deck contains -> 1 slave 4 warriors
        super.cards = new Card[] {
                new SlaveCard(),
                new CitizenCard(),
                new CitizenCard(),
                new CitizenCard(),
                new CitizenCard(),
        };
    }
}
