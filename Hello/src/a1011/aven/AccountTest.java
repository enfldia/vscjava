package a1011.aven;

public class AccountTest {
    public static void main(String[] args) {
        Account acc = new Account();
        // acc.balance = 100; //private 필드는 외부에서 접근(사용)불가
        acc.setbalance(1000);
        System.out.printf("잔액: %d",acc.getbalance());
    }
}
class Account{
    private int balance;

    //게터(getter) Balance 값을 호출 담당
    public int getbalance(){
        return balance;
    }
    //세터(setter) Balance 값을 지정 담당(필드의 상태 변경)
    public void setbalance(int b){
        balance = b;
    }
}