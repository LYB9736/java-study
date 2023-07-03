package ch04;

import java.util.Scanner;

public class S03Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nextInt = scanner.nextInt();

        switch (nextInt/10) {
            case 10:
            case 9:
                System.out.println("당신의 성적은 A입니다.");
                break;
            case 8:
                System.out.println("당신의 성적은 B입니다.");
                break;
            case 7:
                System.out.println("당신의 성적은 C입니다.");
                break;
            case 6:
                System.out.println("당신의 성적은 D입니다.");
                break;
            default:
                System.out.println("당신의 성적은 F입니다.");
                break;
        }

        scanner.close();
    }

}
