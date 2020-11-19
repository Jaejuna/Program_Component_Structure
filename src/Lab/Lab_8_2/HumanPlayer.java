package Lab.Lab_8_2;

import javax.swing.*;

public class HumanPlayer extends CardPlayer {

    public HumanPlayer(int max_cards) {
        super(max_cards);
    }

    /**wantsACard - 카드 한 장을 받겠는지 답한다.
     * @return 카드를 받고 싶으면 true, 받고 싶지 않으면 false
     */
    public boolean wantsACard(){
        String response = JOptionPane.showInputDialog("한장 더 드릴까요? (Y/N)");
        return response.equals("Y");

    }
}
