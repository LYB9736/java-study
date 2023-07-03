package ch04;

import java.util.Scanner;

public class S02Quiz {
    public static void main(String[] args) {
        // 점수를 입력 받아서
        Scanner scanner = new Scanner(System.in);
        
        int nextInt = scanner.nextInt();

        if(nextInt >= 90) {
            System.out.println("당신의 성적은 A입니다.");
        }else if(nextInt >= 80){
            System.out.println("당신의 성적은 B입니다");
        }else if(nextInt >= 70){
            System.out.println("당신의 성적은 C입니다.");
        }else if(nextInt >= 60){
            System.out.println("당신의 성적은 D입니다.");
        }else{
            System.out.println("당신의 성적은 F입니다.");
        }

        scanner.close();
    }
}
