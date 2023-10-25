package ex.exception_11.a07;

public class WrongPasswordException  extends Exception{
    public WrongPasswordException(){}
    public WrongPasswordException(String message){
        super(message);
    }
}
