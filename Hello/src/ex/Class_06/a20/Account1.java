package ex.Class_06.a20;

public class Account1 {
    
    private String anum;
    private String name;
    private int balance;
    
    public Account1(String anum,String name,int balance){
        this.anum = anum;
        this.name = name;
        this.balance = balance;
    }

    public String getAnum() {
        return anum;
    }

    public void setAnum(String anum) {
        this.anum = anum;
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

    @Override
    public String toString(){
        return anum + " " + name + " " + balance +"\n";
    }
}
