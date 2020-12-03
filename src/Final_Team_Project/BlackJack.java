package Final_Team_Project;

import javax.swing.*;
import java.awt.event.*;

public class BlackJack{

    public Hand player;
    public Hand dealer;
    public Deck deck;
    public BlackJackGUI GUI;
    private int play = 0;
    private int hit = 0;
    private int chip =0;
    private int stand =0;

    public BlackJack(){
        GUI =  new BlackJackGUI();
        GUI.setPlayAction(new PlayAction());
        GUI.setHitAction(new HitAction());
        GUI.setStandAction(new StandAction());
        GUI.setExitButton(new ExitAction());
        GUI.enablePlayButton();
    }

    /*
     * Exit버튼을 눌렀을 경우 게임 종료
     */
    class ExitAction extends JPanel implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }


    /*
     * Play버튼 눌렀을 경우 동작설명
     * Deck을 새롭게 생성하고 shuffle을 진행한다
     * player와 dealer의 Card배열을 생성한후 card를 추가해준다
     * displayPlayer와 displayDealerCard를 통해 카드를 보여준다.
     * player와 dealer blackJack이 아니고 player의 카드합이 21이하라면
     * HIt,과 Stand버튼을 활성화해 선택할 수 있게한다.
     * 그게 아니면 게임을 끝낸다.
     */
    class PlayAction implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            deck = new Deck();
            deck.shuffle();
            player = new Hand();
            dealer = new Hand();
            player.add(deck.nextCard());
            dealer.add(deck.nextCard());
            player.add(deck.nextCard());
            dealer.add(deck.nextCard());
            GUI.displayPlayer(player);
            GUI.displayDealerCard(dealer.getTopCard());
            if(!player.hasBlackJack() && !dealer.hasBlackJack() && !player.isBusted()){
                GUI.enableHitAndStandButtons();}
            if(player.hasBlackJack() || dealer.hasBlackJack() || player.isBusted()){
                finishGame();
            }
        }
    }

    /* Hit버튼의 기능 구현
     * 만약 플레이어가 Bust되지 않고 21이 되지않으면 카드를 하나 추가
     * 만약 플레이어가 Bust되거나 21, 블랙잭이 되면 finishGame 메소드 실해
     */
    class HitAction implements ActionListener{
        public void actionPerformed (ActionEvent e) {

            if(!player.isBusted() && player.valueOf() !=21){
                player.add(deck.nextCard());
                GUI.displayPlayer(player);
            }
            if(player.isBusted() || player.valueOf()==21){
                finishGame();
            }
        }
    }


    //Stand 버튼을 누르면 finishGame 메소드 실행
    class StandAction implements ActionListener{
        public void actionPerformed (ActionEvent e) {
            finishGame();
        }
    }

    /* 플레이어가 BlackJack을 가진다면 Win 출력 후, chip 2개 추가
     * 딜러와 플레이어 둘다 블랙잭을 가진다면 Draw 출력
     * 딜러가 블랙잭을 가진다면 Lose 출력 후, chip 1개 빼기
     * 플레이어가 Bust 된다면 Bust 출력 후, chip 1개 빼기
     * 딜러의 카드 값의 합이 17보다 작다면 카드를 한장 더 뽑기
     * 딜러가 Bust 된다면 Win 출력 후, Chip 2개 더하기
     * 딜러가 블랙잭을 갖는다면 Lose 출력 후, Chip 1개 빼기
     * 딜러의 카드 값의 합과 플레이어의 카드 값의 합이 같다면 Draw 출력
     * 딜러의 카드 값의 합이 플레이어의 카드 값의 합보다 크다면 Lose 출력 후, chip 1개 빼기
     * 플레이어의 카드 값의 합이 딜러의 카드 값의 합보다 크다면 Win 출력 후, chip 1개 추가
     */
    private void finishGame(){
        if(player.hasBlackJack()){
            GUI.displayDealer(dealer);
            GUI.displayPlayer(player);
            GUI.displayOutcome("Win");
            GUI.chips(2);
            GUI.displayOutcome(String.valueOf(GUI.chip));
        }

        else if (dealer.hasBlackJack() && player.hasBlackJack()) {
            GUI.displayDealer(dealer);
            GUI.displayPlayer(player);
            GUI.displayOutcome("Draw");
        }

        else if(dealer.hasBlackJack()){
            GUI.displayDealer(dealer);
            GUI.displayPlayer(player);
            GUI.displayOutcome("Lose");
            GUI.chips(-1);
            GUI.displayOutcome(String.valueOf(GUI.chip));
        }

        else if (player.isBusted()){
            GUI.displayDealer(dealer);
            GUI.displayPlayer(player);
            GUI.displayOutcome("Lose");
            GUI.chips(-1);
            GUI.displayOutcome(String.valueOf(GUI.chip));
        }

        else {
            while( dealer.valueOf()<17 && !dealer.isBusted() ){
                dealer.add(deck.nextCard());
            }

            if(dealer.isBusted()) {
                GUI.displayDealer(dealer);
                GUI.displayPlayer(player);
                GUI.displayOutcome("Win");
                GUI.chips(1);
                GUI.displayOutcome(String.valueOf(GUI.chip));
            }

            else if (dealer.hasBlackJack()){
                GUI.displayDealer(dealer);
                GUI.displayPlayer(player);
                GUI.displayOutcome("Lose");
                GUI.chips(-1);
                GUI.displayOutcome(String.valueOf(GUI.chip));
            }

            else if (dealer.valueOf() == player.valueOf()) {
                GUI.displayDealer(dealer);
                GUI.displayPlayer(player);
                GUI.displayOutcome("Draw");
            }

            else if (dealer.valueOf() > player.valueOf()){
                GUI.displayDealer(dealer);
                GUI.displayPlayer(player);
                GUI.displayOutcome("Lose");
                GUI.chips(-1);
                GUI.displayOutcome(String.valueOf(GUI.chip));
            }

            else if (player.valueOf() > dealer.valueOf()){
                GUI.displayDealer(dealer);
                GUI.displayPlayer(player);
                GUI.displayOutcome("Win");
                GUI.chips(1);
                GUI.displayOutcome(String.valueOf(GUI.chip));
            }
        }
        GUI.enablePlayButton();
    }


    public static void main(String[] args){
        new BlackJack();
    }
}
