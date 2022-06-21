package bbangjun.do_it_java.ch07;

import java.util.ArrayList;

public class P224_ArrayListImport {
    public static void main(String[] args) {
        ArrayList<P207_Book> library = new ArrayList<P207_Book>(); // ArrayList 선언

        library.add(new P207_Book("태백산맥", "조정래"));
        library.add(new P207_Book("데미안", "헤르만 헤세"));
        library.add(new P207_Book("어떻게 살 것인가", "유시민"));
        library.add(new P207_Book("토지", "생텍쥐페리"));
        library.add(new P207_Book("어린왕자", "박경리"));

        for(int i=0; i<library.size(); i++){
            P207_Book book = library.get(i);
            book.showBookInfo();
        }
        System.out.println();

        System.out.println("==향상된 for문 사용==");
        for(P207_Book book:library){
            book.showBookInfo();
        }
    }
}
