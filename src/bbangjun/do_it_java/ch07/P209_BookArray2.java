package bbangjun.do_it_java.ch07;

public class P209_BookArray2 {
    public static void main(String[] args) {
        P207_Book[] library = new P207_Book[5];

        library[0]=new P207_Book("디지털논리회로1", "이준환");
        library[1]=new P207_Book("객체지향프로그래밍설계", "공영호");
        library[2]=new P207_Book("컴퓨터공학기초실험1", "이형근");
        library[3]=new P207_Book("회로이론", "황호영");
        library[4]=new P207_Book("객체지향프로그래밍실습", "공영호");

        for(int i=0; i< library.length; i++){
            library[i].showBookInfo();
        }

        for(int i=0; i< library.length; i++){
            System.out.println(library[i]);
        }
    }
}
// 인스턴스가 이제서야 생성된 것을 주소값을 통해 확인할 수 있다.