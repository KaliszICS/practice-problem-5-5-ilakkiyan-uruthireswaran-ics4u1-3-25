public class Card implements Comparable<Card>{
    private String name;
    private String suit;

    public Card(String name, String suit) {
        this.name = name;
        this.suit = suit;
    }

    public String getName() {
        return name;
    }

    public String getSuit() {
        return suit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return this.name + " of " + this.suit;
    }

    //If name == King, set value = 13
    // else If name == Queen, 12
    // else If Name == Jack, 11
    // else If name == Ace, 1
    // else 1 - 9

    @Override
    public int compareTo(Card newCard) {
        int thisValue = getNameValue(this.name);
        int newValue = getNameValue(newCard.name);

        if (thisValue != newValue) {
            return thisValue - newValue;
        }

        int thisSuitValue = getSuitValue(this.suit);
        int thisOtherSuitValue = getSuitValue(newCard.suit);

        return thisSuitValue - thisOtherSuitValue;
        }

    private int getNameValue(String name) {
        switch (name.toLowerCase()) {
            case "ace": return 1;
            case "2" : return 2;
            case "3" : return 3;
            case "4" : return 4;
            case "5" : return 5;
            case "6" : return 6;
            case "7" : return 7;
            case "8" : return 8;
            case "9" : return 9;
            case "10" : return 10;
            case "jack" : return 11;
            case "queen" : return 12;
            case "king" : return 13;
            default:
                return Integer.MAX_VALUE;
        }
    }

    private int getSuitValue(String suit) {
        switch (suit.toLowerCase()) {
            case "hearts": return 1;
            case "clubs" : return 2;
            case "diamonds" : return 3;
            case "spades" : return 4;
            
        
            default:
                return Integer.MAX_VALUE;
        }
    }


}
