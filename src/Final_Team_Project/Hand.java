package Final_Team_Project;

// 손에 있는 카드 생성, 계산하는 model 클래스
public class Hand{
    public int count = 0;
    private Card[] Hand;

    // Hand array 생성
    public Hand() {
        Hand = new Card[20];
    }

    // Hand array에 card 1개를 추가
    public void add(Card card){
        Hand[count++] = card;
    }

    // 첫번째 카드 return
    public Card getTopCard(){
        return Hand[0];
    }

    //
    public int valueOf(){
        int sum=0;
        int rank=0;
        int count2= count;
        int aces = 0;
        for(int i=0; i< count2; i++){
            rank = Hand[i].valueOf();
            sum += rank;
            if( rank == 11){
                aces++;
            }
        }
        while (aces > 0 && sum >21){
            sum -= 10;
            aces--;
        }
        return sum;
    }

    // 변수 total에 첫번째 카드랑 2번째 카드의 값을 합해서 저장
    public boolean hasBlackJack(){
        int total = Hand[0].valueOf() + Hand[1].valueOf();
        return total == 21;
    }


    /*
    @param- valueOf가 21초과하면 true를 return, 21이하면 false를 return
     */
    public boolean isBusted(){
        return valueOf() > 21;
    }

    /*
     *isBusted()가 true이면 Bust를 return
     * hasBlackJack이 true 이면 BlackJack을 return
     * 그 외의 경우는 for문에서 나온 string을 출력
     */
    public String toString(){
        String string ="";
        int count3 = count;
        for(int i=0; i< count3; i++){
            string += Hand[i].toString();
            string += "\n";
        }
        if(isBusted()){
            string += "\n\n";
            string += "Bust";
        }
        if(hasBlackJack()){
            string += "\n\n";
            string += "Blackjack";
        }
        return string;
    }
}
