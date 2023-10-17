package a_practice.a20;

public class Account {
    //필드 선언
    private String number;
    private String name;
    private int balance;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    //생성자 선언
    public Account(String number,String name,int balance){
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString(){
    return number + " " + name + " " + balance +"\n";    
    }
}
