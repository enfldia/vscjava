package a1018.generic.exam02;

public class GenericMethod {
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3};
        Integer firstInt = Utility.getFirstElement(intArray);
        System.out.println("첫번째 정수 : "+firstInt);

        String[] strAtrray = { "apple","nanana","cherry"};
        String firtStr = Utility.getFirstElement(strAtrray);
        System.out.println("첫번 째 문자열 : "+firtStr);
    }
}
class Utility{
    public static <T> T getFirstElement(T[] array){
        if (array != null && array.length > 0){
            return array[0];
        }
        return null;
    }
}

