package Final_Team_Project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BlackJackGUI extends JFrame {

    private Container contentPane;
    private JPanel buttonPanel = new JPanel();
    private JButton playButton = new JButton("Play ");
    private JButton hitButton = new JButton("Hit  ");
    private JButton standButton = new JButton("Stand");
    private JButton exitButton = new JButton("Exit");
    private JPanel outputPanel = new JPanel();
    private JTextArea playerArea = new JTextArea();
    private JTextArea dealerArea = new JTextArea();
    public int chip=0;


    //View constructor
    public BlackJackGUI()
    {
        contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        outputPanel.setLayout(new BorderLayout());
        setSize(new Dimension(600, 400));
        setTitle("BlackJack");

        contentPane.add(buttonPanel,  BorderLayout.SOUTH);
        buttonPanel.add(playButton, null);
        buttonPanel.add(hitButton, null);
        buttonPanel.add(standButton, null);
        buttonPanel.add(exitButton, null);
        contentPane.add(outputPanel, BorderLayout.CENTER);
        outputPanel.setLayout(new FlowLayout());
        outputPanel.add(playerArea, null);
        outputPanel.add(dealerArea, null);
        hitButton.setEnabled(false);
        standButton.setEnabled(false);
        playerArea.setText("  ");
        dealerArea.setText("  ");
        int width = getWidth();
        int height = getHeight();
        playerArea.setPreferredSize(new Dimension(width/2-20,height));
        dealerArea.setPreferredSize(new Dimension(width/2-20,height));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    //Play 버튼 활성화
    public void setPlayAction(ActionListener listener){
        playButton.addActionListener(listener);
    }

    //Hit 버튼 활성화
    public void setHitAction(ActionListener listener){
        hitButton.addActionListener(listener);
    }

    //Stand 버튼 활성화
    public void setStandAction(ActionListener listener){
        standButton.addActionListener(listener);
    }

    //Exit 버튼 활성화
    public void setExitButton(ActionListener listener){
        exitButton.addActionListener(listener);
    }

    // Player(본인)의 카드 표시
    public void displayPlayer(Hand hand){
        playerArea.setText("Player:\n"+hand.valueOf()+"\n"+hand);
    }

    // Dealer의 카드 표시
    public void displayDealer(Hand hand){
        dealerArea.setText("Dealer:\n"+hand.valueOf()+"\n"+hand);
    }

    // Dealer의 첫번째 카드만 표시
    public void displayDealerCard(Card card){
        dealerArea.setText("Dealer Shows:\n"+card);
    }

    //칩의 개수와 게임의 결과 반환 (Win, Bust, Lose, Push)
    public void displayOutcome(String outcome){
        playerArea.setText(playerArea.getText() + "\n\n " + outcome);
    }

    //게임중에는 Hit와 Stand 버튼만 사용할 수 있음
    public void enableHitAndStandButtons(){
        playButton.setEnabled(false);
        hitButton.setEnabled(true);
        standButton.setEnabled(true);
    }

    //게임이 아닐때는 Play 버튼만 활성화 할 수 있음
    public void enablePlayButton(){
        playButton.setEnabled(true);
        hitButton.setEnabled(false);
        standButton.setEnabled(false);
    }

    // BlackJack finishGame()에서 받은 i 값을 chip에 더해서 return
    public int chips(int i){
        chip = i + chip;
        return chip;
    }
}
