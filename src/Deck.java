public class Deck {
    public Card[] cards;
    private int nb = 5;

    public String toString() {
        if(isDeckEmpty()){
            return "there is no cards left!";
        }else {
            String x = "";
            for (int i = 0; i < Card.getNumOfLines(); i++) {
                for (int j = 0; j < nb; j++) {
                    x += cards[j].lines[i] + "\t";
                }
                x += "\n";
            }
            return x;
        }
    }

    public boolean isDeckEmpty(){
        return nb == 0;
    }

    public Card removeCard(char firstLetter){
        if(!isDeckEmpty()) {
            for (int i = 0; i < nb; i++) {
                if (cards[i].name.charAt(0) == firstLetter) {
                    Card temp = cards[i];
                    cards[i] = cards[--nb];
                    return temp;
                }
            }
        }
        return null;
    }

    public int getNb() {
        return nb;
    }
}
