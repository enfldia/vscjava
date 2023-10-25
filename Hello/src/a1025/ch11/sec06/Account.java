package a1025.ch11.sec06;

public class Account {
    private long balace;

    public Account(){}

    public long getBalace(){
        return balace;
    }

    public void deposit(int money) {
        balace += money;
    }
    public void withdraw(int money) throws InsufficientExcetion{
        if(balace<money){
            throw new InsufficientExcetion("잔고 부족: " + (money-balace)+" 모자람");
        }
        balace -= money;
    }
}
