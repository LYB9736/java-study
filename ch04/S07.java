package ch04;

public class S07 {
    public static void main(String[] args) {

        int i = 1;

        // 터미널에서 ctrl + c로 강제종료 할 수 있다.
        while (true) {
            // if(i > 1557){
            // // while문 내부에서 반복을 멈출 때 사용한다.
            // System.out.println("반복종료" + i);
            // break;
            // }
            System.out.println(i);
            // if(i > 1557){
            //     // while문 내부에서 반복을 멈출 때 사용한다.
            //     System.out.println("반복종료" + i);
            //     break;
            // }
            i++;
            if (i > 1557) {
                // while문 내부에서 반복을 멈출 때 사용한다.
                System.out.println("반복종료" + i);
                break;
            }
        }

    }

}
