package bbangjun.do_it_java.ch07;

public class P208_BookArray {
    public static void main(String[] args) {
        P207_Book[] library = new P207_Book[5];

        for(int i=0; i<library.length; i++){
            System.out.println(library[i]);
        }
    }
}
// 이 상태에서는 아직 인스턴스 5개가 생성된 것이 아니다.
// 인스턴스 주소 값을 담을 공간 5개를 생성하는 코드이다.