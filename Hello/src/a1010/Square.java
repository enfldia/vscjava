package a1010;

public class Square {
    void lengthInput(){
        System.out.println("변의 길이를 입력하세요.");
    }
    void areaOut(int x){
        System.out.println("정사각형의 넓이는 :"+  x +"입니다.");
    }
    int length;//한변의 길이
    int area(int length){
        int result =  length*length;
        return result;
    };
    public static void main(String[] args) {
        Square s = new Square();
        s.lengthInput();
        
        s.length = 4;
    }
}
