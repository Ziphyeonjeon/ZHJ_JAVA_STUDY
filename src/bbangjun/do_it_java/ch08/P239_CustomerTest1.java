package bbangjun.do_it_java.ch08;

public class P239_CustomerTest1 {
    private int a=3;
    public static void main(String[] args) {
        P234_Customer customerLee = new P234_Customer();
        customerLee.setCustomerID(10010);
        customerLee.setCustomerName("이순신");
        customerLee.bonusPoint=1000;
        System.out.println(customerLee.showCustomerInfo());

        P237_VIPCustomer customerKim = new P237_VIPCustomer();
        customerKim.setCustomerID(10020);
        customerKim.setCustomerName("김유신");
        customerKim.bonusPoint=10000;
        System.out.println(customerKim.showCustomerInfo()); // 출력됨
        //customerKim.showCustomerInfo(); // 왜 안될까? c++에서는 가능
    }

}