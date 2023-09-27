package a0927;

public class A0927_1 {
    public static void main(String[] args) {
        int charCode = 'a';
        // int charCode = 'a';
        // int charCode = '5';
        
        
        if ( (65<=charCode) & (charCode<=90)){ //& 는 앞에 값이 거짓이어도 뒷 값 모두 확인
            System.out.println("대문자이군요.");
        }
        if ( (97<=charCode) && (charCode<=122)){ // && 는 앞에 값이 거짓이면 뒷 값은 확인 안하고 넘어감.
            System.out.println("소문자이군요.");
        }
        if ( (48<=charCode) && (charCode<=57)){
            System.out.println("0-9 숫자이군요.");
        }
        //--------------------------------------
        int value = 6;
        // int value = 7;
        if( (value%2==0) | (value%3==0)){
            System.out.println("2 또는 3의 배수이군요.");
        }

        boolean result = (value%2==0) || (value%3==0);
        if(!result){
            System.out.println("2 또는 3의 배수가 아니군요.");
        }
        
    }
}
