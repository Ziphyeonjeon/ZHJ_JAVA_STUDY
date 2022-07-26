package ohyeong.do_it_java.ch08;

public class VIPCustomer extends  Customer{
    private int agentID;
    double saleRatio;

//    public VIPCustomer(){
//        customerGrade = "VIP";
//        bonusRatio = 0.05;
//        saleRatio = 0.1;
//    }

    @Override
    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);
    }

    public VIPCustomer(int customerID, String customerName, int agentID){
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;
    }

    public int getAgentID(){
        return agentID;
    }

    public String showCustomerInfo(){
        return super.showCustomerInfo() + "담당 상담원 아이디는" + agentID + "입니다.";
    }
}
