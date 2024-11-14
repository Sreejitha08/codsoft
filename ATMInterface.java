import java.util.Scanner;
class Account{
    protected double balance;
    void Account(double amount)
    {
        balance=amount;
    }
    public void getbalance()
    {
         System.out.println("Your balance is: "+balance);
    }
    public void deposit(double amount)
    {
       
         if(amount>0)
         {
         balance=balance+amount;
         System.out.println("Amount successfully deposited");
         }
         else{
            System.out.println("Invalid amount,please recheck");
         }

    }
    public void withdraw(double amount)
    {
        if(amount>0 && amount<=balance)
        {
            balance=balance-amount;
            System.out.println("Amount successfully withdrawn");
        }
        else{
            System.out.println("Invalid transaction or insufficient funds");
        }
    }
}
class ATM extends Account{
    void menu()
    {
       System.out.println("Welcome to the ATM menu!");
       System.out.println("1.Check balance");
       System.out.println("2.Withdraw money");
       System.out.println("3.Deposit money");
       System.out.println("4.Exit menu");
    }
    void transaction(int choice,Scanner o)
    {
        switch(choice)
        {
            case 1:{
                System.out.println("Your current balance is: "+balance);
                break;
            }
            case 2:{
                System.out.println("Enter amount to withdraw");
                double n=o.nextDouble();
                withdraw(n);
                System.out.println("Do you want to check balance?If yes enter 1");
                int c=o.nextInt();
                if(c==1)
                {
                    getbalance();
                }
                break;
            }
            case 3:{
                System.out.println("Enter amount to deposit");
                double n=o.nextDouble();
                deposit(n);
                System.out.println("Do you want to check balance?If yes enter 1");
                int c=o.nextInt();
                if(c==1)
                {
                    getbalance();
                }
                break;
            }
            case 4:{
                System.out.println("Exiting the ATM.Thankyou!!");
                break;
            }
            default:
            System.out.println("Invalid choice please check again!");
        }
    }
}
class ATMInterface{
    public static void main(String[] args) {
        ATM a=new ATM();
        String s="true";
        System.out.println("Enter initial amount");
        Scanner o =new Scanner(System.in);
        double money=o.nextDouble();
        a.Account(money);
        while(s=="true")
        {
        a.menu();
        System.out.println("Enter choice");
        int choice=o.nextInt();
        a.transaction(choice,o);
        if(choice==4)
        {
            break;
        } 
        }
        System.out.println("Thankyou for using");
    }
}