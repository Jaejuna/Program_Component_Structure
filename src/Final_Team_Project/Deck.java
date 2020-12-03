package Final_Team_Project;

import java.util.*;

// Card Deck 생성하는 클래스
public class Deck{
    private Card[] DeckArray = new Card[52];
    private int index = 0;

    /*
     @param-Card a = Card(i,j)에 값을 대입해서 나온것을 대입
     @param-DeckArray[]-Card a를 대입하고
     index2를 1증가시킴
     */
    public Deck() {
        int index2 = 0;
        for(int i =0; i<4; i++){
            for(int j=0; j<13; j++){
                Card a = new Card(i,j);
                DeckArray[index2] = a;
                index2++;
            }
        }
    }

    // index에 있는 값을 셔플 해주는 메소드
    public void shuffle(){
        index = 0;
        int counter=0;
        while (counter<1000){
            Random rand = new Random();
            int x= rand.nextInt(52);
            int y= rand.nextInt(52);
            Card stored = DeckArray[x];
            DeckArray[x] = DeckArray[y];
            DeckArray[y] = stored;
            counter++;
        }
    }

    // 인덱스(Deck)에 있는 수가 52보다 적으면 다른 인덱스를 추가
    public Card nextCard(){
        if(index<52){
            index++;
            return DeckArray[index-1];
        }
        else{
            return null;
        }
    }
}
