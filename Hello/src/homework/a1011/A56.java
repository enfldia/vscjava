package homework.a1011;


public class A56 {
    public static void main(String[] args) {
        int x1 = (int)(Math.random()+0.5);
        int x2 = (int)(Math.random()+0.5);
        int x3 = (int)(Math.random()+0.5);
        int x4 = (int)(Math.random()+0.5);
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        int sum = x1+x2+x3+x4;
        
        switch(sum){
            case 1:
            System.out.println("도 가 나왔습니다.");
            break;
            case 2:
            System.out.println("개 가 나왔습니다.");
            break;
            case 3:
            System.out.println("걸 가 나왔습니다.");
            break;
            case 4:
            System.out.println("윷 가 나왔습니다.");
            break;
            default :
            System.out.println("모 가 나왔습니다.");
            break;
        }

        /* Scanner sc = new Scanner(System.in);
        int[] yutStates = new int[4];

        //4가지 윷의 상태 입력
        for(int i=0;i<4;i++){
            yutStates[i] = sc.nextInt();
        }
        int flippedCount = 0;
        for(int state : yutStates){
            if(state==1){
                flippedCount++;
            }
        }
        switch(flippedCount){
            case 0:
            System.out.println("모 가 나왔습니다.");
            break;
            case 1:
            System.out.println("도 가 나왔습니다.");
            break;
            case 2:
            System.out.println("개 가 나왔습니다.");
            break;
            case 3:
            System.out.println("걸 가 나왔습니다.");
            break;
            case 4:
            System.out.println("윷 가 나왔습니다.");
            break;
            default :
            System.out.println("잘못된 값을 입력했습니다.");
            break;
        } */
    }
}
