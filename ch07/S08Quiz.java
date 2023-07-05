// package ch07;

// import javax.sound.midi.Soundbank;

// // 인터페이스 / 추상클래스 / 클래스를 이용해서
// // 스마트폰
// // 갤 / 아
// // 갤럭시 - 통화 / 문자 / 빅스비
// // 아이폰 - 통화 / 문자 / 시리
// // S23
// // 14

// interface 문자 {
//     void message();
// }

// interface 통화 {
//     void call();
// }

// interface 빅스비 {
//     void bixby();
// }

// interface 시리 {
//     void siri();
// }

// abstract class 스마트폰 implements 문자, 통화 {

//     public void message(){

//     }

//     public void call(){

//     }
// }

// class 갤럭시S23 extends 스마트폰 implements 빅스비 {
    
//     public void message() {
//         System.out.println("문자");
//     }

//     public void call() {
//         System.out.println("통화");
//     }

//     public void bixby() {
//         System.out.println("빅스비");
//     }

// }

// class 아이폰14 extends 스마트폰 implements 시리 {


//     public void message() {
//         System.out.println("문자");
//     }

    
//     public void call() {
//         System.out.println("통화");
//     }

    
//     public void siri() {
//         System.out.println("시리");
//     }

// }

// public class S08Quiz {

//     public static void main(String[] args) {
        
//         갤럭시S23 galaxy = new 갤럭시S23();

//         아이폰14 iphone = new 아이폰14();

//         galaxy.call();
//         iphone.siri();

//     }
    
// }
