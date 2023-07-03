package ch04;

public class S14 {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " X " + j + " = " + i * j);
            }
            System.out.println();
        }

        // 2번
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        // 3번
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
                

            }
            for (int j = 5; j > i * 2 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}