public class CitizenCard extends Card {

    CitizenCard() {
        super.lines = new String[] {
                "┌───────┐",
                "│     C │",
                "│  CIT  │",
                "│ C     │",
                "└───────┘",
        };
        super.name = "citizen";
        super.power = 1;
    }

}
