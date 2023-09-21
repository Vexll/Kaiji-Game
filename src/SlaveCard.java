public class SlaveCard extends Card{

    public SlaveCard() {
        super.lines = new String[] {
                "┌───────┐",
                "│     S │",
                "│  SLV  │",
                "│ S     │",
                "└───────┘",
        };
        super.power = 0;
        super.name = "slave";
    }

}
