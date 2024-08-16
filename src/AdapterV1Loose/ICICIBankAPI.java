package AdapterV1Loose;

public class ICICIBankAPI {
    int transferAmount=0;

    public int checkBalance(){
        return 100;
    }
    public void TransferMoney(){
        System.out.println("Money is transferred via ICICIBank!");
    }
    public void setTransferAmount(int amount){
        transferAmount = amount;
    }
}
