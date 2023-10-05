package a1005;

public class A1005_11 {
    public static void main(String[] args) {
        int[] scores;
        //배열 변수에 배열을 대입
        scores = new int[] {83,90,87};
        //배열 항목의 총합을 구하고 출력
        int sum1 = 0;
        for(int i = 0;i<3;i++){
            sum1 += scores[i];
        }
        System.out.println("총합:" + sum1);
        //배열을 매개값으로 주고, printItem() 메소드 호출
        printItem(new int[] {83,90,87});
    }
    //printItem()메소드 선언
    public static void printItem(int[] scores){
        //static 은 인스턴스에 종속되지 않고, 클래스 자체에 속한 메소드로 만들고 싶을 때 사용합니다.

        //void 는 리턴 값이 없을 경우 적는다.
        
        //매개변수가 참조하는 배열의 항목을 출력
        for(int i=0;i<3;i++){
            System.out.println("score["+ i +"]:" + scores[i]);
        }
    }
}//이것이 자바다.170p
