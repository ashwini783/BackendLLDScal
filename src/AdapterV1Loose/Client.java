package AdapterV1Loose;

import java.util.Scanner;

public class Client {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the name Bank");
        String bankName=sc.nextLine();
        System.out.println("Entered");
        BankAPI yb=BankApiFactory.getBankAPI(bankName);
        PhonePe ph=new PhonePe(yb);

    }
}
