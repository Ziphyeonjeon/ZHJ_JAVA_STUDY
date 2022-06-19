package bbangjun.do_it_java.ch02;

public class CharacterEx2 {
    public static void main(String[] args){
        char ch1='한';
        char ch2='\uD55C'; // '한'이라는 글자의 유니코드 값 16진수

        System.out.println(ch1);
        System.out.println(ch2);
    }
}
// 유니코드 출력