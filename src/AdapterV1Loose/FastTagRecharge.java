package AdapterV1Loose;

public class FastTagRecharge {

    int recharge(BankAPI yb,int amount){
        if(yb.checkBalance()>=amount){
            System.out.println("Recharge Successful");
            return 1;
        }
        System.out.println("Insufficient funds");
        return -1;

    }
}
