package a1014.object;

public class Archer {
    String name;
    String power;
    
    public Archer(String name, String power) {
        this.name = name;
        this.power = power;
    }
    //equals 는 자바 자체에 이미 기능이 주어진 메소드다.
    //아래의 우리가 원하는 기능으로 작동하게 하려면 Over
    // @Override 가 생략되어 있음.
    public boolean equals(Object obj){

        Archer temp = (Archer)obj;
        if(name == temp.name && power == temp.power){
            return true;
        }else{
            return false;
        }
    }

}
