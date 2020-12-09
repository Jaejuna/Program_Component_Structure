package Final_Team_Project;

public class Card {
    private int suit;
    private int rank;
    private static final String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private static final String[] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

    public Card(int suit, int rank){
        this.suit = suit;
        this.rank = rank;
    }

    /*Card생성자에서 받아온 rank가 0일 경우 11을 반환
     * rank가 0이 아니고 10보다 작은경우 rank에 1을더한다.
     * rank가 10이상인 경우 10을 return
     * 그 외의 경우 0을 return
     */
    public int valueOf(){
        if (this.rank ==0){
            return 11;
        }
        if (this.rank < 10){
            return rank + 1;
        }
        if(this.rank >=10){
            return 10;
        }
        else{
            return 0;
        }
    }

    /*
     * Card생성자에서 받아온 int값을 ranks와 suits배열에 대입하여 문자열로 반환
     */
    public String toString(){
        return ranks[this.rank] + " of " + suits[this.suit];
    }
}
