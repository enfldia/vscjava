package a1010.sec07.exam05;

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;
    //생성자 선언
    Car() {}
    
    Car(String model){
        this(model,"은색",250);
    }
    Car(String model,String color){
        this(model,color,250);
    }
    Car(String model,String color,int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }//이것이 자바다 228p
}
