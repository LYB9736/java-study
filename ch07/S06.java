package ch07;

// 다른 패키지의 클래스를 가져올 때
// import를 사용한다.
import ch07.sub.Sub01;

public class S06 {

    public static void main(String[] args) {
        Sub01 sub01 = new Sub01();

        System.out.println(sub01.data);
    }
    
}
