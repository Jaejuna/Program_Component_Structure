package Lab.Lab_5;

public class AccountController2 {

    private BankReader reader;
    private BankWriter primary_writer;
    private BankWriter secondary_writer;
    private BankAccount primary_account;
    private BankAccount secondary_account;
    private BankAccount active_account;
    private BankWriter active_writer;
    private BankWriter non_active_writer;
    private BankAccount non_active_account;

    public AccountController2(BankReader r, BankWriter w1, BankAccount a1, BankWriter w2, BankAccount a2){
        reader = r;
        primary_writer = w1;
        secondary_writer = w2;
        primary_account = a1;
        secondary_account = a2;
        active_account = primary_account;
        active_writer = primary_writer;
        non_active_writer = active_writer;
        non_active_account = active_account;
    }

    private void resetAccount(BankAccount new_account, BankWriter new_writer){
        if (active_account != active_account)
            active_account = non_active_account;
        if(active_writer != active_writer)
            active_writer = non_active_writer;
        non_active_writer.showTransaction("비활성");
        active_account = new_account;
        active_writer = new_writer;
        active_writer.showTransaction("활성");
    }

    public boolean send(int amount){
        boolean result = false;
        amount = reader.readAmount();
        if (amount >= 0) {
            active_account.withdraw(amount);
            non_active_account.deposit(amount);
            result = true;
        }
        else
            active_writer.showTransaction("이체 금액에 문제가 있어 취소합니다.");
        return result;
    }

    public boolean receive(int amount){
        boolean result = false;
        amount = reader.readAmount();
        if(amount >= 0) {
            non_active_account.withdraw(amount);
            active_account.deposit(amount);
            result = true;
        }
        else
            active_writer.showTransaction("입금 금액에 문제가 있어 취소합니다");
        return result;
    }

    public void processTransactions() {
        char command = reader.readCommand("계좌#1 P, 계좌#2 S, 입금 D금액, 출금 W금액, 이체 E금액, 입급 I금액, 종료 Q;");
        if (command == 'Q'){
            active_writer.showTransaction("서비스를 마칩니다.");
            return;
        }
        else if (command == 'D'){
            int amount = reader.readAmount();
            if (active_account.deposit(amount))
                active_writer.showTransaction(amount, "입금");
            else
                active_writer.showTransaction("입금 실패");
        }
        else if (command == 'W'){
            int amount = reader.readAmount();
            if (active_account.withdraw(amount))
                active_writer.showTransaction(amount, "출금");
            else
                active_writer.showTransaction("출금 실패");
        }
        else if (command == 'E'){
            int amount = reader.readAmount();
            send(amount);
        }
        else if (command == 'I'){
            int amount = reader.readAmount();
            receive(amount);
        }
        else if (command == 'P')
            resetAccount(primary_account, primary_writer);
        else if (command == 'S')
            resetAccount(secondary_account, secondary_writer);
        else
            active_writer.showTransaction("요청 오류");
        this.processTransactions();
    }
}
