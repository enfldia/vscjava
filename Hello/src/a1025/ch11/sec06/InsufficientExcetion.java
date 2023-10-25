package a1025.ch11.sec06;

public class InsufficientExcetion extends Exception{
    public InsufficientExcetion(){

    }
    public InsufficientExcetion(String message){
        super(message);
    }
}
