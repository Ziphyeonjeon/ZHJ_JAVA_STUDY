package bbangjun.do_it_java.ch07;

public class P216_DeepCopy {
    public static void main(String[] args) {
        P207_Book[] bookArray1 = new P207_Book[3];
        P207_Book[] bookArray2 = new P207_Book[3];

        System.out.println("초기화 전");
        for(int i=0; i< bookArray1.length; i++){
            System.out.println(bookArray1[i]);
            System.out.println(bookArray2[i]);
        }

        bookArray1[0]=new P207_Book("태백산맥", "조정래");
        bookArray1[1]=new P207_Book("데미안", "헤르만 헤세");
        bookArray1[2]=new P207_Book("어떻게 살 것인가", "유시민");

        System.out.println("bookArray1 초기화 후 ");
        for(int i=0; i< bookArray1.length; i++){
            System.out.println(bookArray1[i]);
            System.out.println(bookArray2[i]);
        }

        bookArray2[0]=new P207_Book();
        bookArray2[1]=new P207_Book();
        bookArray2[2]=new P207_Book();

        for(int i=0; i<bookArray1.length; i++){
            bookArray2[i].setBookName(bookArray1[i].getBookName());
            bookArray2[i].setAuthor((bookArray1[i].getAuthor()));
        }

        System.out.println("값들 복사 후 1의 값 변경 전");
        for(int i=0; i<bookArray1.length; i++){
            System.out.println(bookArray1[i].getBookName()+","+bookArray1[i].getAuthor());
            System.out.println(bookArray2[i].getBookName()+","+bookArray2[i].getAuthor());
        }

        bookArray1[0].setBookName("나목");
        bookArray1[0].setAuthor("박완서");

        System.out.println("값들 복사 후 1의 값 변경 후");
        for(int i=0; i<bookArray1.length; i++){
            System.out.println(bookArray1[i].getBookName()+","+bookArray1[i].getAuthor());
            System.out.println(bookArray2[i].getBookName()+","+bookArray2[i].getAuthor());
        }
    }
}
