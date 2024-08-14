import java.util.Scanner;


class Bank_account{
    String Holder_name;
    long account_no;
    long balance;
    int Pin;

    Bank_account (String Holder_name,long account_no,long balance,int Pin){
        this.Holder_name = Holder_name;
        this.account_no = account_no;
        this.balance = balance;
        this.Pin = Pin;
    }

    public void deposit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account NO: ");
        long No = sc.nextInt();
        System.out.println("Enter Amount to deposit: ");
        long bal = sc.nextInt();
        if (No == this. account_no){
            balance += bal;
            System.out.println(bal+" Amount deposited successfully");
            System.out.println("Your current ammount is "+balance);
        }else{
            System.out.println("Invalid Account Number");
        }
        sc.close();
    } 

    public void withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account NO: ");
        long No = sc.nextInt();
        System.out.println("Enter Amount to withdraw: ");
        long bal = sc.nextInt();
        if (No == this.account_no){
            if (bal <= this.balance){
                balance -= bal;
                System.out.println(bal +" Ammount withdrawll Successfull");
                System.out.println("Your Remaining Balance is "+balance);
            }else{
                System.out.println("Insufficient Balance");
            }
        }else{
            System.out.println("Invalid Account number!");
        }
        sc.close();
    }

    public void check_balance(){
        System.out.println("Your balance is: "+ this.balance);
    }

    public void displaying_account_details(){
        System.out.println("Account Holder Name: "+ this.Holder_name);
        System.out.println("Account Number: "+ this.account_no);
        System.out.println("Account Balance: "+ this.balance);
    }
    
}

public class Banking_System{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ///System.out.println("Enter Account holder name : ");
        ///String name = sc.nextLine();
        ///System.out.println("Enter Account Number: ");
        ///long acc_no = sc.nextLong();
        ///System.out.println("Enter Initial Balance: ");
        ///long bal = sc.nextLong();
        ///System.out.println("Enter your Pin : ");
        ///int pin = sc.nextInt();
        Bank_account a = new Bank_account("Umar",98765,150000,7899);
        Bank_account a1 = new Bank_account("Ali",12345,100000,0000);
        Bank_account a2 = new Bank_account("rahul",54321,10000,1111);
        System.out.println("Welcome to the bank...");
        System.out.println("Enter your account number: ");
        long accno = sc.nextLong();
        System.out.println("Enter your Pin");
        int pas = sc.nextInt();
        if (pas == a.Pin && accno ==a.account_no){
            System.out.println("Enter choice: \t1.Details \t2.Balance checking \t3.Withdraw \t4.Deposit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                a.displaying_account_details();
                break;
                
                case 2:
                a.check_balance();
                break;

                case 3:
                a.withdraw();
                break;

                case 4:
                a.deposit();
                break;
            }
        }else if(pas == a1.Pin && accno ==a1.account_no){
            System.out.println("Enter choice: \t1.Details \t2.Balance checking \t3.Withdraw \t4.Deposit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                a1.displaying_account_details();
                break;
                
                case 2:
                a1.check_balance();
                break;

                case 3:
                a1.withdraw();
                break;

                case 4:
                a1.deposit();
                break;
            }
        }else if(pas == a2.Pin && accno ==a2.account_no){
            System.out.println("Enter choice: \t1.Details \t2.Balance checking \t3.Withdraw \t4.Deposit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                a2.displaying_account_details();
                break;
                
                case 2:
                a2.check_balance();
                break;

                case 3:
                a2.withdraw();
                break;

                case 4:
                a2.deposit();
                break;
            }
        }else{
            System.out.println("Invalid Pin or Account Number");
        }     
    }
}