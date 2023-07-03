package ch04;

public class S03Temp {
    public static void main(String[] args) {
        int num = -10;

        System.out.println(num % 2);
        System.out.println(num % 3);

        switch (num % 2 + num % 3) {
            case -1:
            case -2:
            case -3:
                System.out.println("잘못 입력");
                return;
            default:
                System.out.println("아주 좋아요~");
        }
    }

}
