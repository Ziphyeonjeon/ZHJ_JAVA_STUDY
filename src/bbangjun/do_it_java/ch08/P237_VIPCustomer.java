package bbangjun.do_it_java.ch08;

public class P237_VIPCustomer extends P234_Customer{ // 기본 고객의 메소드와 변수들을 상속 받기
    private int agentID;
    double saleRatio;

    public P237_VIPCustomer(){ // 디폴트 생성자
        customerGrade="VIP";
        bonusRatio=0.05;
        saleRatio=0.1;
    }

    public int getAgentID(){
        return agentID;
    }
}
