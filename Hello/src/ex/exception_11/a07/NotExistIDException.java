package ex.exception_11.a07;

public class NotExistIDException  extends Exception{
    public NotExistIDException(){}
    public NotExistIDException(String message){
        super(message);
    }
}
