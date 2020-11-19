package Lab.Lab_8_2;

import javax.swing.*;

public class ComputerPlayer extends CardPlayer{

    public ComputerPlayer(int max_cards) {
        super(max_cards);
    }

    /**wantsACard - 카드 한 장을 받겠는지 답한다.
     * @return 카드를 받고 싶으면 true, 받고 싶지 않으면 false
     */
    public boolean wantsACard(){
        // 컴퓨터 플레이어의 전략
        return true;

    }
}
