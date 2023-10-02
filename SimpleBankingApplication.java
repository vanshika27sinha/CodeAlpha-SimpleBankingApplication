package CWH09;
import java.util.Scanner;

public class BANKNEW {
    static double balance = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        while (option != 4) {
            System.out.println("Welcome to the bank of java");
            System.out.println("1.Check balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.println("Enter a option");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    checkbalance();
                break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                case 4:
                    exit();
                default:
                    System.out.println("invalid option try again");
                    break;

            }
        }

    }
    public static void checkbalance(){
        System.out.println("your current balance is "+balance);
    }
    public static  void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the amount to deposit");
        double amount = sc.nextDouble();
        balance=balance+amount;
        System.out.println(amount + "has been deposited to your account");
        checkbalance();
    }public static void withdraw(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount to withdraw");
        double amount=sc.nextDouble();
        if(amount>balance){
            System.out.println("insufficent balance");

        }else{
            balance-=amount;
            System.out.println(amount+"has been withdraw from your account");
        }
        checkbalance();

    }
    public static void exit(){
        System.out.println("Thankyou for banking with us have a great day");

    }

}
