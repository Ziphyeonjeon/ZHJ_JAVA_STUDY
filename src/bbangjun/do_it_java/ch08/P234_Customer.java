package bbangjun.do_it_java.ch08;

public class P234_Customer {
    protected int customerID; // 고객 아이디
    protected String customerName; // 고객 이름
    protected String customerGrade; // 고객 등급
    int bonusPoint; // 보너스 포인트
    double bonusRatio; // 적립 비율

    public P234_Customer(){ // 디폴트 생성자
        customerGrade="SILVER"; // 기본 등급은 실버
        bonusRatio=0.01; // 보너스 포인트 기본 적립 비율
    }

    public int calcPrice(int price){
        bonusPoint +=price*bonusRatio; // 보너스 포인트 계산
        return price; // 가격 반환
    }

    public String showCustomerInfo(){ // 고객의 등급과 보너스 포인트 정보 반환
        return customerName + " 님의 등급은 "+customerGrade+"이며, 보너스 포인트는 "+bonusPoint+"입니다.";
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
}