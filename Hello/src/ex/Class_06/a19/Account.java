package ex.Class_06.a19;

public class Account {
    
    private static final int MIN_BALANCE = 0;
    private static final int MAX_BALANCE = 1_000_000;

    private int balance;

    public int getBalance() {
        return balance;
    }
    //set의 장점으로는 유효성 검사를 할 수 있다.
    //외부에서 필드를 마음대로 읽고 변경하는 것을 막는다.
    public void setBalance(int balance) {
        if(balance>=MIN_BALANCE && balance <= MAX_BALANCE)
        this.balance = balance;
    }
}
