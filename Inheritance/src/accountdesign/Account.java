
package accountdesign;

import java.util.ArrayList;

public class Account {
private String owner;

    public String getOwner() {
        return owner;
    }
private int balance;
private int number;

ArrayList<Transaction> transactions;
 private static int nAccounts=0;  
    public Account(String owner){
        this.owner=owner;
        balance=0;
        nAccounts++;
        number=nAccounts;
        transactions=new ArrayList<>();
        transactions.add(new Creation());
    }
    public void deposit (int amount){
        balance=balance+amount;
        transactions.add(new Deposit(amount));
    }
    public void withdraw (int amount){
        if(amount<=balance){
            balance=balance-amount;
               transactions.add(new Withdrawal(amount));
        }
        else{
            System.out.println("not enough money");
        }
    }
    public void transferTo(int amount, Account other){
        if(amount<=balance){
        balance=balance-amount;
        other.balance=other.balance+amount;
        this.transactions.add(new TransferTo(amount,other));
        other.transactions.add(new TransferFrom(amount, this));
        }
        else{
            System.out.println("not enough money");
        }
    }
    public void printAll(){
        System.out.println(number+"/"+owner+": "+balance);
        for (Transaction t : transactions) {
            t.print();
        }
    }
}
