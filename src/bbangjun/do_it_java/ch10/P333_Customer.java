package bbangjun.do_it_java.ch10;

public class P333_Customer implements P333_Buy, P333_Sell {
    public void sell(){
        System.out.println("판매하기");
    }

    public void buy(){
        System.out.println("구매하기");
    }
}
