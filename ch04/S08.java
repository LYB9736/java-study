package ch04;

public class S08 {
    public static void main(String[] args) {
        // continue

        int i = 0;

        while(i < 1000){
            i++;
            if(i % 2 != 0){
                // continue를 사용한 위치에서 현재 반복회차를 중지한다.
                // 다음 반복으로 넘어간다.
                continue; // 배치 위치를 잘 지정해야한다.
            }
            System.out.println(i);
            
            
        }

    }
    
}
