package ch03;

public class S01 {
    public static void main(String[] args) {
        
        int num = 10;

        System.out.println(++num);
        System.out.println(num);

        int num1 = 20;
        System.out.println(num1++);
        System.out.println(num1);

        int num2 = 30;
        int num3 = num2++;

        System.out.println(num3);
    }
}
