package a1011.aven;

public class Coffeetest {
    public static void main(String[] args) {
        Coffee c = new Coffee("아메리카노",3000); //생성자로 객체를 생성할때는 setter를 거치치 않아도 값이 필드에 저장된다.
        System.out.printf("%s(%d원)->", c.getName(),c.getPrice());
        c.setPrice(c.getPrice()+500);
        System.out.printf("%s(%d원)", c.getName(), c.getPrice());
    }
}

class Coffee{
    private String name;
    private int price;
    
    public Coffee(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    

}