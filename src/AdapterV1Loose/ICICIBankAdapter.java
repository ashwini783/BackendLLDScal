package AdapterV1Loose;

public class ICICIBankAdapter implements BankAPI{
    ICICIBankAPI yb=new ICICIBankAPI();

    @Override
    public int checkBalance() {
        return yb.checkBalance();
    }

    @Override
    public void transferMoney(int money) {
         yb.TransferMoney();
    }
}
