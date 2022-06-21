package bbangjun.do_it_java.ch07;

public class P207_Book {
    private String bookName;
    private String author;

    public P207_Book(){}

    public P207_Book(String bookName, String author){
        this.bookName=bookName;
        this.author=author;
    }

    public String getBookName(){
        return bookName;
    }

    public void setBookName(String bookName){
        this.bookName=bookName;
    }
    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author=author;
    }

    public void showBookInfo(){
        System.out.println(bookName+","+author);
    }

}
