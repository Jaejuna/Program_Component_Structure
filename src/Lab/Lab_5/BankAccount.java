package Lab.Lab_5;

import javax.swing.*;

public class BankAccount {

    private int balance;    //Invariant : balance >= 0

    /* BankAccount - 계좌 개설
     * @Param initial_amount - 초기 입금 금액 (0 이상 양수) */
    public BankAccount(int initial_amount) {
        if (initial_amount >= 0)
            balance = initial_amount;
        else
            balance = 0;
    }

    /* deposit
     * @Param deposit_amount - 입금 금액 (0 이상 양수)
     * @return 입금 성공하면 true, 실패하면 false */
    public boolean deposit(int amount) {
        boolean result = false;
        if (amount >= 0) {
            balance = balance + amount;
            result = true;
        } else
            JOptionPane.showMessageDialog(null, "입금액에 문제가 있어서 입금이 취소되었습니다.");
        return result;
    }

    /* deposit
     * @Param withdraw_amount - 출금 금액 (0 이상 양수)
     * @return 출금 성공하면 true, 실패하면 false */
    public boolean withdraw(int amount) {
        boolean result = false;
        if (amount < 0) {
            JOptionPane.showMessageDialog(null, "출금액에 문제가 있어서 입금이 취소되었습니다.");
        } else if (amount > balance)
            JOptionPane.showMessageDialog(null, "출금액이 잔고액보다 많아서 입금이 취소되었습니다.");
        else {
            balance = balance - amount;
            result = true;
        }
        return result;
    }


    /* getBalance - 잔액 확인
     * @return 잔액 */
    public int getBalance() {
        return balance;
    }
}