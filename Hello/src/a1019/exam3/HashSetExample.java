package a1019.exam3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        //HashSet 컬렉션 생성
        Set<String> set = new HashSet<>();

        //객체 저장
        set.add("java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Spring");

        // 객체 하나씩 가져와서 처리
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            //객체 하나 가져오기
            String elemet = iterator.next();
            System.out.println(elemet);
            if(elemet.equals("JSP")){
                //가져온 객체를 컬렉션에서 제거
                iterator.remove();
            }
        }
        System.out.println();

        //객체 제거
        set.remove("JDBC");

        //객체 하나씩 가져와서 처리
        for(String elemet : set){
            System.out.println(elemet);
        }

    }
}
