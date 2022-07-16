package bbangjun.do_it_java.ch10;

public class P334_CustomerTest {
    public static void main(String[] args) {
        P333_Customer customer = new P333_Customer();

        P333_Buy buyer = customer;
        buyer.buy();

        P333_Sell seller = customer;
        seller.sell();

        if(seller instanceof P333_Customer){
            P333_Customer customer2 = (P333_Customer) seller;
            customer2.buy();
            customer2.sell();
        }
    }
}
