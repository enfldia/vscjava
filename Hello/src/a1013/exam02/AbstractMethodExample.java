package a1013.exam02;

public class AbstractMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        //매개변수의 다형성 이용해서 만든거
        animalSound(new Dog());
        animalSound(new Cat());

        
    }
    public static void animalSound(Animal animal){
        animal.sound();
    }
}
